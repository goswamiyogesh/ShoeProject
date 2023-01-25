package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;

import com.example.demo.repository.AdminRepo;

@Service
public class AdminDao {
	@Autowired
AdminRepo ad_repo;
	//registration of admin
	public Admin admin_insert(Admin a) {
		return ad_repo.save(a);
	}
	
	//admin list
		public List<Admin> getalladmin(){
			return ad_repo.findAll();
		}
		
		
		
	
	
}
