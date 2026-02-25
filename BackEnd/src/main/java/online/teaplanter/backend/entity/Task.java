package online.teaplanter.backend.entity;

import online.teaplanter.backend.entity.Worker;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name="tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String title;

    private String description;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="assign_worker_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Worker assignedWorker;

    @Column(nullable=false)
    private String priority;

    @Column(nullable=false)
    private String status;

    private LocalDateTime createdAt;
    private LocalTime completedAt;

    private String plotId;

    private String taskCategory;
    private Double paymentAmount;
    private LocalDate taskDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="plantation_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Plantation plantation;
}
