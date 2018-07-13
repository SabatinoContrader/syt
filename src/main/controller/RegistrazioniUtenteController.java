package main.controller;

import main.MainDispatcher;

public class RegistrazioniUtenteController implements Controller {

	@Override
	public void doControl(Request request) {
		// TODO Auto-generated method stub
		int operazione = Integer.parseInt(request.get("choice").toString());
		if (operazione == 1){
			
			MainDispatcher.getInstance().callView("Registrazione", request);
		} else if (operazione == 2) {
			MainDispatcher.getInstance().callView("RicercaCantante", null);
		} else {
			MainDispatcher.getInstance().callView("HomeGiudice", null);
		}
	}
}
