package umutyildiz.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umutyildiz.hrms.business.abstracts.JobService;
import umutyildiz.hrms.core.utilities.results.DataResult;
import umutyildiz.hrms.core.utilities.results.Result;
import umutyildiz.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	@Autowired
	private JobService jobService;
	
	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		return this.jobService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Job job) {
		return this.jobService.add(job);
	}
}
