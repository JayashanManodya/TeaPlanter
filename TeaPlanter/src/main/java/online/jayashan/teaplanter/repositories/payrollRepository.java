package online.jayashan.teaplanter.repositories;


import online.jayashan.teaplanter.entities.payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface payrollRepository extends JpaRepository<payroll,Long> {

}

