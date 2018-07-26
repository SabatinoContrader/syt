package com.sytSpring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sytSpring.model.VotazioneGiudice;
import com.sytSpring.service.VotaService;

@Controller
@RequestMapping("/votaController")
public class VotaController {
	
	private VotaService votaService;

	@Autowired
	public VotaController (VotaService votaService) {
        this.votaService = votaService;
    }
	
	@RequestMapping(value = "/vota", method = RequestMethod.GET)
	public String dispatchId(@RequestParam("idRegistrazione") int idRegistrazione, HttpServletRequest request, Map<String, Object> model) {
		
		HttpSession session = request.getSession(true);
        session.setAttribute("idRegistrazione", idRegistrazione);
		return "registrazione";
	}
	
	@RequestMapping(value = "/votazione", method = RequestMethod.POST)
	public String insertVoto(HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession(true);
        int idGiudice = Integer.parseInt(session.getAttribute("idUtente").toString());
        int idRegistrazione = Integer.parseInt(session.getAttribute("idRegistrazione").toString());
        double timbro = Integer.parseInt(request.getParameter("timbro").toString());
        double intonazione = Integer.parseInt(request.getParameter("intonazione").toString());
        double tono = Integer.parseInt(request.getParameter("tono").toString());
        double unicita = Integer.parseInt(request.getParameter("unicita").toString());
        double media = (timbro+intonazione+tono+unicita)/4;
        
        VotazioneGiudice votazioneGiudice=new VotazioneGiudice(0,idRegistrazione,idGiudice,timbro,intonazione,tono,unicita,media,false);
        if (votaService.insertVoto(votazioneGiudice))
        {
        	HttpSession sess = request.getSession(true);
            sess.setAttribute("idRegistrazione", "");
            return "vota";		
        }
        else
        {
        	HttpSession sess = request.getSession(true);
            sess.setAttribute("idRegistrazione", "");
        	return "classificaSistema";
        }
	}
}

