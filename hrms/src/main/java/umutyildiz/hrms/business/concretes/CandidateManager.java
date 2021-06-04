package umutyildiz.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import umutyildiz.hrms.business.abstracts.CandidateService;
import umutyildiz.hrms.core.utilities.results.Result;
import umutyildiz.hrms.core.utilities.results.SuccessResult;
import umutyildiz.hrms.dataAccess.abstracts.CandidateDao;
import umutyildiz.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{
	
	@Autowired
	private CandidateDao candidateDao;
	
	@Override
	public Result add(Candidate candidate) {
		candidateDao.save(candidate);
		return new SuccessResult("Candidate eklendi");
	}
 

}
