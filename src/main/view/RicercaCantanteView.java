package main.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Utente;

public class RicercaCantanteView implements View {

	private String username;
	private boolean b=false;
	private String choice;
	@Override
	public void showResults(Request request) {
		// TODO Auto-generated method stub
		if(request!=null) {
			List <Utente> listaCantanti=new ArrayList<Utente>();
			listaCantanti=(List<Utente>) request.get("listaCantanti");
			for(Utente u: listaCantanti) {
				System.out.println(u.toString());
			}
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
			System.out.println("\n1) Vota un cantante");
			System.out.println("2) Ripeti la ricerca");
			System.out.println("3) Torna al menu' principale");
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
		Request request = new Request();
	        
		if (!b) {
	        request.put("username", username);
	        request.put("operazione", "preleva");
	        MainDispatcher.getInstance().callAction("Giudice", "doControl", request);
		} else {
			request.put("choice", choice);
			MainDispatcher.getInstance().callAction("RegistrazioniUtente", "doControl", request);
		}
	        
	      
		// TODO Auto-generated method stub
	}
	
	
}
