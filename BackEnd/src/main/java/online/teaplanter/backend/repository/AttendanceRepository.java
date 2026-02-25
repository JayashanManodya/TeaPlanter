package online.teaplanter.backend.repository;

import online.teaplanter.backend.entity.Attendance;
import online.teaplanter.backend.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    List<Attendance> findByWorker(Worker worker);

    List<Attendance> findByWorkerAndCheckInBetween(Worker worker, java.time.LocalDateTime start,
                                                   java.time.LocalDateTime end);

    List<Attendance> findByPlantation(online.teaplanter.backend.entity.Plantation plantation);

    List<Attendance> findByWorkerAndPlantation(Worker worker, online.teaplanter.backend.entity.Plantation plantation);
}
