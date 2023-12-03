/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cepen.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cepen.entity.CursoEntity;
import pe.com.cepen.repository.CursoRepository;
import pe.com.cepen.service.CursoService;


@Service
public class CursoServiceImpl implements CursoService{

    @Autowired
    private CursoRepository repositorio;
    
    @Override
    public List<CursoEntity> findAll() {
        return repositorio.findAll();       
    }

    @Override
    public Optional<CursoEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public CursoEntity add(CursoEntity cu) {
        return repositorio.save(cu);
    }

    @Override
    public CursoEntity update(CursoEntity cu) {
        CursoEntity objCurso = repositorio.getById(cu.getId_curso());
        BeanUtils.copyProperties(cu, objCurso);
        return repositorio.save(objCurso);
    }

    @Override
    public List<CursoEntity> findCursoCarrera(long id_estu) {
        return repositorio.findCursoCarrera(id_estu);
    }
    
}
