package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ShoesDao;
import com.example.demo.model.Shoes;


@RestController
public class ShoesRestController {
	@Autowired
    ShoesDao dao;
	@PostMapping("/insert")
	public Shoes insert(@RequestBody Shoes s) {
		return dao.insert(s);
	}

	@GetMapping("/getall")
	public List<Shoes> getall(){
		return dao.getall();
	}
	//insert a list of objects
	@PostMapping("/insertall")
	public List<Shoes> insertall(@RequestBody List<Shoes> sho){
		return dao.insertall(sho);
	}
	//get record by id
	@GetMapping("/getbyid/{id}")
	public Optional<Shoes> getbyid(@PathVariable("id") int id){
		return dao.getbyid(id);
	}
	
	@DeleteMapping("deletebyid/{id}")
	public String deletebyid(@PathVariable("id") int id) {
		dao.deletebyid(id);
		return "deleted the id value of "+ id;
	}
	
	@PutMapping("/update")
	public Shoes updateByName(@RequestBody Shoes s) {
		return dao.updateByName(s);
	}

}
