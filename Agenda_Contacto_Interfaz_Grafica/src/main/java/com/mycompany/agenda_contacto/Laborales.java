/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda_contacto;

/**
 *
 * @author Bayron
 */
public class Laborales {
   private String nombre4;
   private String apellido4;
   private String telefono4;
   private String empresa;
   private String departamento;

    public Laborales(String nombre4, String apellido4, String telefono4, String empresa, String departamento) {
        this.nombre4 = nombre4;
        this.apellido4 = apellido4;
        this.telefono4 = telefono4;
        this.empresa = empresa;
        this.departamento = departamento;
    }

    public String getNombre4() {
        return nombre4;
    }

    public void setNombre4(String nombre4) {
        this.nombre4 = nombre4;
    }

    public String getApellido4() {
        return apellido4;
    }

    public void setApellido4(String apellido4) {
        this.apellido4 = apellido4;
    }

    public String getTelefono4() {
        return telefono4;
    }

    public void setTelefono4(String telefono4) {
        this.telefono4 = telefono4;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
   
   
   
}
