package cl.hub.movieratings.repository;

import cl.hub.movieratings.model.Rol;
import cl.hub.movieratings.model.Usuario;
import cl.hub.movieratings.model.UsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface UsuarioRolRepository extends JpaRepository<UsuarioRol, Long> {

    List<UsuarioRol> findByUsuario(Usuario usuario);

    List<UsuarioRol> findByRol(Rol rol);


}
