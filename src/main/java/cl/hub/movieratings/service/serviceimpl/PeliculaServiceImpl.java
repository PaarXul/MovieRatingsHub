package cl.hub.movieratings.service.serviceimpl;

import cl.hub.movieratings.model.Pelicula;
import cl.hub.movieratings.repository.PeliculaRepository;
import cl.hub.movieratings.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PeliculaServiceImpl implements PeliculaService {


    private final PeliculaRepository peliculaRepository;

    @Autowired
    public PeliculaServiceImpl(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public Pelicula obtenerPeliculaPorId(Long id) {
        return peliculaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pelicula no encontrada"));
    }

    @Override
    @Transactional
    public Pelicula guardarPelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @Override
    @Transactional
    public Pelicula actualizarPelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    @Override
    @Transactional
    public void eliminarPelicula(Long id) {
        peliculaRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pelicula> obtenerPeliculas() {
        return peliculaRepository.findAll();
    }

    @Override
    public Pelicula obtenerPeliculaPorNombre(String nombre) {
        return peliculaRepository.findByTitulo(nombre);
    }

}
