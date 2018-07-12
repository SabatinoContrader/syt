package main.view;

import java.util.List;

import main.controller.Request;
import main.model.Registrazione;
import main.service.GommaService;
import main.service.RegistrazioneService;

public class RegistrazioneView implements View{
    private RegistrazioneService registrazioneService;

  public RegistrazioneView () {
      this.registrazioneService = new RegistrazioneService();
  }
	@Override
	public void showResults(Request request) {
	       List<Registrazione> registrazioni = (List<Registrazione>) request.get("listaRegistrazione");
	       System.out.println("----- Registrazioni -----");
	       System.out.println();
	       registrazioni.forEach(registrazione -> System.out.println(registrazioni));
		
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInput() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}

}
