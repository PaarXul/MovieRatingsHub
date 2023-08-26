package cl.hub.movieratings.service;

import cl.hub.movieratings.model.Usuario;

import java.util.List;

public interface UsuarioService {


    Usuario obtenerUsuarioPorId(Long id);

    Usuario obtenerUsuarioPorNombre(String nombre);

    Usuario guardarUsuario(Usuario usuario);

    Usuario actualizarUsuario(Usuario usuario);

    void eliminarUsuario(Long id);

    List<Usuario> obtenerUsuarios();

    Usuario Login(String nombre, String contrasena);

}
