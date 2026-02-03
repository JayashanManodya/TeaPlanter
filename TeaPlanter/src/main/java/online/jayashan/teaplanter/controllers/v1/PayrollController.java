package online.jayashan.teaplanter.controllers.v1;

import lombok.RequiredArgsConstructor;
import online.jayashan.teaplanter.entities.Payroll;
import online.jayashan.teaplanter.services.implement.PayrollServicImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Payrolls")
@RequiredArgsConstructor
public class PayrollController {


    private final PayrollServicImpl PayrollService;

    @GetMapping
    public List<Payroll> getPayrolls() {
        return PayrollService.getAllPayrolls();
    }


    @GetMapping("/{id}")
    public Payroll getPayrollById(@PathVariable Long id) {
        return PayrollService.getPayrollById(id);
    }

    @PostMapping
    public Payroll createPayroll(@RequestBody Payroll Payroll) {
        return PayrollService.createNewPayroll(Payroll);
    }

    @PutMapping("/{id}")
    public Payroll updatePayroll(@PathVariable Long id, @RequestBody Payroll updatedPayroll) {
        return PayrollService.updatePayrollById(id, updatedPayroll);
    }

    @DeleteMapping("/{id}")
    public void deletePayroll(@PathVariable Long id) {
        PayrollService.deletePayroll(id);
    }
}
