package pe.com.cepen.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="TrabajadorEntity")
@Table(name ="trabajadores")
public class TrabajadorEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="id_traba")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_traba;
    
    @Column(name="nom_trab")
    private String nom_trab;
    
    @Column(name="ap_traba")
    private String ap_traba;
    
    @Column(name="doc_traba")
    private String doc_traba;
    
    @Column(name="correo_traba")
    private String correo_traba;
    
    @Column(name="celu_traba")
    private String celu_traba;
    
    @Column(name="tipo_traba")
    private String tipo_traba;
    
    @Column(name="esta_traba")
    private boolean esta_traba; 
    
    @OneToOne
    @JoinColumn(name="id_usu", nullable = false)
    private UsuarioEntity usuario;
}
