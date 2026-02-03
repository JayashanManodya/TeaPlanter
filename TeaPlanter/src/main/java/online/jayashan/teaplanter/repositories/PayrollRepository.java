package online.jayashan.teaplanter.repositories;


import online.jayashan.teaplanter.entities.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll,Long> {

}

