package pe.com.cepen.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cepen.entity.MatriculaEntity;
import pe.com.cepen.repository.MatriculaRepository;
import pe.com.cepen.service.MatriculaService;


@Service
public class MatriculaServiceImpl implements MatriculaService{
    
    @Autowired
    private MatriculaRepository repositorio;

    @Override
    public List<MatriculaEntity> findAll() {
        return repositorio.findAll(); 
    }

    @Override
    public List<MatriculaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<MatriculaEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public MatriculaEntity add(MatriculaEntity m) {
        return repositorio.save(m);
    }

    @Override
    public MatriculaEntity update(MatriculaEntity m) {
        MatriculaEntity objMatricula = repositorio.getById(m.getId_matri());
        BeanUtils.copyProperties(m, objMatricula);
        return repositorio.save(objMatricula);
    }

    @Override
    public MatriculaEntity delete(MatriculaEntity m) {
        MatriculaEntity objMatricula = repositorio.getById(m.getId_matri());
        objMatricula.setEsta_matricula(false);
        return repositorio.save(objMatricula);
    }

    @Override
    public List<MatriculaEntity> findReporte(Date fecha1, Date fecha2) {
        return repositorio.findReporte(fecha1, fecha2);
    }

    @Override
    public  MatriculaEntity findMatriculaEstu(Long id_estu) {
        return repositorio.findMatriculaEstu(id_estu);
    }
    
    
    
}
