package online.teaplanter.teaplanterbackend.repository;

import online.teaplanter.teaplanterbackend.entity.TeaDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface TeaDeliveryRepository extends JpaRepository<TeaDelivery, Long> {
    List<TeaDelivery> findByFactoryId(Long factoryId);

    List<TeaDelivery> findByDeliveryDateBetween(java.time.LocalDate start, java.time.LocalDate end);

    List<TeaDelivery> findByDeliveryDate(java.time.LocalDate date);

    List<TeaDelivery> findByPlantation(online.jayashan.teaplanter.entity.Plantation plantation);
}
