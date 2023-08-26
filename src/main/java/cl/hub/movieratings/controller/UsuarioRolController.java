package cl.hub.movieratings.controller;

import cl.hub.movieratings.model.UsuarioRol;
import cl.hub.movieratings.service.UsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario-rol")
@CrossOrigin("*")
public class UsuarioRolController {
    private final UsuarioRolService usuarioRolService;

    @Autowired
    public UsuarioRolController(UsuarioRolService usuarioRolService) {
        this.usuarioRolService = usuarioRolService;
    }

    @PostMapping("/")
    public ResponseEntity<UsuarioRol> guardarUsuarioRol(@RequestBody UsuarioRol usuarioRol) throws Exception {
        return ResponseEntity.ok(usuarioRolService.guardarUsuarioRol(usuarioRol));
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<UsuarioRol>> obtenerUsuarioRolUsuario(@PathVariable("usuarioId") Long usuarioId) {
        return ResponseEntity.ok(usuarioRolService.obtenerUsuarioRolUsuario(usuarioId));
    }

    @DeleteMapping("/{usuarioRolId}")
    public ResponseEntity<?> eliminarUsuarioRol(@PathVariable("usuarioRolId") Long usuarioRolId) {
        usuarioRolService.eliminarUsuarioRol(usuarioRolId);
        return ResponseEntity.ok(usuarioRolId + " eliminado");
    }

    @GetMapping("/")
    public ResponseEntity<List<UsuarioRol>> obtenerUsuarioRol() {
        return ResponseEntity.ok(usuarioRolService.obtenerUsuarioRol());
    }

    @GetMapping("/rol/{rolId}")
    public ResponseEntity<List<UsuarioRol>> obtenerUsuarioRolRol(@PathVariable("rolId") Long rolId) {
        return ResponseEntity.ok(usuarioRolService.obtenerUsuarioRolRol(rolId));
    }

    @PutMapping("/")
    public ResponseEntity<UsuarioRol> actualizarUsuarioRol(@RequestBody UsuarioRol usuarioRol) throws Exception {
        return ResponseEntity.ok(usuarioRolService.actualizarUsuarioRol(usuarioRol));
    }
}