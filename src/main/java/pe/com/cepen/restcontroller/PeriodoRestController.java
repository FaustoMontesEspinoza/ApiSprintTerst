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
import pe.com.cepen.entity.PeriodoEntity;
import pe.com.cepen.service.PeriodoService;

@RestController
@RequestMapping("/periodo")
public class PeriodoRestController {
    
    @Autowired
    private PeriodoService servicio;
    
    @GetMapping
    public List<PeriodoEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<PeriodoEntity> findById (@PathVariable Long id){
        return servicio.findById(id);
    }
    
    
    @PostMapping
    public PeriodoEntity add(@RequestBody PeriodoEntity p){
        return servicio.add(p);
    }
    
    
    @PutMapping("/{id}")
    public PeriodoEntity update(@RequestBody PeriodoEntity p, @PathVariable Long id){
        p.setId_perio(id);
        return servicio.update(p);
    }
}
