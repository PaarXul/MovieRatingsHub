package cl.hub.movieratings.service;

import cl.hub.movieratings.model.Pelicula;

import java.util.List;

public interface PeliculaService {

    Pelicula obtenerPeliculaPorId(Long id);

    Pelicula guardarPelicula(Pelicula pelicula);

    Pelicula actualizarPelicula(Pelicula pelicula);

    void eliminarPelicula(Long id);

    List<Pelicula> obtenerPeliculas();

}
