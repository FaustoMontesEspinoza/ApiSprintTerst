package pe.com.cepen.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.cepen.entity.CursoEntity;
import pe.com.cepen.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoRestController {
    
    @Autowired
    private CursoService servicio;
    
    @GetMapping
    public List<CursoEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<CursoEntity> findById (@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public CursoEntity add(@RequestBody CursoEntity cu){
        return servicio.add(cu);
    }
    
    @PutMapping("/{id}")
    public CursoEntity update(@RequestBody CursoEntity cu, @PathVariable Long id){
        cu.setId_curso(id);
        return servicio.update(cu);
    }
}
