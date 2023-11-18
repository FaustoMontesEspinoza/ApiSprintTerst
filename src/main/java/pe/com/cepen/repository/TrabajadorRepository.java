package pe.com.cepen.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.cepen.entity.TrabajadorEntity;



public interface TrabajadorRepository extends JpaRepository<TrabajadorEntity, Long>{
    @Query("SELECT t FROM TrabajadorEntity t WHERE t.esta_traba =true")
    List<TrabajadorEntity> findAllCustom();
}
