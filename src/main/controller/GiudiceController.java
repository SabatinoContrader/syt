package main.controller;

import main.MainDispatcher;
import main.model.Utente;
import main.service.LoginService;

public class GiudiceController implements Controller {

	private LoginService loginService;

	public GiudiceController() {
		loginService = new LoginService();
	}

	public void doControl(Request request) {
		if(Integer.parseInt(request.get("choice").toString())==1) {}
			MainDispatcher.getInstance().callView("RicercaCantante", null);
	

	}
}
