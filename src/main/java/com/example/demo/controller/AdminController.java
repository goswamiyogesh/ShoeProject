package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AdminDao;
import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepo;

@Controller
public class AdminController {
	@Autowired
	AdminRepo ad_repo;
	@Autowired
    AdminDao ad_dao;
	
	@RequestMapping("/")
	public ModelAndView displaypage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}

	//Admin  can  apply for login credencial's here
	
	@RequestMapping("/insertadmin")
	public ModelAndView admin_insert(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv= new ModelAndView();
		Admin A= new Admin();
		A.setUsername(request.getParameter("username"));
		A.setPassword(request.getParameter("password"));
		Admin aa=ad_dao.admin_insert(A);
		if(aa!=null) {
			mv.setViewName("reg_succ_admin.jsp");
		}
		return mv;
	}

	
	@RequestMapping("/ad_login")
	public ModelAndView ad_login(HttpServletRequest request, HttpServletResponse response) {
	
		ModelAndView mv= new ModelAndView();
		String username = request.getParameter("username");
        String password = request.getParameter("password");

		Admin adm=ad_repo.findByusernamepassword(username, password);
		if(adm!=null)
		{
			mv.setViewName("admin_display.jsp");
			mv.addObject("adm",adm);
		}
		else {
			mv.setViewName("fail.jsp");
		}
	
		return mv;
	}
	
	@RequestMapping("/getalladmin")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Admin> list=ad_dao.getalladmin();
	mv.setViewName("display_reg_admin.jsp");
	mv.addObject("list",list);	
		return mv;
	}

	
	
	}

