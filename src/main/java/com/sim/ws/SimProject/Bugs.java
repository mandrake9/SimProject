package com.sim.ws.SimProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bugs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String  videojoc;
    private String  usuari;
    private String  data_de_Bug;
    private String  plataforma;
    private String  email;
    private String  descripcion_breu;
    private String  descripcion;
    private String  categoria;
    private String  prioritat;
    private String  estat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideojoc() {
        return videojoc;
    }

    public void setVideojoc(String videojoc) {
        this.videojoc = videojoc;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getData_de_Bug() {
        return data_de_Bug;
    }

    public void setData_de_Bug(String data_de_Bug) {
        this.data_de_Bug = data_de_Bug;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion_breu() {
        return descripcion_breu;
    }

    public void setDescripcion_breu(String descripcion_breu) {
        this.descripcion_breu = descripcion_breu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrioritat() {
        return prioritat;
    }

    public void setPrioritat(String prioritat) {
        this.prioritat = prioritat;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    @Override
    public String toString() {
        return "Bugs{" +
                "videojoc='" + videojoc + '\'' +
                ", usuari='" + usuari + '\'' +
                ", data_de_Bug='" + data_de_Bug + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", email='" + email + '\'' +
                ", descripcion_breu='" + descripcion_breu + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", prioritat='" + prioritat + '\'' +
                ", estat='" + estat + '\'' +
                '}';
    }
}

