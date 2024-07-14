/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

import controller.ClientesJpaController;
import entity.Clientes;

/**
 *
 * @author Edwin
 */
public class Prueba {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
         ClientesJpaController controller = new ClientesJpaController();

        // Crear un nuevo cliente
        Clientes nuevoCliente = new Clientes();
        nuevoCliente.setCedula("1234567890");
        nuevoCliente.setNombre("John");
        nuevoCliente.setApellido("Doe");
        nuevoCliente.setEdad("30");
        nuevoCliente.setEmail("john.doe@example.com");
        nuevoCliente.setCiudad("Ciudad");
        nuevoCliente.setBarrio("Barrio");
        nuevoCliente.setNumeroCalle("123");
        nuevoCliente.setTelefono("555-5555");

        
    try {
           //controller.create(nuevoCliente);
            System.out.println("Cliente creado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    
    // Leer un cliente
        Clientes cliente = controller.findCliente(2);
        System.out.println("Cliente encontrado: " + cliente.getCedula());
        
        
        // Actualizar un cliente
        cliente.setNombre("Jane");
        try {
            controller.edit(cliente);
            System.out.println("Cliente actualizado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        
          // Eliminar un cliente
        try {
            controller.destroy(2);
            System.out.println("Cliente eliminado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
        
    
}
