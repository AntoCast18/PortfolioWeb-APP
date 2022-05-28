
package com.portolio.antobackend.Repositorio;

import com.portolio.antobackend.Entidad.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Long> {
    
}