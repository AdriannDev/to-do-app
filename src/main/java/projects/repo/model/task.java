package projects.repo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class task {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private boolean completo;

    public task() {
    }

    public task(boolean completo, String titulo) {
        this.completo = completo;
        this.titulo = titulo;
    }
}
