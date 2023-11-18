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
@Entity(name="MatriculaEntity")
@Table(name ="matriculas")
public class MatriculaEntity implements Serializable{    
    
    private static final long SerialVersionUID = 1L;
    
    @Id
    @Column(name="id_matri")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_matri;
    
    @Column(name="fecha_matri")
    private Date fecha_matri;
    
    @Column(name="horario_matri")
    private String horario_matri;
    
    @Column(name="modalidad_matri")
    private String modalidad_matri;
    
    @Column(name="esta_matricula")
    private boolean esta_matricula;
    
    @ManyToOne
    @JoinColumn(name="id_estu", nullable = false)
    private EstudianteEntity estudiante;
    
    @ManyToOne
    @JoinColumn(name="id_traba", nullable = false)
    private TrabajadorEntity trabajador;
    
    @ManyToOne
    @JoinColumn(name="id_carre", nullable = false)
    private CarreraEntity carrera;
}
