/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.o7planning.restfulcrud.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author james
 */

@XmlRootElement(name = "taller")
@XmlAccessorType(XmlAccessType.FIELD)
public class Taller {
    private String id;
    private String nombre;
    private float rating;
    private String horario;
    private Localizacion ubicacion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Localizacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Localizacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
}
