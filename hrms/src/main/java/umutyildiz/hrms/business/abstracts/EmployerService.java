package umutyildiz.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import umutyildiz.hrms.core.utilities.results.DataResult;
import umutyildiz.hrms.core.utilities.results.Result;
import umutyildiz.hrms.entities.concretes.Employer;


public interface EmployerService {
	Result add(Employer employer);
	DataResult<List<Employer>> getAll();
}
