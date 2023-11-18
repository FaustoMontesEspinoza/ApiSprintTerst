package pe.com.cepen.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cepen.entity.CarreraEntity;
import pe.com.cepen.repository.CarreraRepository;
import pe.com.cepen.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService{

    @Autowired
    private CarreraRepository repositorio;
    
    @Override
    public List<CarreraEntity> findAll() {
        return repositorio.findAll();       
    }

    @Override
    public Optional<CarreraEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public CarreraEntity add(CarreraEntity c) {
        return repositorio.save(c);
    }

    @Override
    public CarreraEntity update(CarreraEntity c) {
        CarreraEntity objCarrera = repositorio.getById(c.getId_carre());
        BeanUtils.copyProperties(c, objCarrera);
        return repositorio.save(objCarrera);
    }
    
}
