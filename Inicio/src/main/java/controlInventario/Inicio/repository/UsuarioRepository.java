package controlInventario.Inicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import controlInventario.Inicio.model.Usuario;
import java.util.Optional;

/**
 * Repositorio para acceder a la base de datos
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Método personalizado: buscar usuario por email
    Optional<Usuario> findByEmail(String email);
}