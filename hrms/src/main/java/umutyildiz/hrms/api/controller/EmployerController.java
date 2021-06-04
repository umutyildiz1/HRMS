package umutyildiz.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umutyildiz.hrms.business.abstracts.EmployerService;
import umutyildiz.hrms.core.utilities.results.DataResult;
import umutyildiz.hrms.core.utilities.results.Result;
import umutyildiz.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers/")
public class EmployerController {
	
	@Autowired
	private EmployerService employerService;
	
	@PostMapping("add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
	
	@GetMapping("add")
	public DataResult<List<Employer>> getAll() {
		return this.employerService.getAll();
	}
}
