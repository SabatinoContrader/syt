package com.virtualpairprogrammers.servlets;

import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.model.VotazioneCantante;
import javax.servlet.http.HttpServlet;

import com.virtualpairprogrammers.services.VotaCantanteService;
import com.virtualpairprogrammers.services.VotaService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.IOException;

public class VotaCantanteServlet extends HttpServlet {

	private VotaCantanteService votaCantanteService;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.votaCantanteService = new VotaCantanteService();
		HttpSession session = request.getSession();
		double orecchiabilita = Double.parseDouble(request.getParameter("orecchiabilita"));
		double download = Double.parseDouble(request.getParameter("download"));
		int idRegistrazione = Integer.parseInt(request.getParameter("idRegistrazione").toString());
		
		Utente u = (Utente) session.getAttribute("utente");
		int idCantante = u.getidUtente();

		VotazioneCantante votazioneCantante = new VotazioneCantante(0, idRegistrazione, idCantante, orecchiabilita, download);
		request.setAttribute("votazioneCantante", votazioneCantante);
		if (votaCantanteService.insertVoto(votazioneCantante)) {
			// modificare destinazione Dispatcher perchè vota.jsp è per il GIUDICE
			getServletContext().getRequestDispatcher("/vota.jsp").forward(request, response);
		}
		

	}
}
