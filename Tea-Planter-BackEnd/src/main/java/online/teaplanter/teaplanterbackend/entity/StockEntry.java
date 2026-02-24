package online.teaplanter.teaplanterbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "stock_entries")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", nullable = false)
    private InventoryItem item;

    private double quantity;
    private double unitPrice;
    private String type; // Purchase, Usage, Correction
    private LocalDateTime entryDate;
}
