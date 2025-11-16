package projects.repo.controller;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;
import projects.repo.repository.TaskRepository;

import java.util.List;

@RestController
public class TaskController {

    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/task")
    public List<Task> findAll() {
        return repository.findAll();
    }
    @PostMapping("/task")
    public Task createTask(Task task) {
        return repository.save(task);
    }
    @PutMapping("/task/{id}")
    public Task updateTask(Task task) {
        return repository.save(task);
    }
    @DeleteMapping("/task/{id}")
    public void deleteTask(Task task) {
        repository.delete(task);
    }



}
