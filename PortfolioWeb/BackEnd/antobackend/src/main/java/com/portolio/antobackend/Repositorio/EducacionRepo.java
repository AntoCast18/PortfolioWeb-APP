
package com.portolio.antobackend.Repositorio;

import com.portolio.antobackend.Entidad.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Long> {    
}
    



