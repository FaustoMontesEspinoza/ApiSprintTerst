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
import pe.com.cepen.entity.UsuarioEntity;
import pe.com.cepen.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {
    
    @Autowired
    private UsuarioService servicio;
    
    
    @GetMapping
    public List<UsuarioEntity> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<UsuarioEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<UsuarioEntity> findById (@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @GetMapping("/{username}/{contra_usu}")
    public UsuarioEntity getUsuLogin(@PathVariable String username, @PathVariable String contra_usu){
        return servicio.getUsuLogin(username, contra_usu);
    }
    
    @PostMapping
    public UsuarioEntity add(@RequestBody UsuarioEntity u){
        return servicio.add(u);
    }
    
    
    @PutMapping("/{id}")
    public UsuarioEntity update(@RequestBody UsuarioEntity u, @PathVariable Long id){
        u.setId_usu(id);
        return servicio.update(u);
    }
    
    @DeleteMapping("/{id}")
    public UsuarioEntity delete(@PathVariable Long id){
        UsuarioEntity objUsuario = new UsuarioEntity();
        objUsuario.setEsta_usu(false);
        return servicio.delete(UsuarioEntity.builder().id_usu(id).build());
    }
    
}
