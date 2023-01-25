package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
	
	@Query("select admin from Admin admin where admin.username=?1 and admin.password=?2")
	public Admin findByusernamepassword(String username, String password);
	
}
