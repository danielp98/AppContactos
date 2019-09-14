package com.example.appcontactos;

import java.io.Serializable;

public class ObjetoContacto implements Serializable {

    String nombre;
    String email;
    String Twitter;
    String tel;
    String fecha_nac;

    public ObjetoContacto(String Nombre, String Email, String twitter, String Tel, String Fecha_Nac){
        this.nombre = Nombre;
        this.email = Email;
        this.Twitter = twitter;
        this.tel = Tel;
        this.fecha_nac = Fecha_Nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return Twitter;
    }

    public void setTwitter(String twitter) {
        Twitter = twitter;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
}
