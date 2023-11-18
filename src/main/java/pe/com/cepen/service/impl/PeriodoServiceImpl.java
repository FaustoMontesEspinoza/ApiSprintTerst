package pe.com.cepen.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cepen.entity.PeriodoEntity;
import pe.com.cepen.repository.PeriodoRepository;
import pe.com.cepen.service.PeriodoService;


@Service
public class PeriodoServiceImpl implements PeriodoService{

    @Autowired
    private PeriodoRepository repositorio;
    
    @Override
    public List<PeriodoEntity> findAll() {
        return repositorio.findAll(); 
    }

    @Override
    public Optional<PeriodoEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public PeriodoEntity add(PeriodoEntity p) {
        return repositorio.save(p);
    }

    @Override
    public PeriodoEntity update(PeriodoEntity p) {
        PeriodoEntity objPeriodo = repositorio.getById(p.getId_perio());
        BeanUtils.copyProperties(p, objPeriodo);
        return repositorio.save(objPeriodo);
    }
    
}
