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
import pe.com.cepen.entity.NotaEntity;
import pe.com.cepen.service.NotaService;

@RestController
@RequestMapping("/nota")
public class NotaRestController {

    @Autowired
    private NotaService servicio;
    
    @GetMapping
    public List<NotaEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<NotaEntity> findById (@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @GetMapping("/estudiante/{id_estu}")
    public List<NotaEntity> CursoEstu(@PathVariable Long id_estu){
        return servicio.CursoEstu(id_estu);
    }
    
    
    @PostMapping
    public NotaEntity add(@RequestBody NotaEntity n){
        return servicio.add(n);
    }
    
    
    @PutMapping("/{id}")
    public NotaEntity update(@RequestBody NotaEntity n, @PathVariable Long id){
        n.setId_nota(id);
        return servicio.update(n);
    }
    
    
}
