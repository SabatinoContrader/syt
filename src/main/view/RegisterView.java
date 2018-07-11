package main.view;

import java.util.Scanner;

import main.MainDispatcher;
import main.controller.RegisterController;
import main.controller.Request;
import main.model.Utente;

public class RegisterView implements View {

	private String nome;
	private String cognome;
	private String email;
	private String dataNascita;
	private String luogoNascita;
	private String sesso;
	private String username;
	private String password;
	private String avatar;
	private String ruolo;
	private String genere;
	private String telefono;
	
	private Utente nuovoUtente;


	@Override
	public void showResults(Request request) {
		if((request!=null)) {
    		String messaggio=(String) request.get("messaggio");
    		if(messaggio!=null) {
    		System.out.println(messaggio);
    		}
    	}

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
		
		this.nuovoUtente=new Utente(0,  nome,  cognome,  email,  luogoNascita,  dataNascita,  sesso,  genere,  0,  1,  telefono,  password,  username,  ruolo,  false,  avatar);
		
	}

    public void submit() {
        Request request = new Request();
        
        request.put("utente", nuovoUtente);
       
        MainDispatcher.getInstance().callAction("Register", "doControl", request);
    }


    public String getInput () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
