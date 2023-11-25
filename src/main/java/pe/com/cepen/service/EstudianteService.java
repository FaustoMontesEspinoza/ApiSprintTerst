package pe.com.cepen.service;

import java.util.List;
import java.util.Optional;
import pe.com.cepen.entity.EstudianteEntity;


public interface EstudianteService {
    List<EstudianteEntity> findAll();
    List<EstudianteEntity> findAllCustom();
    Optional<EstudianteEntity> findById(long id);
    EstudianteEntity add(EstudianteEntity e);
    EstudianteEntity update(EstudianteEntity e);
    EstudianteEntity delete(EstudianteEntity e);
    List<EstudianteEntity> getByEstudianDni(long id, String doc_estu);
    EstudianteEntity obtenerEstudianteUsu(Long id_usu);
}
