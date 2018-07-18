package com.virtualpairprogrammers.servlets;

import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.services.RicercaCantanteService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class RicercaCantanteServlet extends HttpServlet {

    private RicercaCantanteService ricercaCantanteService;

    public void service (HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
    	ricercaCantanteService = new RicercaCantanteService();
    	List<Utente> cantanti = this.ricercaCantanteService.getAllCantanti(request.getParameter("username").toString());
    	//List<Utente> cantanti = this.ricercaCantanteService.getAllCantanti("mario");
        request.setAttribute("all_cantanti", cantanti);
        getServletContext().getRequestDispatcher("/ShowCantanti.jsp").forward(request,response);
    
}
}