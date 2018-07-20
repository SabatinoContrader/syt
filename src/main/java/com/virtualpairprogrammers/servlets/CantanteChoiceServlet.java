package com.virtualpairprogrammers.servlets;

import com.virtualpairprogrammers.model.Registrazione;
import com.virtualpairprogrammers.services.AscoltaService;
import com.virtualpairprogrammers.services.RegistrazioneVocaleService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class CantanteChoiceServlet extends HttpServlet 
	{
	private AscoltaService ascoltaService;
	private RegistrazioneVocaleService registrazioneVocaleService;
	
    public void service (HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
    	String choice = request.getParameter("operazione").toString();
    	String username = request.getParameter("username").toString();

    	if (choice.compareTo("vota") == 0) {
    		registrazioneVocaleService = new RegistrazioneVocaleService();
    		List<Registrazione> registrazioni = this.registrazioneVocaleService.getRegistrazioni(username);
            request.setAttribute("all_registrazioni", registrazioni);
    		getServletContext().getRequestDispatcher("/registrazioneCantante.jsp").forward(request,response);
    	}
    	else {
    		ascoltaService = new AscoltaService();
        	List<Registrazione> registrazioni = this.ascoltaService.getRegistrazioni(username);
            request.setAttribute("all_registrazioni", registrazioni);
    		getServletContext().getRequestDispatcher("/ascoltaCantante.jsp").forward(request,response);
    	}
    }
}
