package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Shoes;
import com.example.demo.repository.ShoesRepo;

@Service
public class ShoesDao {
	@Autowired
  ShoesRepo sho_repo;
	//INSERT Shoes HERE
		public Shoes insert(Shoes s)
		{
			return sho_repo.save(s);
		}
		
	  //Shoes list
		public List<Shoes> getall(){
			return sho_repo.findAll();
		}
		
		//insert all list of object
		public List<Shoes> insertall(List<Shoes> sho){
				return sho_repo.saveAll(sho);
			}

		//get record by id
		public Optional<Shoes> getbyid(int id){
				return sho_repo.findById(id);
			}
		
		
		
		public void deletesh(Shoes s) {
				sho_repo.delete(s);
			}
		
		
		//delete a record with id 
		public void deletebyid(int id) {
			sho_repo.deleteById(id);
		}
		
	//  update  a record by name
		public Shoes updateByName(Shoes s) {
			Shoes sh=sho_repo.findById(s.getId()).orElse(null);
			sh.setName(s.getName());
			sh.setBrand(s.getBrand());
			sh.setPrice(s.getPrice());  
		    return	sho_repo.save(sh);
			
		}


}
