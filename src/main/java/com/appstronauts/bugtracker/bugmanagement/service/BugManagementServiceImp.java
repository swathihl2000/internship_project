package com.appstronauts.bugtracker.bugmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appstronauts.bugtracker.bugmanagement.dao.BugManagementDao;
import com.appstronauts.bugtracker.bugmanagement.entity.BugCreation;
import com.appstronauts.bugtracker.bugmanagement.entity.BugManagement;
import com.appstronauts.bugtracker.bugmanagement.entity.BugResolve;

import jakarta.transaction.Transactional;

@Service
public class BugManagementServiceImp implements BugManagementService {
	
	@Autowired
	private BugManagementDao bugCreationDao;

	@Override
	@Transactional
	public void save(BugCreation bugCreation) {
     	String validate=bugCreation.getBug_type().toLowerCase().replaceAll("//s", "");
     	if(validate.equals("frontend")||validate.equals("backend")||validate.equals("database")) {
     		bugCreationDao.save(bugCreation);
     	}
	}

	@Override
	public List<BugManagement> findAll() {
		
		return bugCreationDao.findAll();
	}

	@Override
	@Transactional
	public void updateBugResolve(BugResolve bugResolve) {

		bugCreationDao.updateBugResolve(bugResolve);
	}

	@Override
	@Transactional
	public void deleteBug(int bId) {
 
		bugCreationDao.deleteBug(bId);
	}

	@Override
	public BugManagement findById(int bId) {

		return bugCreationDao.findById(bId);
	}

}
