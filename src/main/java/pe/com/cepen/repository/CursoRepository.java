package pe.com.cepen.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.cepen.entity.CursoEntity;


public interface CursoRepository extends JpaRepository<CursoEntity,Long>{
    @Query("SELECT c FROM CursoEntity c WHERE carrera.id_carre = :id_carre")
    List<CursoEntity> findCursoCarrera(@Param("id_carre") Long id_estu);
}
