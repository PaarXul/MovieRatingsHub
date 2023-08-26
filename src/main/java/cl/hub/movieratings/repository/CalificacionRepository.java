package cl.hub.movieratings.repository;


import cl.hub.movieratings.model.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CalificacionRepository extends JpaRepository<Calificacion,Long> {


}
