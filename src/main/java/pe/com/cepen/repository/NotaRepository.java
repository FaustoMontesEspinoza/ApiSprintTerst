package pe.com.cepen.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.cepen.entity.NotaEntity;


public interface NotaRepository extends JpaRepository<NotaEntity, Long>{
    
    @Query("SELECT n FROM NotaEntity n WHERE estudiante.id_estu = :id_estu")
        List<NotaEntity> CursoEstu(@Param("id_estu") Long id_estu);
}
