package TiendaAnthonyVillegas.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import TiendaAnthonyVillegas.demo.domain.Factura;


public interface FacturaDao extends JpaRepository <Factura,Long>{
    
}
