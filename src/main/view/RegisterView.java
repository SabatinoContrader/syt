package main.view;

import java.util.Scanner;

import main.MainDispatcher;
import main.controller.RegisterController;
import main.controller.Request;

public class RegisterView implements View {

	private String nome;
	private String cognome;
	private String email;
	private String dataNascita;
	private String luogoNascita;
	private String sesso;
	private String username;
	private String password;
	//private String avatar;
	private String ruolo;
	private String genere;
	private String telefono;
	
	private RegisterController registerController;

	@Override
	public void showResults(Request request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showOptions() {
		System.out.println("-----REGISTRAZIONE----");
		System.out.println("****I TUOI DATI PERSONALI****");
		System.out.println("Nome:");
		nome = getInput();
		System.out.println("Cognome:");
		cognome = getInput();
		System.out.println("Email:");
		email = getInput();
		System.out.println("Data di nascita (AAAA-MM-GG):");
		dataNascita = getInput();
		System.out.println("Luogo di nascita:");
		luogoNascita = getInput();
		System.out.println("Sesso:");
		sesso = getInput();
		System.out.println("Telefono:");
		telefono = getInput();
		System.out.println("****I TUOI DATI DI SYNT****");
		System.out.println("Username:");
		username = getInput();
		System.out.println("Password:");
		password = getInput();
		System.out.println("Ruolo (Inserisci C per cantante, G per giudice):");
		ruolo = getInput();
		System.out.println("Genere (Inserisci Rock, Pop o Rap):");
		genere = getInput();
		
		this.registerController=new RegisterController();
		registerController.register(nome, cognome, email,dataNascita, luogoNascita, sesso, telefono, username, password, ruolo , genere);
		
	}

    public void submit() {
        Request request = new Request();
        request.put("nome", nome);
        request.put("cognome", cognome);
        request.put("email", email);
        request.put("dataNascita", dataNascita);
        request.put("luogoNascita", luogoNascita);
        request.put("sesso", sesso);
        request.put("telefono", telefono);
        request.put("username", username);
        request.put("password", password);
        request.put("ruolo", ruolo);
        request.put("genere", genere);
        MainDispatcher.getInstance().callAction("Register", "doControl", request);
    }


    public String getInput () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
