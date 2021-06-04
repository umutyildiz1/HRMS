package umutyildiz.hrms.business.abstracts;

import java.util.List;

import umutyildiz.hrms.core.utilities.results.Result;
import umutyildiz.hrms.entities.concretes.Candidate;
import umutyildiz.hrms.entities.concretes.User;

public interface CandidateService{
	Result add(Candidate candidate);
}
