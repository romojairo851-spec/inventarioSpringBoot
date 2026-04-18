package controlInventario.Inicio.controller;

import controlInventario.Inicio.model.Usuario;
import controlInventario.Inicio.service.UsuarioService;

import org.hibernate.annotations.ConverterRegistrations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Controlador REST para manejar las solicitudes HTTP relacionadas con los usuarios  
@RestController
@RequestMapping("/usuarios")    
@CrossOrigin(origins = "http://localhost:3037") // Permitir solicitudes desde cualquier origen (ajustar según necesidades)

public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;  

    // Crear un nuevo usuario
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.guardarUsuario(usuario);      

    }
    //Listar todos los usuarios
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    // Obtener un usuario por ID
    @GetMapping("/{id}")
    public Optional<Usuario> obtenerUsuario(@PathVariable Long id) {
        return usuarioService.obtenerUsuario(id);   
    }

    // Eliminar un usuario por ID
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
    }
    
}