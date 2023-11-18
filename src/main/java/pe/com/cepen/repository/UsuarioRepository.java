package pe.com.cepen.repository;

import jakarta.persistence.TypedQuery;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.cepen.entity.EstudianteEntity;
import pe.com.cepen.entity.UsuarioEntity;


public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
    @Query("SELECT u FROM UsuarioEntity u WHERE u.esta_usu =true")
    List<UsuarioEntity> findAllCustom();
    
}
