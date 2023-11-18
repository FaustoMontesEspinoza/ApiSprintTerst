package pe.com.cepen.service;

import java.util.List;
import java.util.Optional;
import pe.com.cepen.entity.PagoEntity;


public interface PagoService {
    List<PagoEntity> findAll();
    List<PagoEntity> findAllCustom();
    Optional<PagoEntity> findById(long id);
    PagoEntity add(PagoEntity pa);
    PagoEntity update(PagoEntity pa);
    PagoEntity delete(PagoEntity pa);
}
