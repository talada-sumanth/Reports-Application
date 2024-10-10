package in.sujukia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.sujukia.entity.CitizenPlan;
import in.sujukia.request.SearchRequest;
import in.sujukia.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService service; 
	
	@PostMapping("/search")
	public String handleSearch(SearchRequest request, Model model) {
		
		System.out.println(request);
		
		List<CitizenPlan> plans = service.search(request);
		model.addAttribute("plans",plans);
		
		init(model);
		
		return "index";
	}
	
	
	@GetMapping("/")
	public String indexPage(Model model) {
		
		
		init(model);
		
		return "index";
	}


	private void init(Model model) {
		model.addAttribute("search", new SearchRequest());
		model.addAttribute("names", service.getPlanNames());
		model.addAttribute("status", service.getPlanStatus());
	}
}
