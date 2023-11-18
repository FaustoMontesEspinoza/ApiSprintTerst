package pe.com.cepen.service;

import java.util.List;
import java.util.Optional;
import pe.com.cepen.entity.UsuarioEntity;


public interface UsuarioService {
    List<UsuarioEntity> findAll();
    List<UsuarioEntity> findAllCustom();
    Optional<UsuarioEntity> findById(long id);
    UsuarioEntity add(UsuarioEntity u);
    UsuarioEntity update(UsuarioEntity u);
    UsuarioEntity delete(UsuarioEntity u);
}
