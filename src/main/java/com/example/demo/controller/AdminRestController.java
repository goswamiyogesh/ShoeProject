package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AdminDao;
import com.example.demo.model.Admin;

@RestController
public class AdminRestController {
 @Autowired
	AdminDao ad_dao;
 
 @PostMapping("/insertadminbe")
  public  Admin insert(@RequestBody Admin a) {
	 return ad_dao.admin_insert(a);
	}
 
 @GetMapping("/getalladminbe")
	public List<Admin> getall(){
		return ad_dao.getalladmin();
	}
 
}