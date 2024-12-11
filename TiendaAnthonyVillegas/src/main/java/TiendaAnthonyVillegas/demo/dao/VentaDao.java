package TiendaAnthonyVillegas.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import TiendaAnthonyVillegas.demo.domain.Venta;

public interface VentaDao extends JpaRepository <Venta,Long>{
    
}
