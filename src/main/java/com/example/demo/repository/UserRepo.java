package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.User;

public interface UserRepo  extends JpaRepository<User, Integer>{
	@Query("select u from User u where u.user_name=?1 and u.email=?2 ")
	public User findbyuser_nameemail(String user_name, String email);
	
	
}
