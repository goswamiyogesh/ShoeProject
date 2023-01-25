package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ShoesDao;
import com.example.demo.model.Shoes;

@Controller
public class ShoesController {
	@Autowired
	ShoesDao  dao;
	
	@RequestMapping("/insert")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Shoes s=new Shoes();
		s.setId(Integer.parseInt(request.getParameter("id")));
		s.setName(request.getParameter("name"));
		s.setBrand(request.getParameter("brand"));
		s.setPrice(Double.parseDouble(request.getParameter("price")));
		Shoes sh=dao.insert(s);
		if(sh!=null) {
			mv.setViewName("display.jsp");
		}
		return mv;
	}
	
	@RequestMapping("/getallshoes")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Shoes> list=dao.getall();
	mv.setViewName("Shoeslist1.jsp");
	mv.addObject("list",list);	
		return mv;
	}
	
	@RequestMapping("/getallshoesuser")
	public ModelAndView displayAlluser(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Shoes> list=dao.getall();
	mv.setViewName("Shoeslist2.jsp");
	mv.addObject("list",list);	
		return mv;
	}
	
	@RequestMapping("/updateshoe")
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Shoes s=new Shoes();
		s.setId(Integer.parseInt(request.getParameter("shid")));
		s.setName(request.getParameter("name"));
		s.setBrand(request.getParameter("brand"));
		s.setPrice(Double.parseDouble(request.getParameter("price")));
		Shoes sh=dao.updateByName(s);
		if(sh!=null) {
			mv.setViewName("succ_update.jsp");
		}
		return mv;
}
	@RequestMapping("/deleteshoe")
	public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Shoes s=new Shoes();
		s.setId(Integer.parseInt(request.getParameter("shid")));
		dao.deletesh(s);
		mv.setViewName("succ_delete.jsp");
		return mv;
	}
	
	}
