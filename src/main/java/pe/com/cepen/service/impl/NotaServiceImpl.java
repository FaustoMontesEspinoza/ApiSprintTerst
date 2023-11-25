package pe.com.cepen.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cepen.entity.NotaEntity;
import pe.com.cepen.repository.NotaRepository;
import pe.com.cepen.service.NotaService;

@Service
public class NotaServiceImpl implements NotaService{

    @Autowired
    private NotaRepository repositorio;
    
    @Override
    public List<NotaEntity> findAll() {
        return repositorio.findAll(); 
    }

    @Override
    public Optional<NotaEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public NotaEntity add(NotaEntity n) {
        return repositorio.save(n);
    }

    @Override
    public NotaEntity update(NotaEntity n) {
        NotaEntity objNota = repositorio.getById(n.getId_nota());
        BeanUtils.copyProperties(n, objNota);
        return repositorio.save(objNota);
    }

    @Override
    public List<NotaEntity> CursoEstu(Long id_estu) {
        return repositorio.CursoEstu(id_estu);
    }
    
}
