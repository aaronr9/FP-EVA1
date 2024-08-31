/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_de_datos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_5_ENTRADA_DE_DATOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //DECLARAMOS VARIABLES
        String marca;
        String modelo;
        int year;
        double precio;
        //¿como se captura?
        //SANNER
        //Herramienta --> Clase: nos proporcionan muchas herramientas
        Scanner captu; //declaramos la herramienta, previamente
                       //hay que importarla (hacer un import)
        captu = new Scanner(System.in);//creamos la herramienta
        
        //HAY QUE INDICARLE AL USUARIO QUE CAPTURAR
        System.out.println("introduce la marca del vehículo");
        //capturaramos --> una asignacion
        marca = captu.nextLine();// les regresa todo el texto hasta
                                //se preciona la tecla "enter"
        
        System.out.println("Introduce el modelo del vehiculo:");
        modelo = captu.nextLine();
        System.out.println("Intruduce el año:");
        year = captu.nextInt();
        System.out.println("Intruduce el precio");
        precio = captu.nextDouble();
        
        System.out.println("DATOS CAPTURADOS-------------");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
        
        
        
    }
}
