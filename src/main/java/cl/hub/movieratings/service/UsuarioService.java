package cl.hub.movieratings.service;

import cl.hub.movieratings.model.Usuario;
import cl.hub.movieratings.model.UsuarioRol;

import java.util.List;
import java.util.Set;

public interface UsuarioService {

    Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    Usuario obtenerUsuarioPorId(Long id);

    Usuario obtenerUsuarioPorNombre(String nombre);

    Usuario guardarUsuario(Usuario usuario);

    Usuario actualizarUsuario(Usuario usuario);

    void eliminarUsuario(Long id);

    List<Usuario> obtenerUsuarios();

    Usuario Login(String nombre, String contrasena);

}
