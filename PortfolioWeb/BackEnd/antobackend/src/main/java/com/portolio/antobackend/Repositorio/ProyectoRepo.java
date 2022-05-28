
package com.portolio.antobackend.Repositorio;

import com.portolio.antobackend.Entidad.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {
    
}
