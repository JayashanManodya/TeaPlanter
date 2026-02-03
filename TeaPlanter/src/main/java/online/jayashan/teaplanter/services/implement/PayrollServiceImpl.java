package online.jayashan.teaplanter.services.implement;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import online.jayashan.teaplanter.entities.payroll;
import online.jayashan.teaplanter.services.PayrollService;
import online.jayashan.teaplanter.repositories.payrollRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class PayrollServiceImpl implements PayrollService {
    payrollRepository payrollRepository;

    @Override
    public payroll createPayroll(payroll payroll) {
        return payrollRepository.save(payroll);
    }

    @Override
    public List<payroll> getAllPayroll() {
        return payrollRepository.findAll();
    }

    @Override
    public payroll getPayrollById(Long id) {
        return payrollRepository.getReferenceById(id);
    }

    @Override
    public payroll updatePayrollById(Long id, payroll updatedpayroll) {
        payroll old = payrollRepository.getReferenceById(id);
        old.setStatus(updatedpayroll.getStatus());
        old.setBonusPay(updatedpayroll.getBonusPay());
        old.setNetPay(updatedpayroll.getNetPay());
        old.setTotalDeductions(updatedpayroll.getTotalDeductions());
        payrollRepository.save(old);
        return old;
    }

    @Override
    public void deletePayroll(Long id) {
        payrollRepository.deleteById(id);
    }
}

