package online.jayashan.teaplanter.repositories;
import online.jayashan.teaplanter.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {
    List<Task>findByWorkerId(Long workerId);
    List<Task>findByStatus(String status);
}
