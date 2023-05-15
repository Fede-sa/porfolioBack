
package com.proyectofinal.porfolio.repository;


import com.proyectofinal.porfolio.model.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpRepository extends JpaRepository<Experiencia, Integer>{
    
    public Optional<Experiencia>findByNombreE(String nombreE);
    
    public boolean existsByNombreE(String nombreE);
    
}
