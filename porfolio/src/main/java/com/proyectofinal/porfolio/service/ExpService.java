
package com.proyectofinal.porfolio.service;

import com.proyectofinal.porfolio.model.Experiencia;
import com.proyectofinal.porfolio.repository.ExpRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ExpService {
    
    @Autowired
    ExpRepository expRepository;
    
    public List<Experiencia> list(){
        return expRepository.findAll();
    }
    
    public Optional<Experiencia> findById(int id){
        return expRepository.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return expRepository.findByNombreE(nombreE);
    }
    
    public void save(Experiencia experiencia){
        expRepository.save(experiencia);
    }
    
    public void delete(int id){
        expRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return expRepository.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return expRepository.existsByNombreE(nombreE);
    }
        
}
