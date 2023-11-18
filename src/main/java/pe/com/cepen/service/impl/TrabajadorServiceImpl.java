package pe.com.cepen.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cepen.entity.TrabajadorEntity;
import pe.com.cepen.repository.TrabajadorRepository;

import pe.com.cepen.service.TrabajadorService;


@Service
public class TrabajadorServiceImpl implements TrabajadorService{
    
    @Autowired
    private TrabajadorRepository repositorio;
    
    @Override
    public List<TrabajadorEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<TrabajadorEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<TrabajadorEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public TrabajadorEntity add(TrabajadorEntity t) {
        return repositorio.save(t);
    }

    @Override
    public TrabajadorEntity update(TrabajadorEntity t) {
        TrabajadorEntity objTrabajador = repositorio.getById(t.getId_traba());
        BeanUtils.copyProperties(t, objTrabajador);
        return repositorio.save(objTrabajador);
    }

    @Override
    public TrabajadorEntity delete(TrabajadorEntity t) {
        TrabajadorEntity objTrabajador = repositorio.getById(t.getId_traba());
        objTrabajador.setEsta_traba(false);
        return repositorio.save(objTrabajador);
    }
    
}
