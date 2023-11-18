package pe.com.cepen.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.cepen.entity.PagoEntity;



public interface PagoRepository extends JpaRepository<PagoEntity, Long>{
    @Query("SELECT p FROM PagoEntity p WHERE p.esta_pago =true")
    List<PagoEntity> findAllCustom();
}
