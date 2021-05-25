package umutyildiz.hrms.business.abstracts;

import java.util.List;

import umutyildiz.hrms.entities.concretes.Job;

public interface JobService {
	List<Job> getAll();
}
