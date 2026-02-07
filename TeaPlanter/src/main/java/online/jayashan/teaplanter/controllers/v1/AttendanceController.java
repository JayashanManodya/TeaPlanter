package online.jayashan.teaplanter.controllers.v1;


import online.jayashan.teaplanter.entities.Attendance;
import online.jayashan.teaplanter.services.AttendanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apt/v1/attendance")
public class AttendanceController {
    private final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService){
        this.attendanceService = attendanceService;
    }

    @PostMapping("/mark")
    public Attendance markAttendance(
            @RequestParam Long workerId,
            @RequestParam double dailyWageRate,
            @RequestParam String bankDetails
    ){
        return attendanceService.markAttendance(workerId, dailyWageRate, bankDetails);

    }

    @PutMapping("/update/{attendanceId}")
    public Attendance updateAttendance(@PathVariable Long attendanceId) {
        return attendanceService.updateAttendance(attendanceId);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAttendance(@PathVariable Long id){
        attendanceService.deleteAttendance(id);
    }

    @GetMapping("/worker/{workerId}")
    public List<Attendance> getAttendanceCount(@PathVariable Long workerId){
        return attendanceService.getAttendanceCount(workerId);
    }

    @GetMapping("/all")
    public List<Attendance> getAttendance(){
        return attendanceService.getAllAttendance();
    }


}
