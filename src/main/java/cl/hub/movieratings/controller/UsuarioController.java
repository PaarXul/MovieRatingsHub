package cl.hub.movieratings.controller;


import cl.hub.movieratings.model.Usuario;
import cl.hub.movieratings.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuario")
@CrossOrigin("*")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Usuario>> obtenerUsuarios() {
        return ResponseEntity.ok(usuarioService.obtenerUsuarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(usuarioService.obtenerUsuarioPorId(id));
    }
    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Usuario> obtenerUsuarioPorNombre(@PathVariable("nombre") String nombre) {
        return ResponseEntity.ok(usuarioService.obtenerUsuarioPorNombre(nombre));
    }

    @PostMapping("/")
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.guardarUsuario(usuario));
    }

    @PutMapping("/")
    public ResponseEntity<Usuario> actualizarUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.actualizarUsuario(usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable("id") Long id) {
        usuarioService.eliminarUsuario(id);
        return ResponseEntity.ok("Usuario eliminado correctamente");
    }


}
