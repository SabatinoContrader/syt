package main.controller;

import main.MainDispatcher;

public class ChoiceController implements Controller {

	private int choice;

	public ChoiceController() {
	}

	public void doControl(Request request) {

		choice = Integer.parseInt(request.get("choice").toString());

		if (choice < 3 && choice > 0) {
			if (choice == 1) {
				MainDispatcher.getInstance().callView("Login", request);
			}

			else {
				MainDispatcher.getInstance().callView("Register", request);
			}
			
		}
		else {
			System.out.println("Scelta non valida!");
			MainDispatcher.getInstance().callView("Index", request);
		}
	}

}
