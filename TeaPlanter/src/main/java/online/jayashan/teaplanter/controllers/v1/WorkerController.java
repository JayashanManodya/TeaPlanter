package online.jayashan.teaplanter.controllers.v1;

import online.jayashan.teaplanter.entities.Worker;
import online.jayashan.teaplanter.services.implement.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workers")
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @PostMapping
    public Worker addWorker(@RequestBody Worker worker){
        return workerService.addWorker(worker);
    }

    @GetMapping
    public List<Worker> getWorkers(){
        return workerService.getAllWorkers();
    }
}
