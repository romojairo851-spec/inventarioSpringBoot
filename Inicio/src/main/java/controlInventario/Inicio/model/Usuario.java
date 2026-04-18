package controlInventario.Inicio.model;

import jakarta.persistence.*;

/* Clase que representa la tabla "usuarios" en la base de datos */

@Entity // Indica que es una entidad JPA
@Table(name = "usuarios") //Nombre de la tabla en MySQL

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Campos de la tabla
    private String nombre;
    private String email;
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
