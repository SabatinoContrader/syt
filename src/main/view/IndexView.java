package main.view;

import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;

public class IndexView implements View {

	private int choice;
	
	@Override
	public void showResults(Request request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showOptions() {
		System.out.println("-----PROGETTO SYT----");
        System.out.println("1. LOGIN");
        System.out.println("2. REGISTRAZIONE");
        this.choice = Integer.parseInt(getInput());
		
	}

	@Override
	public String getInput() {
		Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
	}

	@Override
	public void submit() {
		Request request = new Request();
		request.put("choice", choice);
		MainDispatcher.getInstance().callAction("Choice", "doControl", request);
		
	}

}
