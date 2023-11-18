package pe.com.cepen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.cepen.entity.HorarioEntity;


public interface HorarioRepository extends JpaRepository<HorarioEntity, Long>{
    
}
