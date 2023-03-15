/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa_carros;

import java.util.ArrayList;

public class EmpresaCarros {
    
    // Atributos
    private ArrayList<Carro> stock;
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;

    // Constructor
    public EmpresaCarros() {
        this.stock = new ArrayList<Carro>();
        this.clientes = new ArrayList<Cliente>();
        this.vendedores = new ArrayList<Vendedor>();
    }

    // Métodos

    // Venta de un carro
    public void venderCarro(Carro carro, Cliente cliente, Vendedor vendedor) {
        if (stock.contains(carro) && clientes.contains(cliente) && vendedores.contains(vendedor)) {
            // Actualizamos el estado del carro y del cliente
            carro.setVendido(true);
            cliente.setCarroComprado(carro);
            // Actualizamos las ventas del vendedor correspondiente
            vendedor.añadirVenta(carro);
            // Eliminamos el carro del stock
            stock.remove(carro);
            System.out.println("El carro " + carro.getMarca() + " " + carro.getModelo() + " ha sido vendido a " + cliente.getNombre() + " por " + carro.getPrecioVenta() + "€.");
        } else {
            System.out.println("Error en la venta del carro.");
        }
    }
}