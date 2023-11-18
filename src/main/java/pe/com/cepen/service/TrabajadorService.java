package pe.com.cepen.service;

import java.util.List;
import java.util.Optional;
import pe.com.cepen.entity.TrabajadorEntity;


public interface TrabajadorService {
    List<TrabajadorEntity> findAll();
    List<TrabajadorEntity> findAllCustom();
    Optional<TrabajadorEntity> findById(long id);
    TrabajadorEntity add(TrabajadorEntity t);
    TrabajadorEntity update(TrabajadorEntity t);
    TrabajadorEntity delete(TrabajadorEntity t);
}
