package projects.repo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import projects.repo.model.Task;
import org.springframework.web.bind.annotation.*;
import projects.repo.repository.TaskRepository;
import projects.repo.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {
    @Autowired
    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    public List<Task> findAll() {
        return taskService.findAll();
    }
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.crearTask(task);
    }
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        return taskService.updateTask(id, taskDetails);
    }
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

}
