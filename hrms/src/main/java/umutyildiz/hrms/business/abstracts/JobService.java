package umutyildiz.hrms.business.abstracts;

import java.util.List;

import umutyildiz.hrms.core.utilities.results.DataResult;
import umutyildiz.hrms.entities.concretes.Job;

public interface JobService {
	DataResult<List<Job>> getAll();
}
