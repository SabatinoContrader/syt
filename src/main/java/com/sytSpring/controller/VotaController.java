package com.sytSpring.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.sytSpring.model.VotazioneCantante;
import com.sytSpring.model.VotazioneGiudice;
import com.sytSpring.model.VotazioneSistema;
import com.sytSpring.service.VotazioneCantanteService;
import com.sytSpring.service.VotazioneGiudiceService;



@Controller
@RequestMapping("/votaController")
public class VotaController {

	private VotazioneCantanteService votaCantanteService;

	
	private VotazioneGiudiceService votaService;
	

	@Autowired
	public VotaController (VotazioneGiudiceService votaService , VotazioneCantanteService votaCantanteService) {

        this.votaService = votaService;
        this.votaCantanteService=votaCantanteService;
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
        	
        	votaService.updateSistema(idRegistrazione);
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
	
	
	@RequestMapping(value="/votaCantante", method = RequestMethod.GET)
	public String getClassifica(Model model,@RequestParam("idRegistrazione") String idReg) {
		model.addAttribute("idRegistrazione", idReg);
		//List<Registrazione> classificaSistema = css.getClassificaSistema();
		//model.addAttribute("classificaRegistrazioni", classificaSistema);
		return "registrazioneCantante";

	}
	@RequestMapping(value="/inserisciVotazioneCantante", method = RequestMethod.POST)
	public String insertVotazione( HttpServletRequest request,@RequestParam("idReg") int idRegistrazione,@RequestParam("orecchiabilita") double orecchiabilita,@RequestParam("download") double download,Model model) {
		HttpSession session=request.getSession(true);
		double media=(download+orecchiabilita)/2;
		
		int idCantante=Integer.parseInt(session.getAttribute("idUtente").toString());
		//1. controllare,dato l'id della registrazione se è presente nella tabella VOTAZIONEGIUDICE e se ha il flag =0;
		if(votaService.checkFlag(idRegistrazione).size()!=0) {
			
			//2.inserisci la votazione in votazione cantante con nvoti=1...
			VotazioneCantante vc=new VotazioneCantante(0,idRegistrazione,idCantante,download,orecchiabilita,media,1);
			votaCantanteService.inserisciVotazioneCantante(vc);
					
			//3...aggiorna il flag nella tabella votazionegiudice=1
			votaService.updateFlag(idRegistrazione);
		}
		else {
			votaCantanteService.updateVoti(idRegistrazione,orecchiabilita,download,media);
		}
		
		
		
		return "vota";
		
		
	}
	
	@RequestMapping(value = "/inserisciVotazioneSistema", method = RequestMethod.GET)
	public String insertVotoSistema(HttpServletRequest request, Model model) {
		
		Random random= new Random();
	    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	 	Date date = new Date();
		
		int idRegistrazione = random.nextInt(5)+1;
	
		double fedelta = random.nextDouble()+1;
		
		double intonazione = random.nextDouble()+1;
		double potenza =random.nextDouble()+1;
		double estensione = random.nextDouble()+1;
		String data = dateFormat.format(date);
		double media = (fedelta+intonazione+potenza+estensione)/4;
        
        VotazioneSistema votazioneSistema=new VotazioneSistema(0,idRegistrazione,fedelta,intonazione,potenza,estensione,data,media,false);
        votaService.insertVotoSistema(votazioneSistema);    
        return "votazioneSistema";		

	}
}

