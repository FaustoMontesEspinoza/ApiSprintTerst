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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="CursoEntity")
@Table(name ="cursos")
public class CursoEntity implements Serializable{    
    
    private static final long SerialVersionUID = 1L;
    
    @Id
    @Column(name="id_curso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_curso;
    
    @Column(name="nom_curso")
    private String nom_curso;
    
    @ManyToOne
    @JoinColumn(name="id_traba", nullable = false)
    private TrabajadorEntity trabajador;
    
    @ManyToOne
    @JoinColumn(name="id_carre", nullable = false)
    private CarreraEntity carrera;
}
