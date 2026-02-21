package online.teaplanter.teaplanterbackend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "inventoy_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name; // fertilizer, pesticide, tools
    private String category;
    private String unit;
    private double currentStock;
    private double unitPrice; // kg, liters, units
    private double recorderLevel;

}
