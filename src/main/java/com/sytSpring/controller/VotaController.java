package com.sytSpring.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sytSpring.model.Registrazione;
import com.sytSpring.model.VotazioneCantante;
import com.sytSpring.service.LoginService;

@Controller
@RequestMapping("/votaController")
public class VotaController {
	
	
	@Autowired
	public VotaController () {
        
    }

	@RequestMapping(value="/votaCantante", method = RequestMethod.GET)
	public String getClassifica(Model model,@RequestParam("idRegistrazione") String idReg) {
		model.addAttribute("idRegistrazione", idReg);
		//List<Registrazione> classificaSistema = css.getClassificaSistema();
		//model.addAttribute("classificaRegistrazioni", classificaSistema);
		return "registrazioneCantante";

	}
	@RequestMapping(value="/inserisciVotazioneCantante", method = RequestMethod.POST)
	public String insertVotazione( HttpServletRequest request,@RequestParam("orecchiabilita") double orecchiabilita,@RequestParam("download") double download,Model model) {
		int idRegistrazione=Integer.parseInt(request.getAttribute("idRegistrazione").toString());
		
		
		if(true) {
			return "";
		}
		else {
			int idCantante=Integer.parseInt(request.getAttribute("idCantante").toString());
			double media=(orecchiabilita+download)/2;
			VotazioneCantante nuovaVotazione=new VotazioneCantante(0,idRegistrazione,idCantante,download,orecchiabilita,media,1);
			return "vota";
		}
		
		
		

	}
	
}
