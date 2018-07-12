package main.controller;

import main.MainDispatcher;
import main.model.Utente;
import main.service.LoginService;

public class HomeController implements Controller {

    private LoginService loginService;

    public HomeController() {
        loginService = new LoginService();
    }

    public void doControl(Request request) {
        if (request != null) {
            String nomeUtente = request.get("nomeUtente").toString();
            String password = request.get("password").toString();
            Utente u=loginService.login(nomeUtente, password);
            if ( u!= null) {
            	if(u.getRuolo().toString().compareTo("G")==0) {
            		
            		MainDispatcher.getInstance().callView("HomeGiudice", null);
            	}
            	else {
            		MainDispatcher.getInstance().callView("HomeCantante", null);//da completare con la request dopo che vengono implementte le funzioni del cantante

            	}
            }
                
            else
                MainDispatcher.getInstance().callAction("Login", "doControl", request);
        }
        else MainDispatcher.getInstance().callView("Home", null);

    }
}
