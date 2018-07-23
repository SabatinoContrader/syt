package com.virtualpairprogrammers.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtualpairprogrammers.model.VotazioneSistema;
import com.virtualpairprogrammers.services.VotazioneSistemaService;
import java.lang.Object;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Date;

public class VotazioneSistemaServlet extends HttpServlet {
	
	private VotazioneSistemaService votazioneSistemaService;

	

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.votazioneSistemaService = new VotazioneSistemaService();
	
	      Random random= new Random();
	    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	 	Date date = new Date();
		
		int idRegistrazione = random.nextInt(5)+1;
	
		double fedelta = random.nextDouble()+1;
		
		double intonazione = random.nextDouble()+1;
		double potenza =random.nextDouble()+1;
		double estensione = random.nextDouble()+1;
		String data = dateFormat.format(date);
		
		VotazioneSistema votazioneSistema = new VotazioneSistema(0, idRegistrazione, fedelta,intonazione, potenza, estensione,  data);
		request.setAttribute("votazioneSistema", votazioneSistema);
		if (votazioneSistemaService.insertVoto(votazioneSistema)) {
			getServletContext().getRequestDispatcher("/VotazioneSistema.jsp").forward(request, response);
		}
	}
	
		
	}


	


