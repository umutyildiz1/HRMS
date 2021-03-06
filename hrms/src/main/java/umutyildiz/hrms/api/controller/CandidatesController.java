package umutyildiz.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umutyildiz.hrms.business.abstracts.CandidateService;
import umutyildiz.hrms.core.utilities.results.DataResult;
import umutyildiz.hrms.core.utilities.results.Result;
import umutyildiz.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	@Autowired
	private CandidateService candidateService;
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate) {
		return candidateService.add(candidate);
		
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Candidate>> getAll() {
		return this.candidateService.getAll();
	}
}
