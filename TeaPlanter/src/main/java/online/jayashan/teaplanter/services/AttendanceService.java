package online.jayashan.teaplanter.services;


import online.jayashan.teaplanter.entities.Attendance;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AttendanceService {

    Attendance markAttendance(Long workerId, double dailyWageRate, String bankDetails);

    Attendance updateAttendance(Long attendanceId);

    void deleteAttendance(Long id);

    List<Attendance> getAttendanceCount(Long workerId);

    List<Attendance> getAllAttendance();






}
