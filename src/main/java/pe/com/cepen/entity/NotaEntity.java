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
@Entity(name="NotaEntity")
@Table(name ="notas")
public class NotaEntity implements Serializable{    
    
    private static final long SerialVersionUID = 1L;
    
    @Id
    @Column(name="id_nota")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_nota;
    
    @Column(name="ec1_nota")
    private double ec1_nota;
    
    @Column(name="ec2_nota")
    private double ec2_nota;
    
    @Column(name="ec3_nota")
    private double ec3_nota;
    
    @ManyToOne
    @JoinColumn(name="id_estu", nullable = false)
    private EstudianteEntity estudiante;
    
    @ManyToOne
    @JoinColumn(name="id_traba", nullable = false)
    private TrabajadorEntity trabajador;
    
    @ManyToOne
    @JoinColumn(name="id_curso", nullable = false)
    private CursoEntity id_curso;
}
