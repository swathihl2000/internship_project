package com.appstronauts.bugtracker.bugmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appstronauts.bugtracker.bugmanagement.entity.BugCreation;
import com.appstronauts.bugtracker.bugmanagement.entity.BugManagement;
import com.appstronauts.bugtracker.bugmanagement.entity.BugResolve;
import com.appstronauts.bugtracker.bugmanagement.service.BugManagementService;

@RestController
@RequestMapping("/api")
public class BugManagamentController {

	
	@Autowired
	private BugManagementService bugManagementService;
	
	
	@PostMapping("/bugmanagement")
	public  void save(@RequestBody BugCreation bugCreation) {
		bugManagementService.save(bugCreation);
	}
	
	@GetMapping("/bugmanagement")
	public List<BugManagement> findAll(){
		return bugManagementService.findAll();
	}
	@GetMapping("/bugmanagement/{bId}")
	public BugManagement findById(@PathVariable int bId) {
		return bugManagementService.findById(bId);
	}

	
	@PutMapping("/bugmanagement")
	public void updateBugResolve(@RequestBody BugResolve bugResolve) {
		bugManagementService.updateBugResolve(bugResolve);
	}
	
	@DeleteMapping("/bugmanagement/{bId}")
	public void deleteBug(@PathVariable int bId) {
		bugManagementService.deleteBug(bId);
	}
	
		
}
