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
import pe.com.cepen.entity.CarreraEntity;
import pe.com.cepen.service.CarreraService;


@RestController
@RequestMapping("/carrera")
public class CarreraRestController {
    
    @Autowired
    private CarreraService servicio;
    
    @GetMapping
    public List<CarreraEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<CarreraEntity> findById (@PathVariable Long id){
        return servicio.findById(id);
    }
    
    
    @PostMapping
    public CarreraEntity add(@RequestBody CarreraEntity c){
        return servicio.add(c);
    }
    
    
    @PutMapping("/{id}")
    public CarreraEntity update(@RequestBody CarreraEntity c, @PathVariable Long id){
        c.setId_carre(id);
        return servicio.update(c);
    }
}
