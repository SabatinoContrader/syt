package com.sytSpring.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sytSpring.model.Utente;
import com.sytSpring.service.SearchService;

@Controller
@RequestMapping("/search")
public class SearchController {
	
	private SearchService searchService;

	@Autowired
	public SearchController(SearchService searchService) {
		this.searchService = searchService;
	}
	
	@RequestMapping(value = "/SearchCantante", method = RequestMethod.GET)
	public String searchCantante(@RequestParam("username") String username, Model model) {
		//System.out.println(username);
		List<Utente> cantanti = new ArrayList<Utente>();
		cantanti = searchService.searchCantante(username);
		//System.out.println(cantanti.size());
		model.addAttribute("listUtenti", cantanti);
		return "showCantanti";

	}

}
