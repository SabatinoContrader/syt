package main.controller;

import main.MainDispatcher;
import main.model.Utente;
import main.service.RegisterService;

public class RegisterController implements Controller {
	private RegisterService registerService;
	

	@Override
	public void doControl(Request request) {
		this.registerService = new RegisterService();
		//if la risposta is positiva +messaggio successo
		
		 boolean risultato=registerService.register((Utente)request.get("utente"));
		 
		 String messaggio="";
		 Request req=new Request();
		 
		 if(risultato) {
			 messaggio="Registrazione effettuata con successo; ora effettua il login.";
			 req.put("messaggio", messaggio);
			    MainDispatcher.getInstance().callView("Login", req);
		 }
		 else {
			 messaggio="Registrazione non effettuata con successo; Riprova a compilare i campi."; 
			 req.put("messaggio", messaggio);
			    MainDispatcher.getInstance().callView("Register", req);
		 }
		//altrimenti reindirizzazione a index con messggio di errore
		 
		 
		// TODO Auto-generated method stub
		//Utente utente=request.get("utente");
		//chiami il service per insert
	}
}
