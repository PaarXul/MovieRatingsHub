package cl.hub.movieratings.repository;


import cl.hub.movieratings.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {


    Usuario findByNombreusuario(String nombreusuario);


}
