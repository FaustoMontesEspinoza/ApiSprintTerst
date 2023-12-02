package pe.com.cepen.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cepen.entity.PagoEntity;
import pe.com.cepen.repository.PagoRepository;
import pe.com.cepen.service.PagoService;


@Service
public class PagoServiceImpl implements PagoService{

    @Autowired
    private PagoRepository repositorio;
    
    @Override
    public List<PagoEntity> findAll() {
        return repositorio.findAll(); 
    }

    @Override
    public List<PagoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<PagoEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public PagoEntity add(PagoEntity pa) {
        return repositorio.save(pa);
    }

    @Override
    public PagoEntity update(PagoEntity pa) {
        PagoEntity objPago = repositorio.getById(pa.getId_pago());
        BeanUtils.copyProperties(pa, objPago);
        return repositorio.save(objPago);
    }

    @Override
    public PagoEntity delete(PagoEntity pa) {
        PagoEntity objPago = repositorio.getById(pa.getId_pago());
        objPago.setEsta_pago(false);
        return repositorio.save(objPago);
    }

    @Override
    public List<PagoEntity> findPagoId(long id_matri) {
        return repositorio.findPagoId(id_matri);
    }
    
}
