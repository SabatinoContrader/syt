package com.virtualpairprogrammers.servlets;

import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.services.LoginService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private LoginService loginService;

    public void service (HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
        loginService =  new LoginService();
        HttpSession session = request.getSession();
        String username = request.getParameter("username").toString();
        String password = request.getParameter("password").toString();
        session.setAttribute("utente", loginService.login(username, password));
        Utente u= (Utente) session.getAttribute("utente");
        if ( u!= null) {
        
        	if (u.getRuolo().compareTo("C")==0) {
        		getServletContext().getRequestDispatcher("/HomeCantante.jsp").forward(request,response);
        	}
        	else {
        		getServletContext().getRequestDispatcher("/HomeGiudice.jsp").forward(request,response);
        	}       
        }
        else
            
            getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
    }
    
}
