package pe.com.cepen.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.cepen.entity.EstudianteEntity;


public interface EstudianteRepository extends JpaRepository<EstudianteEntity,Long>{
    @Query("SELECT e FROM EstudianteEntity e WHERE e.esta_estu =true")
    List<EstudianteEntity> findAllCustom();
    
    @Query("SELECT e FROM EstudianteEntity e WHERE usuario.id_usu = :id_usu AND usuario.esta_usu = false  AND e.doc_estu =:doc_estu ")
    List<EstudianteEntity> getByEstudianDni(Long id_usu ,String doc_estu);
    
    @Query("SELECT e FROM EstudianteEntity e WHERE usuario.id_usu = :id_usu AND usuario.esta_usu = true")
    EstudianteEntity obtenerEstudianteUsu(Long id_usu);
}
