
package com.proyectofinal.porfolio.service;

import com.proyectofinal.porfolio.model.Persona;
import com.proyectofinal.porfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository repoPersona;
    
    @Override
    public List<Persona> verPersonas() {
       return repoPersona.findAll();      
    }

    @Override
    public void crearPersona(Persona per) {
        repoPersona.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        repoPersona.deleteById(id);
    }

    @Override
    public Persona buscaPersona(Long id) {
        return repoPersona.findById(id).orElse(null);
    }

    @Override
    public void editarPersona(Persona per) {
        repoPersona.save(per);
    }
    
    
}
