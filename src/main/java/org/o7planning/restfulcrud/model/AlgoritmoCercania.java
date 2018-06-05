/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.o7planning.restfulcrud.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author james
 */

@XmlRootElement(name = "algoritmo")
@XmlAccessorType(XmlAccessType.FIELD)
public class AlgoritmoCercania {
    private String id;
    private Usuario usuario;
    private Taller taller;
    private List<Taller> listaTalleres;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }

    public List<Taller> getListaTalleres() {
        return listaTalleres;
    }

    public void setListaTalleres(List<Taller> listaTalleres) {
        this.listaTalleres = listaTalleres;
    }
    
    
}
