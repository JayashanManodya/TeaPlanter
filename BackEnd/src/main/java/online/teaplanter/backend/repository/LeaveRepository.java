package online.teaplanter.backend.repository;

import online.teaplanter.backend.entity.Leave;
import online.teaplanter.backend.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Long>  {
    List<Leave> findByWorker(Worker worker);

    List<Leave> findByPlantation(online.teaplanter.backend.entity.Plantation plantation);
}