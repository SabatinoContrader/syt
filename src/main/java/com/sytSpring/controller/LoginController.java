package com.sytSpring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import com.rttCom.rttCom.model.Prodotto;
import com.sytSpring.model.Utente;
import com.sytSpring.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private LoginService loginService;
	
	@Autowired
	public LoginController (LoginService loginService) {
        this.loginService = loginService;
    }

	@RequestMapping(value="/loginControl", method = RequestMethod.POST)
    public String loginController (@RequestParam("username") String nomeUtente, @RequestParam("password") String password, HttpServletRequest request, Map<String, Object> model) {
		
		if (loginService.login(nomeUtente, password).equals("C")) {
            	
                HttpSession session = request.getSession(true);
                session.setAttribute("utente", nomeUtente);
                return "homeCantante";
            }
            else if (loginService.login(nomeUtente, password).equals("G")){
            	HttpSession session = request.getSession(true);
                session.setAttribute("utente", nomeUtente);
                return "homeGiudice";
                
            }
            else return "index";
            
        }
	
	@RequestMapping(value="/modificaPswControl", method = RequestMethod.POST)
	public String modifyPswController (HttpServletRequest request, Model model) {
		
		String username = request.getParameter("username");
		String newpassword = request.getParameter("newpassword");
		
		if(!loginService.pswmodify(username, newpassword)) {
			model.addAttribute("result", "ko");
			return "changePsw";	
		}else {
			model.addAttribute("result", "ok");
			return "index";
		}
		
	}
	
}
