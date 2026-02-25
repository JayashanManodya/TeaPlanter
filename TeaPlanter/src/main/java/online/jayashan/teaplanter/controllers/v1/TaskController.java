package online.jayashan.teaplanter.controllers.v1;

import online.jayashan.teaplanter.entities.Task;
import online.jayashan.teaplanter.services.implement.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/assign/{workId}")
    public Task assignTask(@PathVariable Long workerId,@RequestBody Task task){
        return taskService.assignTask(workerId,task);
    }

    @PutMapping("/complete/{taskId}")
    public Task completeTask(@PathVariable Long taskId,@RequestParam double output){
        return taskService.completedTask(taskId,output);
    }

}
