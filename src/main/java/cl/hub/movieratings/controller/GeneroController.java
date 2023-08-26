package cl.hub.movieratings.controller;


import cl.hub.movieratings.model.Genero;
import cl.hub.movieratings.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/genero")
@CrossOrigin("*")
public class GeneroController {

    private final GeneroService generoService;

    @Autowired
    public GeneroController(GeneroService generoService) {
        this.generoService = generoService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Genero>> obtenerGeneros() {
        return ResponseEntity.ok(generoService.obtenerGeneros());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genero> obtenerGeneroPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(generoService.obtenerGeneroPorId(id));
    }

    @PostMapping("/")
    public ResponseEntity<Genero> guardarGenero(@RequestBody Genero genero) {
        return ResponseEntity.ok(generoService.guardarGenero(genero));
    }

    @PutMapping("/")
    public ResponseEntity<Genero> actualizarGenero(@RequestBody Genero genero) {
        return ResponseEntity.ok(generoService.actualizarGenero(genero));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarGenero(@PathVariable("id") Long id) {
        generoService.eliminarGenero(id);
        return ResponseEntity.ok("Genero eliminado correctamente");
    }


}
