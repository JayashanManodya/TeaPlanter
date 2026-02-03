package online.jayashan.teaplanter.controllers.v1;

import lombok.RequiredArgsConstructor;
import online.jayashan.teaplanter.entities.payroll;
import online.jayashan.teaplanter.services.PayrollService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/payrolls")
@RequiredArgsConstructor
public class payrollController {


    private final PayrollService payrollService;

    @GetMapping
    public List<payroll> getPayrolls() {
        return payrollService.getAllPayroll();
    }


    @GetMapping("/{id}")
    public payroll getPayrollById(@PathVariable Long id) {
        return payrollService.getPayrollById(id);
    }

    @PostMapping
    public payroll createPayroll(@RequestBody payroll payroll) {
        return payrollService.createPayroll(payroll);
    }

    @PutMapping("/{id}")
    public payroll updatePayroll(@PathVariable Long id, @RequestBody payroll updatedPayroll) {
        return payrollService.updatePayrollById(id, updatedPayroll);
    }

    @DeleteMapping("/{id}")
    public void deletePayroll(@PathVariable Long id) {
        payrollService.deletePayroll(id);
    }
}
