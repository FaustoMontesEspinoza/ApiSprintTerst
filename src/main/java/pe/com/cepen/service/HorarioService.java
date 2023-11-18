package pe.com.cepen.service;

import java.util.List;
import java.util.Optional;
import pe.com.cepen.entity.HorarioEntity;

public interface HorarioService {
    List<HorarioEntity> findAll();
    Optional<HorarioEntity> findById(long id);
    HorarioEntity add(HorarioEntity h);
    HorarioEntity update(HorarioEntity h);
}
