package online.teaplanter.teaplanterbackend.repository;

import online.teaplanter.teaplanterbackend.entity.Harvest;
import online.teaplanter.teaplanterbackend.entity.Plot;
import online.teaplanter.teaplanterbackend.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface HarvestRepository extends JpaRepository<Harvest, Long> {
    List<Harvest> findByWorker(Worker worker);

    List<Harvest> findByPlot(Plot plot);

    List<Harvest> findByHarvestDateBetween(LocalDate start, LocalDate end);

    List<Harvest> findByWorkerAndHarvestDateBetween(Worker worker, LocalDate start, LocalDate end);

    List<Harvest> findByHarvestDate(LocalDate date);

    List<Harvest> findByPlantation(online.jayashan.teaplanter.entity.Plantation plantation);

    List<Harvest> findByWorkerAndPlantation(Worker worker, online.jayashan.teaplanter.entity.Plantation plantation);
}
