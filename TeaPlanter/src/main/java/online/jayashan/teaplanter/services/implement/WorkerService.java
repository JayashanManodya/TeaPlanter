package online.jayashan.teaplanter.services.implement;

import online.jayashan.teaplanter.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import online.jayashan.teaplanter.entities.Worker;

import java.util.List;


@Service
public class WorkerService {
    @Autowired
    private WorkerRepository workerRepository;

    public Worker addWorker(Worker worker){
        return workerRepository.save(worker);
    }

    public List<Worker> getAllWorkers(){
        return workerRepository.findByActiveTrue();
    }
    public Worker updateWorker(Long id,Worker updatedWorker){
        Worker worker=workerRepository.findById(id).orElseThrow();
        worker.setName(updatedWorker.getName());
        worker.setRole(updatedWorker.getRole());
        worker.setDailyWage(updatedWorker.getDailyWage());
        return workerRepository.save(worker);
    }

}
