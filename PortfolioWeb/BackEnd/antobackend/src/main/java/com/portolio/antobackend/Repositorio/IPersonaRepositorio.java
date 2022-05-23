
package com.portolio.antobackend.Repositorio;

import com.portolio.antobackend.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona, Long> {
    
}
