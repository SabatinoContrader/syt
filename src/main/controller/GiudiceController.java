package main.controller;

import java.util.ArrayList;
import java.util.List;

import main.MainDispatcher;
import main.model.Gomma;
import main.model.Utente;
import main.service.GiudiceService;
import main.service.LoginService;

public class GiudiceController implements Controller {

	private GiudiceService giudiceService;

	public GiudiceController() {
		this.giudiceService = new GiudiceService();
	}

	public void doControl(Request request) {
		if(Integer.parseInt(request.get("choice").toString())==1) {}
			MainDispatcher.getInstance().callView("RicercaCantante", null);
	

	}
	public void applicaRicerca(Request request) {
		List<Utente> cantanti =new ArrayList<Utente>(); 
		cantanti=giudiceService.getCantanti(request.get("substring").toString());
		
    	request.put("listaCantanti", cantanti);
    	MainDispatcher.getInstance().callView("RicercaCantante", request);
	}
	
}
