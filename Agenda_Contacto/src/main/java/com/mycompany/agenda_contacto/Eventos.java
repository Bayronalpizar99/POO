/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_contacto;

/**
 *
 * @author Bayron
 */
public class Eventos {
    private String nombre;
    private String lugar;
    private String dia;
    private String hora;
    private String motivo;

    public Eventos(String nombre, String lugar, String día, String hora, String motivo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.dia = día;
        this.hora = hora;
        this.motivo = motivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    
    
    
    
  
    
}
