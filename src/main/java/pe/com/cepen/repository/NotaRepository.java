package pe.com.cepen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.cepen.entity.NotaEntity;


public interface NotaRepository extends JpaRepository<NotaEntity, Long>{
    
}
