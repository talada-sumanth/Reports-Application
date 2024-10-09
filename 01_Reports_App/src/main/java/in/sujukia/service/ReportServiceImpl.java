package in.sujukia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sujukia.entity.CitizenPlan;
import in.sujukia.repo.CitizenPlanRepository;
import in.sujukia.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private CitizenPlanRepository planRepo;
	
	
	@Override
	public List<String> getPlanNames() {
			return planRepo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatus() {
		return planRepo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {

		return null;
	}

	@Override
	public boolean exportExcel() {

		return false;
	}

	@Override
	public boolean exportPdf() {

		return false;
	}

}
