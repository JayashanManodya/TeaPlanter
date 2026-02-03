package online.jayashan.teaplanter.services;

import online.jayashan.teaplanter.entities.payroll;
import java.util.List;

public interface PayrollService {
    payroll createPayroll(payroll payroll);
    List<payroll> getAllPayroll();
    payroll getPayrollById(Long id);
    payroll updatePayrollById(Long id, payroll updatedPayroll);
    void deletePayroll(Long id);
}
