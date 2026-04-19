package controlInventario.Inicio.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

/* Clase que representa la tabla "usuarios" en la base de datos */

@Entity // Indica que es una entidad JPA
@Table(name = "usuarios") //Nombre de la tabla en MySQL

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Campos de la tabla
    //No puede estar vacio
    @NotBlank(message = "El nombre no puede estar vacio")
    @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
    private String nombre;

    //Validar que el email tenga formato correcto
    @NotBlank(message = "El email no puede estar vacio")
    @Email(message = "El email debe tener un formato válido")
    private String email;

    //Validar que la contraseña tenga al menos 6 caracteres
    @NotBlank(message = "La contraseña no puede estar vacia")
    @Size(min = 6, message = "La contraseña debe tener al menos 6 caracteres")
    private String password;


    //Constructor vacio (obligatorio para JPA)
    public Usuario(){}

    //Constructor con parámetros
    public Usuario(String nombre, String email, String password){
        this.nombre =nombre;
        this.email = email;
        this.password =password;
    }

    //Getters y Setters

    public Long getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public void setNombre(String Nombre){
        this.nombre = nombre;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(){
        this.password = password;
    }
}
