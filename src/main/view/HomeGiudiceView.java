package main.view;

import main.MainDispatcher;
import main.controller.Request;
//import sun.applet.Main;

import java.util.Scanner;

public class HomeGiudiceView implements View {

	private int choice;

	public void showResults(Request request) {

	}

	public void showOptions() {
		System.out.println("-------HOME GIUDICE-------");
		System.out.println("");
		System.out.println("1) Ricerca Cantante");
		System.out.println("2) Logout");
		this.choice = Integer.parseInt(getInput());
	}

	public void submit() {
		if (choice > 0 && choice < 3) {
			switch (choice) {
			case 1:
				Request request = new Request();
	            request.put("choice", choice);
				MainDispatcher.getInstance().callAction("Giudice", "doControl", request);// da modificare
				
			case 2:
				MainDispatcher.getInstance().callAction("Index", "doControl", null);
			}
		} else {
			System.out.println("Comando non valido! Riprova utilizzando i comandi disponibili.");
		}

	}

	public String getInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

}
