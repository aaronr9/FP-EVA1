/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_aguila_sol;

/**
 *
 * @author Usuario
 */
public class EVA1_13_AGUILA_SOL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //ALIATORIO
        //GENERAR NUMEROS ALEATORIOS
        double valor = Math.random();
        //random genera valores >= 0 y < 1
        //entre 0 y .999999999999
        //0 1 2 3 4 5 6 7 8 9
        if(valor < 0.5){
            System.out.println("AGUILA");
        }else{
            System.out.println("SOL");
        }
        
        
        
        
        
    }
}
