package pe.com.cepen.service;

import java.util.List;
import java.util.Optional;
import pe.com.cepen.entity.PeriodoEntity;



public interface PeriodoService {
    List<PeriodoEntity> findAll();
    Optional<PeriodoEntity> findById(long id);
    PeriodoEntity add(PeriodoEntity p);
    PeriodoEntity update(PeriodoEntity p);
}
