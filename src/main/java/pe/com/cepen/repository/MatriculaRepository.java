package pe.com.cepen.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.cepen.entity.MatriculaEntity;


public interface MatriculaRepository extends JpaRepository<MatriculaEntity, Long>{
    @Query("SELECT m FROM MatriculaEntity m WHERE m.esta_matricula =true")
    List<MatriculaEntity> findAllCustom();
    
    @Query("SELECT m FROM MatriculaEntity m "
            + "WHERE m.fecha_matri between :fecha1 AND :fecha2")
    List<MatriculaEntity> findReporte(@Param("fecha1") Date fecha1, @Param("fecha2") Date fecha2);
}
