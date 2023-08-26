package cl.hub.movieratings.service;

import cl.hub.movieratings.model.Calificacion;

import java.util.List;

public interface CalificacionService {

    Calificacion obtenerCalificacionPorId(Long id);

    Calificacion guardarCalificacion(Calificacion calificacion);

    Calificacion actualizarCalificacion(Calificacion calificacion);

    void eliminarCalificacion(Long id);

    List<Calificacion> obtenerCalificaciones();



}
