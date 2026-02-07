package online.jayashan.teaplanter.repositories;

import online.jayashan.teaplanter.entities.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {


}
