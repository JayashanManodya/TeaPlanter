package online.teaplanter.teaplanterbackend.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "factories")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String registerNo;

    private String contactNumber;

    private String lorrySupervisorName;

    private String lorrySupervisorContact;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plantation_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Plantation plantation;
}
