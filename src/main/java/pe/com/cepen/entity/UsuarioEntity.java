package pe.com.cepen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Entity(name="UsuarioEntity")
@Table(name ="usuarios")
public class UsuarioEntity implements Serializable{    
    
    private static final long SerialVersionUID = 1L;
    
    @Id
    @Column(name="id_usu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_usu;
    
    @Column(name="username")
    private String username;
    
    @Column(name="contra_usu")
    private String contra_usu;
    
    @Column(name="tipo_usu")
    private String tipo_usu;
    
    @Column(name="esta_usu")
    private boolean esta_usu;
    
    
}
