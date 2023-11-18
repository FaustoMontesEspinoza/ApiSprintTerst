package pe.com.cepen.service;

import java.util.List;
import java.util.Optional;
import pe.com.cepen.entity.CarreraEntity;


public interface CarreraService {
    List<CarreraEntity> findAll();
    Optional<CarreraEntity> findById(long id);
    CarreraEntity add(CarreraEntity c);
    CarreraEntity update(CarreraEntity c);
}
