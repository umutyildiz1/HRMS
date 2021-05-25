package umutyildiz.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import umutyildiz.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer>{

}
