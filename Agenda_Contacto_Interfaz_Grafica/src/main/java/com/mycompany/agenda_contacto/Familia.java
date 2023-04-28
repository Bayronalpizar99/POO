/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_contacto;

/**
 *
 * @author Bayron
 */
public class Familia {
    private String nombre3;
    private String apellido3;
    private String telefono;
    private String vivienda;

    public Familia(String nombre3, String apellido3, String telefono, String vivienda) {
        this.nombre3 = nombre3;
        this.apellido3 = apellido3;
        this.telefono = telefono;
        this.vivienda = vivienda;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String getApellido3() {
        return apellido3;
    }

    public void setApellido3(String apellido3) {
        this.apellido3 = apellido3;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getVivienda() {
        return vivienda;
    }

    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }
    
    
    
}
