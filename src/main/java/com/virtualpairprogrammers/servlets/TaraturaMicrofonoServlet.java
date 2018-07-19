package com.virtualpairprogrammers.servlets;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtualpairprogrammers.model.Canzone;
import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.services.CanzoneService;

public class TaraturaMicrofonoServlet extends HttpServlet {
	private CanzoneService canzoneService;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			this.canzoneService=new CanzoneService();
			HttpSession session=request.getSession();
			session.setAttribute("canzonescelta", canzoneService.getCanzone(Integer.parseInt(request.getParameter("canzonescelta"))));
		
	     getServletContext().getRequestDispatcher("/taraturaMicrofono.jsp").forward(request, response);


	}
	
}
