package com.sytSpring.controller;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sytSpring.model.Utente;
import com.sytSpring.service.RegisterService;



@Controller
@RequestMapping("/Register")
public class RegisterController {
private RegisterService registerService;
	
	@Autowired
	public RegisterController (RegisterService registerService) {
        this.registerService = registerService;
    }

	@RequestMapping(value="/registerControl", method = RequestMethod.GET)
	public String register(HttpServletRequest request, Model model ) {
		return "register";}
	
	@RequestMapping(value = "/registered", method = RequestMethod.POST)
	public String reg(HttpServletRequest request, Model model ) {
		
		
		String nome = request.getParameter("nome").toString();
        String cognome = request.getParameter("cognome").toString();
        String email = request.getParameter("email").toString();
        String dataNascita = request.getParameter("datanascita").toString();
        String luogoNascita = request.getParameter("luogonascita").toString();
        String sesso = request.getParameter("sesso").toString();
        String telefono = request.getParameter("phonenumber").toString();
        String username = request.getParameter("username").toString();
        String password = request.getParameter("password").toString();
        String ruolo = request.getParameter("ruolo").toString();
        String genere = request.getParameter("genere").toString();
        
        
        Utente u=new Utente(0,nome,cognome,email,dataNascita,luogoNascita,sesso,genere,1, telefono,ruolo,0,0, username,password,0,0);
        if (registerService.insert(u))
        {
        	
        	return "registerok";		
        }
        else
        {
        	
        	return "register";
        }
        
	}
}

