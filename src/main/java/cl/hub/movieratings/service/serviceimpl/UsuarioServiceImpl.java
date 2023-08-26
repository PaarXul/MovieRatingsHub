package cl.hub.movieratings.service.serviceimpl;


import cl.hub.movieratings.model.Usuario;
import cl.hub.movieratings.repository.UsuarioRepository;
import cl.hub.movieratings.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    @Transactional
    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario obtenerUsuarioPorNombre(String nombre) {
        return usuarioRepository.findByNombreusuario(nombre);
    }

    @Override
    @Transactional
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public Usuario actualizarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario Login(String nombre, String contrasena) {
        return usuarioRepository.findByNombreusuarioAndContrasena(nombre, contrasena);
    }
}
