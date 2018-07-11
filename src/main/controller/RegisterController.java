package main.controller;

import main.MainDispatcher;
import main.service.RegisterService;

public class RegisterController implements Controller {
	private RegisterService registerService;
	
	
	public void register (String nome, String cognome, String email, String dataNascita, String luogoNascita, String sesso, String telefono, String username, String password, String ruolo , String genere) {
		this.registerService = new RegisterService();
		boolean risultato;
		risultato=registerService.register(nome, cognome, email,dataNascita, luogoNascita, sesso, telefono, username, password, ruolo , genere);
		
	}


	@Override
	public void doControl(Request request) {
		// TODO Auto-generated method stub
		
	}
}
