package pe.com.cepen.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.cepen.entity.UsuarioEntity;


public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
    @Query("SELECT u FROM UsuarioEntity u WHERE u.esta_usu =true")
    List<UsuarioEntity> findAllCustom();
    
    @Query("SELECT u FROM UsuarioEntity u WHERE u.username = :username AND u.contra_usu = :contra_usu")
    UsuarioEntity getUsuLogin (@Param("username") String username, @Param("contra_usu") String contra_usu);
}
