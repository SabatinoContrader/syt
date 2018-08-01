package com.sytSpring.controller;
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

import com.sytSpring.converter.RegisterConverter;
import com.sytSpring.dto.RegisterDTO;
import com.sytSpring.dto.UtenteDTO;
import com.sytSpring.model.Utente;
import com.sytSpring.service.RegisterService;


@CrossOrigin(value = "*")
@RestController
@RequestMapping("/Register")
public class RegisterController {
private RegisterConverter registerConverter;
private RegisterService registerService;
	
	@Autowired
	public RegisterController (RegisterConverter registerConverter,RegisterService registerService) {
		 this.registerConverter = registerConverter;
		this.registerService = registerService;
       
    }

	@RequestMapping(value="/registerControl", method = RequestMethod.GET)
	public String register(HttpServletRequest request, Model model ) {
		return "register";}
	
	@RequestMapping(value = "/registered", method = RequestMethod.POST)
	public RegisterDTO reg(@RequestBody RegisterDTO registerDTO ) {
		
		Utente nuovoUtente=registerConverter.convertToEntity(registerDTO);
        Utente inserito=registerService.insert(nuovoUtente);
        RegisterDTO regDto=null;
        if(inserito!=null) {
        	regDto=registerConverter.convertToDTO(inserito);
        }
		return  regDto;

	}
}

