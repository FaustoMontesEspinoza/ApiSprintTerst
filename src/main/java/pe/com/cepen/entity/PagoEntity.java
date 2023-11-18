package pe.com.cepen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="PagoEntity")
@Table(name ="pagos")
public class PagoEntity implements Serializable{    
    
    private static final long SerialVersionUID = 1L;
    
    @Id
    @Column(name="id_pago")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pago;
    
    @Column(name="costo_pago")
    private Double costo_pago;
    
    @Column(name="fec_cadu_pago")
    private Date fec_cadu_pago;
    
    @Column(name="esta_pago")
    private boolean esta_pago;
    
    @ManyToOne
    @JoinColumn(name="id_matri", nullable = false)
    private MatriculaEntity matricula;
}
