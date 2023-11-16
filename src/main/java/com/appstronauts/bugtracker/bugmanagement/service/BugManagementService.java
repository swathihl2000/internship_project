package com.appstronauts.bugtracker.bugmanagement.service;

import java.util.List;

import com.appstronauts.bugtracker.bugmanagement.entity.BugCreation;
import com.appstronauts.bugtracker.bugmanagement.entity.BugManagement;
import com.appstronauts.bugtracker.bugmanagement.entity.BugResolve;

public interface BugManagementService {

	public  void save(BugCreation bugCreation);
    
    public List<BugManagement> findAll();
    
    public void updateBugResolve(BugResolve bugResolve);
    
    public void deleteBug(int bId);
    
    public BugManagement findById(int bId) ;
	
}
