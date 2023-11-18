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
import java.sql.Time;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="HorarioEntity")
@Table(name ="horarios")
public class HorarioEntity implements Serializable{    
    
    private static final long SerialVersionUID = 1L;
    
    @Id
    @Column(name="id_hora")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_hora;
    
    @Column(name="turno_hora")
    private String turno_hora;
        
    @Column(name="ini_hora")
    private Time ini_hora;
    
    @Column(name="fina_hora")
    private Time fina_hora;
    
    @ManyToOne
    @JoinColumn(name="id_curso", nullable = false)
    private CursoEntity curso;
    
}