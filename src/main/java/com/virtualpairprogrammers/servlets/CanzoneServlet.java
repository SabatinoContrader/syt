package com.virtualpairprogrammers.servlets;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtualpairprogrammers.model.Canzone;
import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.services.CanzoneService;


public class CanzoneServlet extends HttpServlet {
	CanzoneService canzoneService;


public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.canzoneService=new CanzoneService();
    Utente u=(Utente) request.getSession().getAttribute("utente");
   
    
    if(u!=null) {
    	List<Canzone> listaCanzoni=new LinkedList<Canzone>();
    	
    	listaCanzoni.addAll(canzoneService.getCanzoni(u));
    	request.setAttribute("listacanzoni", listaCanzoni);
    }

        getServletContext().getRequestDispatcher("/tutorialCantante.jsp").forward(request, response);


}
}
 

