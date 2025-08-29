package org.migu.learning.Logica_Negocio;

public class Obrero {
    private String nombre;
    private String apellido;
    private String identificacion;
    public Herramienta herramienta;

    public Obrero(){

    }

    public Obrero(String nombre, String apellido, String identificacion, Herramienta herramienta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.herramienta = herramienta;
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(Herramienta herramienta) {
        this.herramienta = herramienta;
    }
}
