package online.jayashan.teaplanter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payroll")
@Data
public class payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    Long workerId ;
    double basePayTotal;
    double bonusPay;
    double totalDeductions;
    double netPay;
    String status ;
}
