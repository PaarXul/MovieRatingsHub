package cl.hub.movieratings.service.serviceimpl;


import cl.hub.movieratings.model.Genero;
import cl.hub.movieratings.repository.GeneroRepository;
import cl.hub.movieratings.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {

    private final GeneroRepository generoRepository;

    @Autowired
    public GeneroServiceImpl(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public Genero obtenerGeneroPorId(Long id) {
        return generoRepository.findById(id).orElseThrow(() -> new RuntimeException("Genero no encontrado"));
    }

    @Override
    @Transactional
    public Genero guardarGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    @Override
    @Transactional
    public Genero actualizarGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    @Override
    @Transactional
    public void eliminarGenero(Long id) {
        generoRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Genero> obtenerGeneros() {
        return generoRepository.findAll();
    }
}
