package umutyildiz.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import umutyildiz.hrms.business.abstracts.EmployerService;
import umutyildiz.hrms.core.utilities.results.DataResult;
import umutyildiz.hrms.core.utilities.results.Result;
import umutyildiz.hrms.core.utilities.results.SuccessDataResult;
import umutyildiz.hrms.core.utilities.results.SuccessResult;
import umutyildiz.hrms.dataAccess.abstracts.EmployerDao;
import umutyildiz.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	@Autowired
	private EmployerDao employerDao;
	
	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Employer Eklendi");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Employers Listelendi");
	}
	
}
