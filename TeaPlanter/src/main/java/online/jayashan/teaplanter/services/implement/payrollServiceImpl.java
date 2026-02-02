package online.jayashan.teaplanter.services.implement;

import lombok.AllArgsConstructor;
import online.jayashan.teaplanter.entities.payroll;
import online.jayashan.teaplanter.services.payrollService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class payrollServiceImpl implements payrollService {
    @Override
    public payroll createNewStudent(payroll payroll) {
        return null;
    }

    @Override
    public List<payroll> getAllStudents() {
        return List.of();
    }

    @Override
    public payroll getStudentById(Integer id) {
        return null;
    }

    @Override
    public payroll updateStudentById(Integer id, payroll updatedStudent) {
        return null;
    }

    @Override
    public void deleteStudent(Integer id) {

    }
}
