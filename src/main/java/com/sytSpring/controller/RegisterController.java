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
        
        
      //  System.out.println(nome+" "+ cognome +"  "+dataNascita+ ""+luogoNascita+"  "+sesso+"  "+telefono+"  "+ username+ "  "+password+"  "+ruolo+"  "+genere);
        Utente u=new Utente(0,nome,cognome,email,dataNascita,luogoNascita,sesso,genere,1, telefono,ruolo,0,0, username,password,0,0);
        if (registerService.insert(u))
        {
        	
        	return "index";		
        }
        else
        {
        	
        	return "register";
        }
        
        
        /*
        if (userService.insertUser(newUser))
        {
        	model.addAttribute("feedback", "success");
        	return "index";		
        }else
        {
        	model.addAttribute("feedback", "failed");
        	return "index";
        }
	}
         * 
         * 
         * 
         * 
         * 
         * if (nome != null || cognome != null || email != null || dataNascita != null|| luogoNascita != null|| sesso != null|| telefono != null || username != null || password != null|| ruolo != null|| genere != null) {
            if (registerService.insert(new Utente(cognome, dataNascita, email, genere, luogoNascita, nome, password, ruolo, sesso, telefono, username)) != null)
                return "index";
            else
                return "register";
        }
        return "register";
            
        }*/
	
	
	
   /* public String RegisterController (@RequestParam("nome") String nome, @RequestParam("cognome") String cognome,@RequestParam("email") String email,@RequestParam("datanascita") String dataNascita,@RequestParam("luogonascita") String luogoNascita,@RequestParam("sesso") String sesso,@RequestParam("phonenumber") String telefono,@RequestParam("username") String username, @RequestParam("password") String password,@RequestParam("ruolo") String ruolo,@RequestParam("genere") String genere, HttpServletRequest request, Map<String, Object> model) {
		
		if (nome != null || cognome != null || email != null || dataNascita != null|| luogoNascita != null|| sesso != null|| telefono != null || username != null || password != null|| ruolo != null|| genere != null) {
        if (registerService.insert(new Utente(cognome, dataNascita, email, genere, luogoNascita, nome, password, ruolo, sesso, telefono, username)) != null)
            return "index";
        else
            return "register";
    }
    return "register";
        
    }*/
        
	
}}
/*



	@RequestMapping(value = "/registered", method = RequestMethod.POST)
	public String registered(HttpServletRequest request, Model model ) 
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String birthdate = request.getParameter("birthdate");
		String birthplace = request.getParameter("birthplace");
		String address = request.getParameter("address");
		boolean handicapped = Boolean.valueOf(request.getParameter("handicapped"));
		String type = "driver";		
		
		User newUser = new User(username, password, type, name, surname, birthdate, birthplace, address, handicapped);

        if (userService.insertUser(newUser))
        {
        	model.addAttribute("feedback", "success");
        	return "index";		
        }else
        {
        	model.addAttribute("feedback", "failed");
        	return "index";
        }
	}
}*/

