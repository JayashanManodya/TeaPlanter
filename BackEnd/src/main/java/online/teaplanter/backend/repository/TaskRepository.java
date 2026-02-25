package online.teaplanter.backend.repository;

import online.teaplanter.backend.entity.Plantation;
import online.teaplanter.backend.entity.Task;
import online.teaplanter.backend.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface TaskRepository extends JpaRepository<Task,Long>{
    List<Task>findByAssignedWorker(Worker worker);

    List<Task>findByStatus(String status);
    List<Task>findByAssignedWorkerAndCompletedAtBetween(
            Worker worker,LocalDateTime start,LocalDateTime end
    );
    List<Task> findByCreatedAtBetween(LocalDate start, LocalDate end);
    List<Task> findByTaskDateBetween(LocalDate start, LocalDate end);
    List<Task>findByAssignedWorkerAndPlantation(Worker worker, Plantation plantation);
}
