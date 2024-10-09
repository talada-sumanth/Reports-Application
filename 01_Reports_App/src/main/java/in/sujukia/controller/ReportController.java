package in.sujukia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.sujukia.request.SearchRequest;
import in.sujukia.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService service; 
	
	@GetMapping("/")
	public String indexPage(Model model) {
		
		SearchRequest searchObj =  new SearchRequest();
		
		model.addAttribute("search", searchObj);
		
		return "index";
	}
}
