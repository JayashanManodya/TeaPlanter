package online.teaplanter.backend.repository;

import online.teaplanter.backend.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerRepository  extends JpaRepository<Worker, Long> {
    List<Worker> findByStatus(String status);

    java.util.Optional<Worker> findByUserAndPlantation(online.teaplanter.backend.entity.User user,
                                                       online.teaplanter.backend.entity.Plantation plantation);

    List<Worker> findByPlantation(online.teaplanter.backend.entity.Plantation plantation);

    List<Worker> findByUser(online.teaplanter.backend.entity.User user);


}
