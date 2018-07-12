package main.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Utente;

public class RicercaCantanteView implements View {

	private String choice;
	
	@Override
	public void showResults(Request request) {
		// TODO Auto-generated method stub
		List <Utente> listaCantanti=new ArrayList<Utente>();
		listaCantanti=(List<Utente>) request.get("listaCantanti");
		for(Utente u: listaCantanti) {
			System.out.println(u.toString());
		}
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stub
		System.out.println("Inserisci lo username del cantante:");
		this.choice = getInput();
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
	        
	        request.put("username", choice);
	       
	        MainDispatcher.getInstance().callAction("Giudice", "doControl", request);
		// TODO Auto-generated method stub
	}
	
	
}
