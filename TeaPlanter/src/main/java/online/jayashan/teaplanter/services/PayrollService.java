package online.jayashan.teaplanter.services;

import online.jayashan.teaplanter.entities.Payroll;
import java.util.List;

public interface PayrollService {
    Payroll createNewPayroll (Payroll Payroll);
    List<Payroll> getAllPayrolls();
    Payroll getPayrollById(Long id);
    Payroll updatePayrollById(Long id, Payroll updatedPayroll);
    void deletePayroll(Long id);
}
