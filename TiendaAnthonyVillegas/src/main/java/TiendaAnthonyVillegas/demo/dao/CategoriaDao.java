package TiendaAnthonyVillegas.demo.dao;

import TiendaAnthonyVillegas.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria,Long> {
    
}
