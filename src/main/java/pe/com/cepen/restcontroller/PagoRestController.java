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
import pe.com.cepen.entity.PagoEntity;
import pe.com.cepen.service.PagoService;


@RestController
@RequestMapping("/pago")
public class PagoRestController {
    
    @Autowired
    private PagoService servicio;
    
    
    @GetMapping
    public List<PagoEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/cuota/{id_matri}")
    public List<PagoEntity> findPagoId(@PathVariable Long id_matri){
        return servicio.findPagoId(id_matri);
    }

    @GetMapping("/custom")
    public List<PagoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<PagoEntity> findById (@PathVariable Long id){
        return servicio.findById(id);
    }
    
    
    @PostMapping
    public PagoEntity add(@RequestBody PagoEntity pa){
        return servicio.add(pa);
    }
    
    
    @PutMapping("/{id}")
    public PagoEntity update(@RequestBody PagoEntity pa, @PathVariable Long id){
        pa.setId_pago(id);
        return servicio.update(pa);
    }
    
    @DeleteMapping("/{id}")
    public PagoEntity delete(@PathVariable Long id){
        PagoEntity objPago = new PagoEntity();
        objPago.setEsta_pago(false);
        return servicio.delete(PagoEntity.builder().id_pago(id).build());
    }

    
}
