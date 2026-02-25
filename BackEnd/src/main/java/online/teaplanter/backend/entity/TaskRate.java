package online.teaplanter.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="task_rates")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false,unique = true)
    private String category;

    @Column(nullable = false)
    private Double rate;

    private String description;

    @Column(nullable=false)
    private String unit;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="plantation_id")
    private Plantation plantation;

}

