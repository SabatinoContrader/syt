package com.virtualpairprogrammers.servlets;

import com.virtualpairprogrammers.model.Utente;
import com.virtualpairprogrammers.model.VotazioneGiudice;
import javax.servlet.http.HttpServlet;
import com.virtualpairprogrammers.services.VotaService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.IOException;

public class VotaServlet extends HttpServlet {

	private VotaService votaService;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.votaService = new VotaService();
		HttpSession session = request.getSession();
		double intonazione = Double.parseDouble(request.getParameter("intonazione"));
		double timbro = Double.parseDouble(request.getParameter("timbro"));
		double tono = Double.parseDouble(request.getParameter("tono"));
		double unicita = Double.parseDouble(request.getParameter("unicita"));
		int idRegistrazione = Integer.parseInt(request.getParameter("idRegistrazione").toString());
		// qui hai lìid del giudice
		Utente u = (Utente) session.getAttribute("utente");
		int idGiudice = u.getidUtente();

		//
		// session.getAttribute("votazionegiudice",
		// VotaService.insertVoto(idVotazioneGiudice, idRegistrazione, idGiudice));

		/*
		 * VotazioneGiudice vg= (VotazioneGiudice)
		 * session.getAttribute("votazioneGiudice"); if(request!= null) { //String
		 * idVotazioneGiudice =
		 * request.getSession().getId().getParameter("idVotazioneGiudice").toString();
		 * //String idRegistrazione = request.getParameter("cognome").toString(); //
		 * String idGiudice = request.getParameter("idGiudice").toString(); double
		 * intonazione = Double.parseDouble(request.getParameter("intonazione")); double
		 * timbro = Double.parseDouble(request.getParameter("timbro")); double tono =
		 * Double.parseDouble(request.getParameter("tono")); double unicita =
		 * Double.parseDouble(request.getParameter("unicita")); // String intonazione =
		 * request.getParameter("intonazione").toString(); // String timbro =
		 * request.getParameter("timbro").toString(); // String tono =
		 * request.getParameter("tono").toString(); // String unicita =
		 * request.getParameter("unicita").toString(); // VotazioneGiudice vg= new
		 * VotazioneGiudice(0, 0, 0, 0);
		 * if(votaService.insertVoto(idVotazioneGiudice,idRegistrazione,idGiudice)) { //
		 * stampa messaggio positivo
		 */
		
		VotazioneGiudice votazioneGiudice = new VotazioneGiudice(0, idRegistrazione, idGiudice, intonazione, timbro, tono, unicita);
		request.setAttribute("votazioneGiudice", votazioneGiudice);
		if (votaService.insertVoto(votazioneGiudice)) {
			getServletContext().getRequestDispatcher("/vota.jsp").forward(request, response);
		}
		

	}
}
