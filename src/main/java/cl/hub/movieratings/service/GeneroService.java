package cl.hub.movieratings.service;

import cl.hub.movieratings.model.Genero;

import java.util.List;

public interface GeneroService {

    Genero obtenerGeneroPorId(Long id);
    Genero guardarGenero(Genero genero);

    Genero actualizarGenero(Genero genero);

    void eliminarGenero(Long id);

    List<Genero> obtenerGeneros();

}
