package pe.com.cepen.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cepen.entity.UsuarioEntity;
import pe.com.cepen.repository.UsuarioRepository;
import pe.com.cepen.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository repositorio;
    
    @Override
    public List<UsuarioEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<UsuarioEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<UsuarioEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public UsuarioEntity add(UsuarioEntity u) {
        return repositorio.save(u);
    }

    @Override
    public UsuarioEntity update(UsuarioEntity u) {
        UsuarioEntity objUsuario = repositorio.getById(u.getId_usu());
        BeanUtils.copyProperties(u, objUsuario);
        return repositorio.save(objUsuario);
    }

    @Override
    public UsuarioEntity delete(UsuarioEntity u) {
        UsuarioEntity objUsuario = repositorio.getById(u.getId_usu());
        objUsuario.setEsta_usu(false);
        return repositorio.save(objUsuario);
    }

    @Override
    public UsuarioEntity getUsuLogin(String username, String contra_usu) {
        return repositorio.getUsuLogin(username, contra_usu);
    }
    
}
