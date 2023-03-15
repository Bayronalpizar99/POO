/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bayron
 */
public class Carros {
    private String marca;
    private int modelo;
    private int matricula;
    private int precio;
    private String tipo;

    public Carros(String marca, int modelo, int matricula, int precio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Carros{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    
}
