package cl.hub.movieratings.service.serviceimpl;


import cl.hub.movieratings.model.Calificacion;
import cl.hub.movieratings.repository.CalificacionRepository;
import cl.hub.movieratings.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CalificacionServiceImpl  implements CalificacionService {

    private final CalificacionRepository calificacionRepository;

    @Autowired
    public CalificacionServiceImpl(CalificacionRepository calificacionRepository) {
        this.calificacionRepository = calificacionRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Calificacion obtenerCalificacionPorId(Long id) {
        return calificacionRepository.findById(id).orElseThrow(() -> new RuntimeException("Calificacion no encontrada"));
    }

    @Override
    @Transactional
    public Calificacion guardarCalificacion(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    @Override
    @Transactional
    public Calificacion actualizarCalificacion(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    @Override
    @Transactional
    public void eliminarCalificacion(Long id) {
        calificacionRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Calificacion> obtenerCalificaciones() {
        return calificacionRepository.findAll();
    }
}
