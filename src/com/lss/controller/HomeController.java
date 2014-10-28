package com.lss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lss.entity.UserEntity;
import com.lss.service.IUserService;

@Controller
@RequestMapping("homecontroller")  
public class HomeController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("index")
	public ModelAndView home(){
		List<UserEntity> list = userService.getAllUsers();
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("list", list);
		return modelAndView;
	}
	
}
