package pe.com.cepen.service;

import java.util.List;
import java.util.Optional;
import pe.com.cepen.entity.NotaEntity;


public interface NotaService {
    List<NotaEntity> findAll();
    Optional<NotaEntity> findById(long id);
    NotaEntity add(NotaEntity n);
    NotaEntity update(NotaEntity n);
    List<NotaEntity> CursoEstu(Long id_estu);
}
