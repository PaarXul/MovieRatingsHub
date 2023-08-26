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
public class CalculoPromedioImpl implements CalculoPromedio {

    private final CalificacionRepository calificacionRepository;

    private final PeliculaRepository peliculaRepository;

    public CalculoPromedioImpl(CalificacionRepository calificacionRepository, PeliculaRepository peliculaRepository) {
        this.calificacionRepository = calificacionRepository;
        this.peliculaRepository = peliculaRepository;
    }


    //Cálculo del Promedio Ponderado (calculoPromedioImpl):
    // - Para cada película en la lista:
    // - Suma todas las valoraciones proporcionadas por los usuarios para cada película en particular.
    // - Cuenta el número total de valoraciones para la película.
    // Calcula el promedio ponderado de la película utilizando la fórmula: `Promedio = Suma de Valoraciones / Número de Valoraciones
    @Override
    public float calcularPromedio(float[] ratings) {

        float promedio = 0;

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
