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
import pe.com.cepen.entity.TrabajadorEntity;
import pe.com.cepen.service.TrabajadorService;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorRestController {
    
    @Autowired
    private TrabajadorService servicio;
    
    
    @GetMapping
    public List<TrabajadorEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<TrabajadorEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<TrabajadorEntity> findById (@PathVariable Long id){
        return servicio.findById(id);
    }
    
    
    @PostMapping
    public TrabajadorEntity add(@RequestBody TrabajadorEntity t){
        return servicio.add(t);
    }
    
    
    @PutMapping("/{id}")
    public TrabajadorEntity update(@RequestBody TrabajadorEntity t, @PathVariable Long id){
        t.setId_traba(id);
        return servicio.update(t);
    }
    
    @DeleteMapping("/{id}")
    public TrabajadorEntity delete(@PathVariable Long id){
        TrabajadorEntity objTrabajador = new TrabajadorEntity();
        objTrabajador.setEsta_traba(false);
        return servicio.delete(TrabajadorEntity.builder().id_traba(id).build());
    }
    
    
    
}
