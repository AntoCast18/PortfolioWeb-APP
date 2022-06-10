
package com.portolio.antobackend.Repositorio;

import com.portolio.antobackend.Entidad.Tecnologias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Antonella
 */
@Repository
public interface TecnologiasRepository extends JpaRepository<Tecnologias, Long>{
    
}
