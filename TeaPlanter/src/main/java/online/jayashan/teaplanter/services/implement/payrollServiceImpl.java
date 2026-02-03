package online.jayashan.teaplanter.services.implement;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import online.jayashan.teaplanter.entities.payroll;
import online.jayashan.teaplanter.services.payrollService;
import online.jayashan.teaplanter.repositories.payrollRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class payrollServiceImpl implements payrollService {
    payrollRepository payrollRepository;

    @Override
    public payroll createNewStudent(payroll payroll) {
        return payrollRepository.save(payroll);
    }

    @Override
    public List<payroll> getAllStudents() {
        return payrollRepository.findAll();
    }

    @Override
    public payroll getStudentById(Long id) {
        return payrollRepository.getReferenceById(id);
    }

    @Override
    public payroll updateStudentById(Long id, payroll updatedpayroll) {
        payroll old = payrollRepository.getReferenceById(id);
        old.setStatus(updatedpayroll.getStatus());
        old.setBonusPay(updatedpayroll.getBonusPay());
        old.setNetPay(updatedpayroll.getNetPay());
        old.setTotalDeductions(updatedpayroll.getTotalDeductions());
        payrollRepository.save(old);
        return old;
    }

    @Override
    public void deleteStudent(Long id) {
        payrollRepository.deleteById(id);
    }
}

