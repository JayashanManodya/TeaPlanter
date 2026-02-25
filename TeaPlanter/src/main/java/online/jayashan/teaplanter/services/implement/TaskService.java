package online.jayashan.teaplanter.services.implement;

import online.jayashan.teaplanter.repositories.TaskRepository;
import online.jayashan.teaplanter.repositories.WorkerRepository;
import online.jayashan.teaplanter.entities.Task;
import online.jayashan.teaplanter.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private WorkerRepository workerRepository;

    public Task assignTask(Long workerId,Task task){
        Worker worker=workerRepository.findById(workerId).orElseThrow();
        task.setWorker(worker);
        task.setStatus("Assigned");
        return taskRepository.save(task);
    }

    public Task completedTask(Long taskId,double actualOutput){
        Task task=taskRepository.findById(taskId).orElseThrow();
        task.setStatus("COMPLETED");
        task.setActualOutput(actualOutput);
        return taskRepository.save(task);
    }

}
