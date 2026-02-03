package online.jayashan.teaplanter.services.implement;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import online.jayashan.teaplanter.entities.Payroll;
import online.jayashan.teaplanter.repositories.PayrollRepository;
import online.jayashan.teaplanter.services.PayrollService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class PayrollServicImpl implements PayrollService {
    PayrollRepository PayrollRepository;

    @Override
    public Payroll createNewPayroll(Payroll Payroll) {
        return PayrollRepository.save(Payroll);
    }

    @Override
    public List<Payroll> getAllPayrolls() {
        return PayrollRepository.findAll();
    }

    @Override
    public Payroll getPayrollById(Long id) {
        return PayrollRepository.getReferenceById(id);
    }

    @Override
    public Payroll updatePayrollById(Long id, Payroll updatedPayroll) {
        Payroll old = PayrollRepository.getReferenceById(id);
        old.setStatus(updatedPayroll.getStatus());
        old.setBonusPay(updatedPayroll.getBonusPay());
        old.setNetPay(updatedPayroll.getNetPay());
        old.setTotalDeductions(updatedPayroll.getTotalDeductions());
        PayrollRepository.save(old);
        return old;
    }

    @Override
    public void deletePayroll(Long id) {
        PayrollRepository.deleteById(id);
    }
}

