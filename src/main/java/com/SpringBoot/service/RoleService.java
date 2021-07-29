package com.SpringBoot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.entity.Role;
import com.SpringBoot.exception.RoleRecordNotFoundException;
import com.SpringBoot.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	public Role createRole(Role role) {
		return roleRepository.save(role);
	}

	public List<Role> getAllRole() {
		Iterable<Role> iterable = roleRepository.findAll();
		List<Role> roleList = new ArrayList<Role>();
		iterable.forEach(roleList::add);
		return roleList;

	}

	public Role getRolebyId(int id) {
		Role obj = null;
		boolean flag = roleRepository.existsById(id);
		System.out.println(flag);
		if (flag == false)
			throw new RoleRecordNotFoundException("Role with id not found..");
		else if (flag == true) {
			Optional<Role> optional = roleRepository.findById(id);
			obj = optional.get();
			return obj;
		}
		return obj;
		
	}

	public Boolean deleteRole(int id) {
		if (!roleRepository.existsById(id))
			throw new RoleRecordNotFoundException("Role with id not found..");
		else {
			roleRepository.deleteById(id);
			return true;
		}
	
	}
	
	

}
