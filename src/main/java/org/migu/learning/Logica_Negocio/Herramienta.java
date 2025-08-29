package org.migu.learning.Logica_Negocio;

public class Herramienta {
    public String idHerra;
    public String nombreHerra;

    public Herramienta(){
    }

    public Herramienta(String idHerra, String nombreHerra) {
        this.idHerra = idHerra;
        this.nombreHerra = nombreHerra;
    }

    public String getIdHerra() {
        return idHerra;
    }

    public void setIdHerra(String idHerra) {
        this.idHerra = idHerra;
    }

    public String getNombreHerra() {
        return nombreHerra;
    }

    public void setNombreHerra(String nombreHerra) {
        this.nombreHerra = nombreHerra;
    }
}
