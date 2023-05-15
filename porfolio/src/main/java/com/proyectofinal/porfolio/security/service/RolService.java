
package com.proyectofinal.porfolio.security.service;

import com.proyectofinal.porfolio.security.entity.Rol;
import com.proyectofinal.porfolio.security.enums.RolNombre;
import com.proyectofinal.porfolio.security.repository.RolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
