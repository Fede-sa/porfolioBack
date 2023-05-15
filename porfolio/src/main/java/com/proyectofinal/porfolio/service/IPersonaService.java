
package com.proyectofinal.porfolio.service;

import com.proyectofinal.porfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona buscaPersona(Long id);
    
    public void editarPersona(Persona per);
}
