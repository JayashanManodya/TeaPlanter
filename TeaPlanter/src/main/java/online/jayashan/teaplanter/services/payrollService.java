package online.jayashan.teaplanter.services;

import online.jayashan.teaplanter.entities.payroll;
import java.util.List;

public interface payrollService {
    payroll createNewStudent (payroll payroll);
    List<payroll> getAllStudents();
    payroll getStudentById(Integer id);
    payroll updateStudentById(Integer id, payroll updatedStudent);
    void deleteStudent(Integer id);
}
