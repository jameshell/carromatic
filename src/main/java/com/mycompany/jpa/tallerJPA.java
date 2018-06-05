/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.o7planning.restfulcrud.model.Localizacion;

/**
 *
 * @author james
 */
@Entity
@Table(name="taller")
public class tallerJPA {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    
    @Column(name= "nombre", nullable = false)
    private String nombre;
    
    @Column(name= "rating", nullable = false)
    private float rating;
    
    @Column(name= "horario", nullable = false)
    private String horario;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="localizacion_id")
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
