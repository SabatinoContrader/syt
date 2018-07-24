package com.sytSpring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sytSpring.service.ClassificaSistemaService;

@Controller
@RequestMapping("/giudiceController")
public class HomeGiudiceController {
	ClassificaSistemaService classSistService;
	ClassificaSistemaService css;

	@Autowired
	public HomeGiudiceController() {
	}
	
	@RequestMapping (value="/getClassifica",  method = RequestMethod.GET)
	public String logoutController (HttpServletRequest request) {
		this.css=new ClassificaSistemaService();
		
		return "classificaSistema";
		
	
	}
	
	

}
