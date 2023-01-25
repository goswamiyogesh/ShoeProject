package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Controller
public class UserController {
@Autowired
UserDao u_dao;
@Autowired
UserRepo u_repo;

@RequestMapping("/insertuser")
public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	User u=new User();
	u.setUser_id(Integer.parseInt(request.getParameter("user_id")));
	u.setUser_name(request.getParameter("user_name"));
	u.setPhone(Integer.parseInt(request.getParameter("phone")));
	u.setEmail(request.getParameter("email"));
	User us=u_dao.user_insert(u);
	if(us!=null) {
		mv.setViewName("reg_succ_user.jsp");
	}
	return mv;
}


@RequestMapping("/getalluser")
public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
List<User> list=u_dao.getallUser();
mv.setViewName("display_reg_user.jsp");
mv.addObject("list",list);	
	return mv;
}

//USER LOGIN USING THIS CODE
	
	@RequestMapping("/user_login")
	public ModelAndView user_login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		String user_name = request.getParameter("user_name");
		String email =request.getParameter("email");
		
		     User use=u_repo.findbyuser_nameemail(user_name, email);
			if(	use!=null) {
			mv.setViewName("user_display.jsp");
			mv.addObject("use",use);
}	
			else {
				mv.setViewName("failuser.jsp");
			}
              return mv;
}
}