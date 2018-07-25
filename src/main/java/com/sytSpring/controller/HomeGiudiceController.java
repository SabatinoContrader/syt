package com.sytSpring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sytSpring.model.Registrazione;
import com.sytSpring.service.ClassificaSistemaService;

@Controller
@RequestMapping("/giudiceController")
public class HomeGiudiceController {
	
	ClassificaSistemaService css;

	
	@Autowired
	public HomeGiudiceController(ClassificaSistemaService css) {
		this.css=css;
	}
	
	
	@RequestMapping (value="/getClassifica",method = RequestMethod.GET)
	public String getClassifica (Model model) {
		
		List<Registrazione> classificaSistema=css.getClassificaSistema();
		model.addAttribute("classificaRegistrazioni",classificaSistema);
		return "classificaSistema";
		
		
	
	}
	
	

}
