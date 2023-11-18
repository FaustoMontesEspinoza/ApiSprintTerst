package pe.com.cepen.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cepen.entity.HorarioEntity;
import pe.com.cepen.repository.HorarioRepository;
import pe.com.cepen.service.HorarioService;


@Service
public class HorarioServiceImpl implements HorarioService{

    @Autowired
    private HorarioRepository repositorio;
    
    @Override
    public List<HorarioEntity> findAll() {
        return repositorio.findAll(); 
    }

    @Override
    public Optional<HorarioEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public HorarioEntity add(HorarioEntity h) {
        return repositorio.save(h);
    }

    @Override
    public HorarioEntity update(HorarioEntity h) {
        HorarioEntity objHorario = repositorio.getById(h.getId_hora());
        BeanUtils.copyProperties(h, objHorario);
        return repositorio.save(objHorario);
    }
    
}
