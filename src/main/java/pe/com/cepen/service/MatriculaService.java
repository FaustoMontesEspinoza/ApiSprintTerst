package pe.com.cepen.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import pe.com.cepen.entity.MatriculaEntity;


public interface MatriculaService {
    List<MatriculaEntity> findAll();
    List<MatriculaEntity> findAllCustom();
    List<MatriculaEntity> findReporte(Date fecha1,Date fecha2);
    Optional<MatriculaEntity> findById(long id);
    MatriculaEntity add(MatriculaEntity m);
    MatriculaEntity update(MatriculaEntity m);
    MatriculaEntity delete(MatriculaEntity m);
}
