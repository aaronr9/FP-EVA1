/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_operaciones;

/**
 *
 * @author Usuario
 */
public class EVA1_7_OPERACIONES {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //OPERACIONES ARITMETICAS
        int x = 10; //declaracion y asignacion;
        int y = 5;
        //declaracion de multiples variables del
        //mismo tipo
        int suma, resta, divi, multi, pot, raiz;
        //SUMA Y RESTA
        suma = x + y; //operador de suma +
        System.out.println("suma de x + y:");
        System.out.println(suma);
        
        resta = x - y; // operador de diferencia -
        System.out.println("Resta de x - y");
        System.out.println(resta);
        
        //MULTIPLICACION
        multi = x * y; //operador de multiplicacion *
        System.out.println("Multiplicacion de x * y:");
        System.out.println(multi);
        
        //DIVISION --> EL MANEJO DE TIPOS DE DATOS
        // si dividimos enteros, Java da como resultado
        divi = x / y;
        System.out.println("Division de x( / y");
        System.out.println(divi);
        //cambiamos los valores de x y
        x = 7;
        y = 3;
        divi = x / y;
        System.out.println("Division x(5) / y(2)");
        System.out.println(divi);
        
        double va11 = 11;
        double va12 = 3;
        double diviD;
        
        diviD = va11 / va12;
        System.out.println("Division entre decimales");
        System.out.println(diviD);
        
        
        
    }
}
