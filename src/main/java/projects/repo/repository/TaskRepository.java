package projects.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.repo.model.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
