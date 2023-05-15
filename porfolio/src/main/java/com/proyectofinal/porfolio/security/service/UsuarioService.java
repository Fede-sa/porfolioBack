
package com.proyectofinal.porfolio.security.service;

import com.proyectofinal.porfolio.security.entity.Usuario;
import com.proyectofinal.porfolio.security.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsurio){
        return usuarioRepository.findByNombreUsuario(nombreUsurio);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
        public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }
        
        public void save(Usuario usuario){
            usuarioRepository.save(usuario);
        }
}
