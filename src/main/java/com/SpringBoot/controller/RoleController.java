package com.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.entity.Role;
import com.SpringBoot.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@PostMapping(value = "/saveRole", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Role> saveRole(@RequestBody Role role) {
		Role obj = roleService.createRole(role);
		return new ResponseEntity<Role>(obj, HttpStatus.CREATED);
	}

	@GetMapping(value = "/getAllRole", produces = "application/json")
	public List<Role> getAllRole() {
		return roleService.getAllRole();
	}

	@GetMapping(value = "/getRole/{id}", produces = "application/json")
	public ResponseEntity<Role> getRolebyId(@PathVariable int id) {
		Role dev = roleService.getRolebyId(id);
		return new ResponseEntity<Role>(dev, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteRole/{id}")
	public ResponseEntity<Boolean> deleteRole(@PathVariable int id) {
		Boolean flag = roleService.deleteRole(id);
		return new ResponseEntity<Boolean>(flag, HttpStatus.ACCEPTED);
	}



}
