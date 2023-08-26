package cl.hub.movieratings.service.serviceimpl;

import cl.hub.movieratings.model.Calificacion;
import cl.hub.movieratings.model.Pelicula;
import cl.hub.movieratings.repository.CalificacionRepository;
import cl.hub.movieratings.repository.PeliculaRepository;
import cl.hub.movieratings.service.CalculoPromedio;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class CalculoPromedioImpl2 implements CalculoPromedio {

    private final CalificacionRepository calificacionRepository;

    private final PeliculaRepository peliculaRepository;

    public CalculoPromedioImpl2(CalificacionRepository calificacionRepository, PeliculaRepository peliculaRepository) {
        this.calificacionRepository = calificacionRepository;
        this.peliculaRepository = peliculaRepository;
    }


    /*
    - Suma todos los promedios ponderados calculados en el paso anterior.
    - Divide la suma total de promedios ponderados por el número total de películas para obtener el
    promedio general de valoración de todas las películas.
     */

    float promedio = 0;


    @Override
    public float calcularPromedio(float[] ratings) {
        Set<Calificacion> calificaciones = new HashSet<>(calificacionRepository.findAll());
        Set<Pelicula> peliculas = new HashSet<>(peliculaRepository.findAll());

        for (Pelicula pelicula : peliculas) {
            float suma = 0;
            int contador = 0;
            for (Calificacion calificacion : calificaciones) {
                if (calificacion.getPelicula().equals(pelicula)) {
                    suma += calificacion.getPuntuacion();
                    contador++;
                }
            }
            promedio = suma / contador;
        }

        return promedio;
    }
}
