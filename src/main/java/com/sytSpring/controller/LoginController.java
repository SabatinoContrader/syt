package com.sytSpring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sytSpring.converter.UtenteConverter;
import com.sytSpring.dto.UtenteDTO;
import com.sytSpring.model.Utente;
import com.sytSpring.service.LoginService;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/login")
public class LoginController {

	private LoginService loginService;
	private UtenteConverter utenteConverter;

	@Autowired
	public LoginController(LoginService loginService, UtenteConverter utenteConverter) {
		this.loginService = loginService;
		this.utenteConverter = utenteConverter;
	}

	@RequestMapping(value = "/loginControl", method = RequestMethod.POST)
	public UtenteDTO loginController(@RequestBody UtenteDTO utenteDTO) {
		
		Utente loginUtente = utenteConverter.convertToEntity(utenteDTO);
		Utente utente = loginService.login(loginUtente.getUsername(), loginUtente.getPassword());
		UtenteDTO dUtente=new UtenteDTO();
		if (utente != null) {
			// modificare perchè ora viene gestito dal frontend;

			if (utente.getRuolo().toString().compareTo("C") == 0 || utente.getRuolo().toString().compareTo("G") == 0) {
				dUtente = utenteConverter.convertToDTO(utente);
				// ma la session la lasciamo nel frontend??? Si
				
			}

		}
		else {
			dUtente=null;
		}
	
		return dUtente;
		
	}
}