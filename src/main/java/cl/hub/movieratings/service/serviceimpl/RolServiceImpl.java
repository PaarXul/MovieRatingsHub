package cl.hub.movieratings.service.serviceimpl;

import cl.hub.movieratings.model.Rol;
import cl.hub.movieratings.repository.RolRepository;
import cl.hub.movieratings.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;
    @Autowired
    public RolServiceImpl(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    @Transactional
    public Rol agrergarRol(Rol rol) throws Exception {
        Rol rolLocal = rolRepository.findBynombre(rol.getNombre());

        if (rolLocal != null) {
            throw new Exception("Ya existe un rol con ese nombre");
        } else {
            rolLocal = rolRepository.save(rol);
        }
        return rolLocal;
    }

    @Override
    @Transactional(readOnly = true)
    public Rol obtenerRolPorId(Long id) {
        return rolRepository.findById(id).orElseThrow(() -> new RuntimeException("Rol no encontrado"));
    }

    @Override
    @Transactional
    public void eliminarRol(Long id) {
        rolRepository.deleteById(id);

    }

    @Override
    @Transactional
    public Rol actualizarRol(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public List<Rol> obtenerRoless() {
        return rolRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Rol obtenerRolPorNombre(String nombre) {
        return rolRepository.findBynombre(nombre);
    }


}
