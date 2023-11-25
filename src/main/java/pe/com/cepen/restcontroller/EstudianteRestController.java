package pe.com.cepen.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.cepen.entity.EstudianteEntity;
import pe.com.cepen.service.EstudianteService;

@RestController
@RequestMapping("/estudiante")
public class EstudianteRestController {
    
    @Autowired
    private EstudianteService servicio;
    
    @GetMapping
    public List<EstudianteEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<EstudianteEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    
    @GetMapping("/{id}")
    public Optional<EstudianteEntity> findById (@PathVariable Long id){
        return servicio.findById(id);
    }
    
    
    @GetMapping("usuario/{id}")
    public EstudianteEntity obtenerEstudianteUsu (@PathVariable Long id){
        return servicio.obtenerEstudianteUsu(id);
    }
    
    
    
    @GetMapping("/{id}/{doc_estu}")
    public List<EstudianteEntity> getByEstudianDni(@PathVariable Long id, @PathVariable String doc_estu){
        return servicio.getByEstudianDni(id, doc_estu);
    }
    
    @PostMapping
    public EstudianteEntity add(@RequestBody EstudianteEntity e){
        return servicio.add(e);
    }
    
    
    @PutMapping("/{id}")
    public EstudianteEntity update(@RequestBody EstudianteEntity e, @PathVariable Long id){
        e.setId_estu(id);
        return servicio.update(e);
    }
    
    @DeleteMapping("/{id}")
    public EstudianteEntity delete(@PathVariable Long id){
        EstudianteEntity objEstudiante = new EstudianteEntity();
        objEstudiante.setEsta_estu(false);
        return servicio.delete(EstudianteEntity.builder().id_estu(id).build());
    }
    
}
