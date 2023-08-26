package cl.hub.movieratings.controller;


import cl.hub.movieratings.model.Calificacion;
import cl.hub.movieratings.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/calificacion")
@CrossOrigin("*")
public class CalificacionController {

    private final CalificacionService calificacionService;

    @Autowired
    public CalificacionController(CalificacionService calificacionService) {
        this.calificacionService = calificacionService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Calificacion>> obtenerCalificaciones() {
        return ResponseEntity.ok(calificacionService.obtenerCalificaciones());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calificacion> obtenerCalificacionPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(calificacionService.obtenerCalificacionPorId(id));
    }

    @PostMapping("/")
    public ResponseEntity<Calificacion> guardarCalificacion(@RequestBody Calificacion calificacion) {
        return ResponseEntity.ok(calificacionService.guardarCalificacion(calificacion));
    }

    @PutMapping("/")
    public ResponseEntity<Calificacion> actualizarCalificacion(@RequestBody Calificacion calificacion) {
        return ResponseEntity.ok(calificacionService.actualizarCalificacion(calificacion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarCalificacion(@PathVariable("id") Long id) {
        calificacionService.eliminarCalificacion(id);
        return ResponseEntity.ok("Calificacion eliminada correctamente");
    }
}
