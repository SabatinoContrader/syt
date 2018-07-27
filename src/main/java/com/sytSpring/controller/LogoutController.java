package com.sytSpring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/logout")
public class LogoutController {
	
	
	@Autowired
	private LogoutController() {
		
	}
	
	@RequestMapping (value="/out",  method = RequestMethod.GET)
	public String logoutController (HttpServletRequest request) {
		 HttpSession session = request.getSession();
		//distruggo la session! e poi 
		 session.invalidate();
		//ritorno la pagina di index dopo il logout
		return "index";
		
	
	}


}
