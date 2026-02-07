package online.jayashan.teaplanter.services.implement;


import lombok.AllArgsConstructor;
import online.jayashan.teaplanter.entities.Attendance;
import online.jayashan.teaplanter.services.AttendanceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AttendanceServiceImpl implements AttendanceService {

    @Override
    public Attendance markAttendance(Long workerId, double dailyWageRate, String bankDetails) {
        return null;
    }

    @Override
    public Attendance updateAttendance(Long attendanceId) {
        return null;
    }

    @Override
    public void deleteAttendance(Long id) {

    }

    @Override
    public List<Attendance> getAttendanceCount(Long workerId) {
        return List.of();
    }

    @Override
    public List<Attendance> getAllAttendance() {
        return List.of();
    }
}
