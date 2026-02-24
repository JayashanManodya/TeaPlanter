package online.teaplanter.teaplanterbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import online.teaplanter.teaplanterbackend.entity.InventoryItem;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
}
