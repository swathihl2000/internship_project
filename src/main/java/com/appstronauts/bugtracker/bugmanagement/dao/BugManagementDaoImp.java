package com.appstronauts.bugtracker.bugmanagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appstronauts.bugtracker.bugmanagement.entity.BugCreation;
import com.appstronauts.bugtracker.bugmanagement.entity.BugManagement;
import com.appstronauts.bugtracker.bugmanagement.entity.BugResolve;
import com.appstronauts.bugtracker.bugmanagement.entity.Developer;

import jakarta.persistence.EntityManager;





@Repository
public class BugManagementDaoImp implements BugManagementDao {

	@Autowired
	private EntityManager entityManager;
	
	
	
	private BugCreation creation;
	
	private BugManagement management;
	
	public Session getSession() {
		Session session=entityManager.unwrap(Session.class);
		return session;
	}
	
	
	@Override
	public void save(BugCreation bugCreation) {
     getSession().saveOrUpdate(bugCreation);
     
     int bugnum=bugCreation.getId();
     creation=getSession().find(BugCreation.class, bugnum);
     
     management=new BugManagement(bugnum,creation.getBug_name(),creation.getBug_description(),getDeveloperId(),"Assigned",creation.getBug_type());
     
     getSession().saveOrUpdate(management);
     
     BugResolve resolve=new BugResolve(management.getAssignTo(),management.getbId(),management.getStatus());
	
     getSession().saveOrUpdate(resolve);
		
	}
	
	public List<BugManagement> findAll(){
		List<BugManagement> bugManagementList=getSession().createQuery("from BugManagement", BugManagement.class).getResultList();
		
	  return bugManagementList;
	}

	public List<Developer> findAllDevelopers(){
	
	List<Developer> developerslist=getSession().createQuery("from Developer", Developer.class).getResultList();
	
	return developerslist;
	}
	
	

	public int getDeveloperId() {
      int devId=0;
      
      for (Developer developer : findAllDevelopers()) {
    	  if(developer.getdType().toLowerCase().equals(creation.getBug_type().toLowerCase())){
    		  devId=developer.getdId();
    	  }
		
	}
		
		return devId;
	}
	
	
	public void updateBugResolve(BugResolve bugResolve) {
		management=getSession().find(BugManagement.class, bugResolve.getbId());
		
		if(!bugResolve.getStatus().toLowerCase().equals(management.getStatus().toLowerCase()) && (bugResolve.getdId()==management.getAssignTo())) {
		getSession().update(bugResolve);
		management.setStatus(bugResolve.getStatus());
		getSession().update(management);
	}
	}
	
	public void deleteBug(int bId) {
		
		BugManagement bugManagement=getSession().find(BugManagement.class, bId);
		BugResolve bugResolve=getSession().find(BugResolve.class, bId);
		
		if(bugManagement.getStatus().toLowerCase().equals("complete") ) {
			getSession().delete(bugResolve);
			getSession().delete(bugManagement);
			
					}
		
	}
	
	public BugManagement findById(int bId) {
		return getSession().find(BugManagement.class, bId);
		
	}
	
}
