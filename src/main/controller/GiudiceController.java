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
		String operazione = request.get("operazione").toString();
		if (operazione.equals("ricerca")) {
			//if (Integer.parseInt(request.get("choice").toString()) == 1) {
				MainDispatcher.getInstance().callView("RicercaCantante", null);
			//}
		}else if(operazione.equals("preleva")){
			List<Utente> cantanti = new ArrayList<Utente>();
			cantanti = giudiceService.getCantanti(request.get("username").toString());
			request.put("listaCantanti", cantanti);
			MainDispatcher.getInstance().callView("RicercaCantante", request);
		}
	}

}
