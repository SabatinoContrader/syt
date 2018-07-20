package com.virtualpairprogrammers.servlets;

import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.services.RicercaCantanteDaCantanteService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class RicercaCantanteDaCantanteServlet extends HttpServlet {

    private RicercaCantanteDaCantanteService ricercaCantanteDaCantanteService;

    public void service (HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
    	ricercaCantanteDaCantanteService = new RicercaCantanteDaCantanteService();
    	List<Utente> cantanti = this.ricercaCantanteDaCantanteService.getAllCantanti(request.getParameter("username").toString());
        request.setAttribute("all_cantanti", cantanti);
        getServletContext().getRequestDispatcher("/ShowCantantiDaCantante.jsp").forward(request,response);
    
}

}