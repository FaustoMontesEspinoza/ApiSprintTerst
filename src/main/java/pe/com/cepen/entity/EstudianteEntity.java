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
@Entity(name="EstudianteEntity")
@Table(name ="estudiantes")
public class EstudianteEntity implements Serializable{
    
    private static final long SerialVersionUID = 1L;

    
    @Id
    @Column(name="id_estu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_estu;
    
    @Column(name="nom_estu")
    private String nom_estu;
    
    @Column(name="appa_estu")
    private String appa_estu;
    
    @Column(name="apma_estu")
    private String apma_estu;
    
    @Column(name="doc_estu")
    private String doc_estu;
    
    @Column(name="dire_estu")
    private String dire_estu;
    
    @Column(name="celu_estu")
    private String celu_estu;
    
    @Column(name="correo_estu")
    private String correo_estu;
    
    @Column(name="genero_estu")
    private String genero_estu;
    
    @Column(name="esta_estu")
    private boolean esta_estu;
    
   
    @OneToOne
    @JoinColumn(name="id_usu", nullable = false, referencedColumnName = "id_usu")
    private UsuarioEntity usuario;
}
