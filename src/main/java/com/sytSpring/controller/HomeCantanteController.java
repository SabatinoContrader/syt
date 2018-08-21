package com.sytSpring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sytSpring.converter.UtenteConverter;
import com.sytSpring.dto.UtenteDTO;
import com.sytSpring.model.Registrazione;
import com.sytSpring.model.Utente;
import com.sytSpring.service.ClassificaFinaleService;
import com.sytSpring.service.ClassificaGiudiceService;
import com.sytSpring.service.ClassificaSistemaService;
import com.sytSpring.service.RegistrazioneService;
import com.sytSpring.service.SearchService;
import com.sytSpring.GenericResponse;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/cantanteController")
public class HomeCantanteController {

	private SearchService searchService;
	private ClassificaGiudiceService cgs;
	private ClassificaFinaleService cfs;
	private RegistrazioneService registrazioneService;
	private UtenteConverter utenteConverter;
	@Autowired
	public HomeCantanteController(ClassificaGiudiceService cgs,ClassificaFinaleService cfs, SearchService searchService, RegistrazioneService registrazioneService,UtenteConverter utenteConverter) {
		this.cgs=cgs;
		this.cfs=cfs;
		this.searchService = searchService;
		this.registrazioneService = registrazioneService;
		this.utenteConverter = utenteConverter;
	}


	@RequestMapping(value = "/getClassifica", method = RequestMethod.GET)
	public String getClassifica(Model model) {
		List<Registrazione> classificaGiudice= new ArrayList<Registrazione>();
		model.addAttribute("classificaRegistrazioniGiudice", classificaGiudice);
		
		return "classificaGiudice";
	}
	
	
	@RequestMapping(value = "/SearchCantante", method = RequestMethod.POST)
	public GenericResponse<List<UtenteDTO>> searchCantante(@RequestBody UtenteDTO utenteDTO) {
		Utente searchUtente = utenteConverter.convertToEntity(utenteDTO);
		List<Utente> cantanti = new ArrayList<Utente>();
		List<UtenteDTO> cantantiDTO = new ArrayList<>();
		cantanti = searchService.searchCantante(searchUtente.getUsername());
		for (Utente cantante1 : cantanti) {
			UtenteDTO cantante1DTO = utenteConverter.convertToDTO(cantante1);
			cantantiDTO.add(cantante1DTO);
		}
		return new GenericResponse<>(1, cantantiDTO);
	}
	

	@RequestMapping(value = "/getClassificaFinale", method = RequestMethod.GET)
	public String getClassificaFinale(Model model) {
		List<Registrazione> classificaFinale = cfs.getClassificaFinale();
		model.addAttribute("classificaFinale", classificaFinale);
		return "classificaFinale";
	}
	
	@RequestMapping(value = "/ascoltaDaCantante", method = RequestMethod.GET)
	public String sceltaController(@RequestParam("username") String username, Model model) {
		//System.out.println(username);
		List<Registrazione> registrazioni = new ArrayList<Registrazione>();
		
		registrazioni = registrazioneService.searchRegistrazioni(username);
		//System.out.println(registrazioni.size());
		model.addAttribute("listRegistrazioni", registrazioni);
		return "ascolta";

	}
	
	
}
