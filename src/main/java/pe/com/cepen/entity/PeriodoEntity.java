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
@Entity(name="PeriodoEntity")
@Table(name ="periodos")
public class PeriodoEntity implements Serializable{    
    
    private static final long SerialVersionUID = 1L;
    
    @Id
    @Column(name="id_perio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_perio;
    
    @Column(name="nom_perio")
    private String nom_perio;
    
    @ManyToOne
    @JoinColumn(name="id_curso", nullable = false)
    private CursoEntity curso;
    
    @ManyToOne
    @JoinColumn(name="id_carre", nullable = false)
    private CarreraEntity carrera;
}
