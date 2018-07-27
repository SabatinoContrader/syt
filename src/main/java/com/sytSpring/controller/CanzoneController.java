package com.sytSpring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.sytSpring.model.Utente;
import com.sytSpring.model.Canzone;
import com.sytSpring.service.CanzoneService;

@Controller
@RequestMapping("/homeCantante")

public class CanzoneController {
	
	private CanzoneService canzoneService;
	
	@Autowired
	public CanzoneController (CanzoneService canzoneService) {
        this.canzoneService = canzoneService;     
    }
	
	@RequestMapping(value="/canzoneControl",method = RequestMethod.GET)
	public String listacanzoni ( HttpServletRequest request, Model model) {
	 HttpSession session = request.getSession(true);
	List<Canzone> listCanzone = new ArrayList<Canzone>();
		listCanzone = canzoneService.listaCanzoni(1,"Pop");
		model.addAttribute("canzoni", listCanzone);
        return "tutorialCantante";
        }
	@RequestMapping(value="/canzonesceltaControl",method = RequestMethod.POST)
	public String canzscelta (@RequestParam("canzonescelta") int idCanzone, HttpServletRequest request, Model model) {
		HttpSession session = request.getSession(true);
	 	Canzone canz = new Canzone();
	 	canz = canzoneService.canzscelta(idCanzone);
	 	model.addAttribute("canz",canz);
	 	return "taraturaMicrofono";
   }           
	@RequestMapping(value="/provaregControl",method = RequestMethod.POST)
	public String provareg (@RequestParam("canzonescelta") int idCanzone, HttpServletRequest request, Model model) {
		Canzone canz = new Canzone();
	 	canz = canzoneService.canzscelta(idCanzone);
	 	model.addAttribute("canz",canz);
	 	return "provaRegistrazione";
}
}
