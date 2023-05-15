package com.proyectofinal.porfolio.controller;

import com.proyectofinal.porfolio.model.Persona;
import com.proyectofinal.porfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/persona/crear")
    public void agregarPersona(@RequestBody Persona per){
        persoServ.crearPersona(per);
    }
        
    @GetMapping("/persona/verlista")
    @ResponseBody
    public List<Persona> verPersonas(){
            return persoServ.verPersonas();
        }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/persona/borrar/{id}")
    public void elimPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
     
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persona/editar")
    public void editPersona(@RequestBody Persona per){
        persoServ.editarPersona(per);
    }
    
    @GetMapping("/persona/verperfil")
    @ResponseBody
    public Persona verPerfil(){
            return persoServ.buscaPersona((long)1);
        }
}


    
