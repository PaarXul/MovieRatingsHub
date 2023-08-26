package cl.hub.movieratings.controller;


import cl.hub.movieratings.model.Pelicula;
import cl.hub.movieratings.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/peliculas")
@CrossOrigin("*")
public class PeliculaController {

    private final PeliculaService peliculaService;

    @Autowired
    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Pelicula>> obtenerPeliculas() {
        return ResponseEntity.ok(peliculaService.obtenerPeliculas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> obtenerPeliculaPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(peliculaService.obtenerPeliculaPorId(id));
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Pelicula> obtenerPeliculaPorNombre(@PathVariable("nombre") String nombre) {
        return ResponseEntity.ok(peliculaService.obtenerPeliculaPorNombre(nombre));
    }

    @PostMapping("/")
    public ResponseEntity<Pelicula> guardarPelicula(@RequestBody Pelicula pelicula) {
        return ResponseEntity.ok(peliculaService.guardarPelicula(pelicula));
    }

    @PutMapping("/")
    public ResponseEntity<Pelicula> actualizarPelicula(@RequestBody Pelicula pelicula) {
        return ResponseEntity.ok(peliculaService.actualizarPelicula(pelicula));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPelicula(@PathVariable("id") Long id) {
        peliculaService.eliminarPelicula(id);
        return ResponseEntity.ok("Pelicula eliminada correctamente");
    }

}
