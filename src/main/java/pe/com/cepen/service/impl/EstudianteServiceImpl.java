package pe.com.cepen.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cepen.entity.EstudianteEntity;
import pe.com.cepen.repository.EstudianteRepository;
import pe.com.cepen.service.EstudianteService;


@Service
public class EstudianteServiceImpl implements EstudianteService{

    @Autowired
    private EstudianteRepository repositorio;
    
    
    @Override
    public List<EstudianteEntity> findAll() {
        return repositorio.findAll();   
    }

    @Override
    public List<EstudianteEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<EstudianteEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public EstudianteEntity add(EstudianteEntity e) {

        return repositorio.save(e);

    }

    @Override
    public EstudianteEntity update(EstudianteEntity e) {
        EstudianteEntity objEstudiante = repositorio.getById(e.getId_estu());
        BeanUtils.copyProperties(e, objEstudiante);
        return repositorio.save(objEstudiante);
    }

    @Override
    public EstudianteEntity delete(EstudianteEntity e) {
        EstudianteEntity objEstudiante = repositorio.getById(e.getId_estu());
        objEstudiante.setEsta_estu(false);
        return repositorio.save(objEstudiante);
    }

    @Override
    public List<EstudianteEntity> getByEstudianDni(long id, String doc_estu) {
        return repositorio.getByEstudianDni(id, doc_estu);
    }

    @Override
    public EstudianteEntity obtenerEstudianteUsu(Long id_usu) {
        return repositorio.obtenerEstudianteUsu(id_usu);
    }
    
}
