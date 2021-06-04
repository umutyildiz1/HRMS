package umutyildiz.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import umutyildiz.hrms.business.abstracts.JobService;
import umutyildiz.hrms.core.utilities.results.DataResult;
import umutyildiz.hrms.core.utilities.results.Result;
import umutyildiz.hrms.core.utilities.results.SuccessDataResult;
import umutyildiz.hrms.core.utilities.results.SuccessResult;
import umutyildiz.hrms.dataAccess.abstracts.JobDao;
import umutyildiz.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{
	@Autowired
	private JobDao jobDao;
	
	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Job titles Listelendi");
	}

	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("Job title eklendi");
	}

}
