package umutyildiz.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import umutyildiz.hrms.business.abstracts.JobService;
import umutyildiz.hrms.dataAccess.abstracts.JobDao;
import umutyildiz.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{
	@Autowired
	private JobDao jobDao;
	
	@Override
	public List<Job> getAll() {
		return this.jobDao.findAll();
	}

}
