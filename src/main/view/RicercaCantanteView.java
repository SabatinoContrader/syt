package main.view;

import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;

public class RicercaCantanteView implements View {

	private String choice;
	
	@Override
	public void showResults(Request request) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stub
		System.out.println("INSERISCI LO USERNAME DEL CANTANTE:");
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
