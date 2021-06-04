package umutyildiz.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import umutyildiz.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
