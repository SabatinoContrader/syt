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

import com.sytSpring.converter.RegistrazioneConverter;
import com.sytSpring.converter.UtenteConverter;
import com.sytSpring.dto.RegistrazioneDTO;
import com.sytSpring.dto.UtenteDTO;
import com.sytSpring.model.Registrazione;
import com.sytSpring.model.Utente;
import com.sytSpring.GenericResponse;
import com.sytSpring.service.ClassificaFinaleService;
import com.sytSpring.service.ClassificaSistemaService;
import com.sytSpring.service.RegistrazioneService;
import com.sytSpring.service.SearchService;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/giudiceController")
public class HomeGiudiceController {
	private SearchService searchService;
	private ClassificaSistemaService css;
	private RegistrazioneService registrazioneService;
	private ClassificaFinaleService cfs;
	private UtenteConverter utenteConverter;
	private RegistrazioneConverter registrazioneConverter;

	@Autowired
	public HomeGiudiceController(ClassificaSistemaService css, SearchService searchService, RegistrazioneService registrazioneService, ClassificaFinaleService cfs, UtenteConverter utenteConverter, RegistrazioneConverter registrazioniConverter, RegistrazioneConverter registrazioneConverter) {
		this.css = css;
		this.searchService = searchService;
		this.registrazioneService = registrazioneService;
		this.cfs=cfs;
		this.utenteConverter = utenteConverter;
		this.registrazioneConverter = registrazioneConverter;
	}

	@RequestMapping(value = "/getClassifica", method = RequestMethod.GET)
	public String getClassifica(Model model) {

		List<Registrazione> classificaSistema = css.getClassificaSistema();
		model.addAttribute("classificaRegistrazioni", classificaSistema);
		return "classificaSistema";

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

	@RequestMapping(value = "/ascolta", method = RequestMethod.GET)
	public GenericResponse<List<RegistrazioneDTO>> ascolta(@RequestParam("username") String username) {

		List<Registrazione> registrazioni = new ArrayList<Registrazione>();
		List<RegistrazioneDTO> registrazioniDTO = new ArrayList<>();
		registrazioni = registrazioneService.searchRegistrazioni(username);
		
		for (Registrazione registrazione : registrazioni) {
			RegistrazioneDTO registrazioneDTO = registrazioneConverter.convertToDTO(registrazione);
			registrazioniDTO.add(registrazioneDTO);
		}
		return new GenericResponse<>(1, registrazioniDTO);
	}

	@RequestMapping(value = "/getClassificaFinale", method = RequestMethod.GET)
	public String getClassificaFinale(Model model) {
		List<Registrazione> classificaFinale = cfs.getClassificaFinale();
		model.addAttribute("classificaFinale", classificaFinale);
		return "classificaFinale";
	}

}