package in.sujukia.service;

import java.util.List;

import in.sujukia.entity.CitizenPlan;
import in.sujukia.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();

}
