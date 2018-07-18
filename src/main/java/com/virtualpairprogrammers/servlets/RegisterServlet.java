package com.virtualpairprogrammers.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.services.RegisterService;




public class RegisterServlet extends HttpServlet {
	RegisterService registerService;


public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.registerService=new RegisterService();
    
    if (request != null) {
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
        String avatar = request.getParameter("avatar").toString();
        Utente u=new Utente(0,nome,  cognome,  email,  luogoNascita,  dataNascita,  sesso,  genere,  0,  1,  telefono,  password,  username,  ruolo,  false,  avatar);
        if (registerService.register(u))
        	//inserisci messaggio di registrazione effettuata con successo
            response.sendRedirect("index.jsp");
        else
        	//messaggio di registrazione fallita, ritenta.
            response.sendRedirect("register.jsp");
    }

}
}
