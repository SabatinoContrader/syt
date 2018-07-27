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
import com.sytSpring.service.ClassificaSistemaService;
import com.sytSpring.service.RegistrazioneService;
import com.sytSpring.service.SearchService;

@Controller
@RequestMapping("/giudiceController")
public class HomeGiudiceController {
	private SearchService searchService;
	private ClassificaSistemaService css;
	private RegistrazioneService registrazioneService;

	@Autowired
	public HomeGiudiceController(ClassificaSistemaService css, SearchService searchService, RegistrazioneService registrazioneService) {
		this.css = css;
		this.searchService = searchService;
		this.registrazioneService = registrazioneService;
	}

	@RequestMapping(value = "/getClassifica", method = RequestMethod.GET)
	public String getClassifica(Model model) {

		List<Registrazione> classificaSistema = css.getClassificaSistema();
		model.addAttribute("classificaRegistrazioni", classificaSistema);
		return "classificaSistema";

	}

	@RequestMapping(value = "/SearchCantante", method = RequestMethod.GET)
	public String searchCantante(@RequestParam("username") String username, Model model) {
		// System.out.println(username);
		List<Utente> cantanti = new ArrayList<Utente>();
		cantanti = searchService.searchCantante(username);
		//System.out.println(cantanti.size());
		model.addAttribute("listUtenti", cantanti);
		return "showCantanti";

	}

	@RequestMapping(value = "/ascolta", method = RequestMethod.GET)
	public String sceltaController(@RequestParam("username") String username, Model model) {
		//System.out.println(username);
		List<Registrazione> registrazioni = new ArrayList<Registrazione>();
		registrazioni = registrazioneService.searchRegistrazioni(username);
		//System.out.println(registrazioni.size());
		model.addAttribute("listRegistrazioni", registrazioni);
		return "ascolta";

	}

}