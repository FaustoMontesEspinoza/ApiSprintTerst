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
import pe.com.cepen.entity.HorarioEntity;
import pe.com.cepen.service.HorarioService;


@RestController
@RequestMapping("/horario")
public class HorarioRestController {
    
    @Autowired
    private HorarioService servicio;
    
    
    @GetMapping
    public List<HorarioEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<HorarioEntity> findById (@PathVariable Long id){
        return servicio.findById(id);
    }
    
    
    @PostMapping
    public HorarioEntity add(@RequestBody HorarioEntity h){
        return servicio.add(h);
    }
    
    
    @PutMapping("/{id}")
    public HorarioEntity update(@RequestBody HorarioEntity h, @PathVariable Long id){
        h.setId_hora(id);
        return servicio.update(h);
    }
    
}
