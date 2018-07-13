package main.view;

import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Registrazione;
import main.service.GommaService;
import main.service.RegistrazioneService;

public class RegistrazioneView implements View {
	private RegistrazioneService registrazioneService;
	private boolean b=false;
	private String username;
	private String choice;
	
	public RegistrazioneView() {
		this.registrazioneService = new RegistrazioneService();
		
	}

	@Override
	public void showResults(Request request) {
		
		if (request.get("listaRegistrazione") != null) {
			List<Registrazione> registrazioni = (List<Registrazione>) request.get("listaRegistrazione");
			System.out.println("----- Registrazioni -----");
			System.out.println();
			registrazioni.forEach(registrazione -> System.out.println(registrazioni));
			this.b=true;
		}
		

	}

	@Override
	public void showOptions() {
		if(!b) {
		// TODO Auto-generated method stub
		System.out.println("Inserisci lo username del cantante:");
		this.username = getInput();
		}
		else {
			System.out.println("\n1) Inserisci ID registrazione");
			System.out.println("2) Ritorna alla lista registrazioni");
			System.out.println("3) Torna al menu' di ricerca");
			System.out.println("4) Torna al menu' di principale");
			this.choice = getInput();
		}

	}

	@Override
	public String getInput() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		Request request = new Request();
        
		if (!b) {
	        request.put("username", username);
	        MainDispatcher.getInstance().callAction("Registrazione", "doControl", request);
		} else {
			request.put("choice", choice);
			MainDispatcher.getInstance().callAction("Voto", "doControl", request);
		}
	}

}
