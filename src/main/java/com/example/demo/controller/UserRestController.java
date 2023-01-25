package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@RestController
public class UserRestController {
	@Autowired
      UserDao u_dao;
	@PostMapping("/insertuser")
	public User insert(@RequestBody User u) {
		return u_dao.user_insert(u);
	}
	
	@GetMapping("/getalluser")
	public List<User> getall(){
		return u_dao.getallUser();
	}
	
		@DeleteMapping("deletebyuser_id/{id}")
		public void deletebyid(@PathVariable("id") int id) {
			u_dao.deletebyuser_id(id);
			
		}
}
