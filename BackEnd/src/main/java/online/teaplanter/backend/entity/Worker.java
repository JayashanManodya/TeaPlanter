package online.teaplanter.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;

@Entity
@Table(name = "workers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workerFunctions;

    @OneToOne
    @JoinColumn(name = "user_id")// after add the user(Buddhi)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private User user;

    @ManyToOne// after add the plantation
    @JoinColumn(name = "plantation_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Plantation plantation;

    private LocalDate joinDate;

    private String assignedBlock;

    @Column(nullable = false)
    private String status; // Active, On Leave, Inactive

    private Double monthlyHarvest; // This might be calculated, but can store summary
}
