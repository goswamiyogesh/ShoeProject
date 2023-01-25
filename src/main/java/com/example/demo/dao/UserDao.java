package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserDao {
   @Autowired
	UserRepo u_repo;
   
 //USER-INSERTION-CODE
 	public User user_insert(User u)
 	{
 		return u_repo.save(u);
 	}
 	
 	
 	//user list
 		public List<User> getallUser(){
 			return u_repo.findAll();
 		}
 		
 		
 		//delete a record with id 
 		
 		public void deletebyuser_id(int id) {
 				u_repo.deleteById(id);
 			}
 		
 		
}