package edu.capasitas.Domain;

/**
 * Created by Fede on 02/12/2016.
 */
public class Cliente {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {

        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre +
                ", apellido=" + apellido +
                ", email=" + email +
                ", telefono=" + telefono +
                '}';
    }
}
