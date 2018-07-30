package com.sytSpring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sytSpring.model.Registrazione;
import com.sytSpring.model.Utente;
import com.sytSpring.service.ClassificaGiudiceService;
import com.sytSpring.service.ClassificaSistemaService;
import com.sytSpring.service.RegistrazioneService;
import com.sytSpring.service.SearchService;

@Controller
@RequestMapping("/cantanteController")
public class HomeCantanteController {

private SearchService searchService;
private ClassificaGiudiceService css;

	@Autowired
	public HomeCantanteController(ClassificaGiudiceService css, SearchService searchService) {
		this.css = css;
		this.searchService = searchService;
	}

	@RequestMapping(value = "/getClassifica", method = RequestMethod.GET)
	public String getClassifica(Model model) {
		List<Registrazione> classificaGiudice= new ArrayList<Registrazione>();
		model.addAttribute("classificaRegistrazioniGiudice", classificaGiudice);
		return "classificaGiudice";
	}
	
	
	@RequestMapping(value = "/SearchCantante", method = RequestMethod.GET)
	public String searchCantante(@RequestParam("username") String username, Model model) {
		List<Utente> cantanti = new ArrayList<Utente>();
		cantanti = searchService.searchCantante(username);
		model.addAttribute("listUtenti", cantanti);
		return "showCantantiDaCantante";

	}
	
	
	
	
	}

