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
import org.springframework.web.bind.annotation.RequestParam;

import com.sytSpring.model.Registrazione;
import com.sytSpring.model.Utente;
import com.sytSpring.service.ClassificaSistemaService;
import com.sytSpring.service.RegistrazioneService;
import com.sytSpring.service.SearchService;

@Controller
@RequestMapping("/cantanteController")
public class HomeCantanteController {


	@Autowired
	public HomeCantanteController() {
	
	}

	@RequestMapping(value = "/getClassifica", method = RequestMethod.GET)
	public String getClassifica(Model model) {
		return null;
	}

}