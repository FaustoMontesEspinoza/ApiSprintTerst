package pe.com.cepen.restcontroller;


import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.cepen.entity.MatriculaEntity;
import pe.com.cepen.service.MatriculaService;


@RestController
@RequestMapping("/matricula")
public class MatriculaRestController {
    
    @Autowired
    private MatriculaService servicio;
    
    @GetMapping
    public List<MatriculaEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<MatriculaEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<MatriculaEntity> findById (@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @GetMapping("/{fecha1}/{fecha2}")
    public List<MatriculaEntity> findReporte (@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha1, @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha2){
        
        return servicio.findReporte(fecha1, fecha2);
    }
    
    
    @PostMapping
    public MatriculaEntity add(@RequestBody MatriculaEntity m){
        return servicio.add(m);
    }
    
    
    @PutMapping("/{id}")
    public MatriculaEntity update(@RequestBody MatriculaEntity m, @PathVariable Long id){
        m.setId_matri(id);
        return servicio.update(m);
    }
    
    @DeleteMapping("/{id}")
    public MatriculaEntity delete(@PathVariable Long id){
        MatriculaEntity objMatricula = new MatriculaEntity();
        objMatricula.setEsta_matricula(false);
        return servicio.delete(MatriculaEntity.builder().id_matri(id).build());
    }
}
