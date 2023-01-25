package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Shoes;

public interface ShoesRepo extends JpaRepository<Shoes, Integer> {

}
