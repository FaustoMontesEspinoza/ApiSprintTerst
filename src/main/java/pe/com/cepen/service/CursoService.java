package pe.com.cepen.service;

import java.util.List;
import java.util.Optional;
import pe.com.cepen.entity.CursoEntity;


public interface CursoService {
    List<CursoEntity> findAll();
    Optional<CursoEntity> findById(long id);
    CursoEntity add(CursoEntity cu);
    CursoEntity update(CursoEntity cu);
    
    List<CursoEntity> findCursoCarrera(long id_estu);
}
