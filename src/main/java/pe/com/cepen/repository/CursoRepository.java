package pe.com.cepen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.cepen.entity.CursoEntity;


public interface CursoRepository extends JpaRepository<CursoEntity,Long>{
    
}
