package projects.repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;
import projects.repo.repository.TaskRepository;
import projects.repo.model.Task;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task crearTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task updatedTask) {
        return taskRepository.findById(id)
                .map(existingTask -> {
                    existingTask.setTitulo(updatedTask.getTitulo());
                    existingTask.setCompleto(updatedTask.isCompleto());
                    return taskRepository.save(existingTask);
                })
                .orElse(null);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }



}
