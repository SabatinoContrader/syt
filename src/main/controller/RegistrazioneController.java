package main.controller;

import java.util.List;

import main.MainDispatcher;
import main.model.Registrazione;
import main.service.RegistrazioneService;

public class RegistrazioneController implements Controller {

		private RegistrazioneService registrazioneService;


	    public void doControl(Request request) {
	    	this.registrazioneService = new RegistrazioneService();

	            	List<Registrazione> registrazioni = registrazioneService.getAllRegistrazioni(request.get("username").toString());
	            	request.put("listaRegistrazione", registrazioni);
	        MainDispatcher.getInstance().callView("Registrazione", request);

	    }
	}
