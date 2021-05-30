package umutyildiz.hrms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umutyildiz.hrms.business.abstracts.CandidateService;
import umutyildiz.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	@Autowired
	private CandidateService candidateService;
	
	@PostMapping("/add")
	public void add(@RequestBody Candidate candidate) {
		candidateService.add(candidate);
	}
}
