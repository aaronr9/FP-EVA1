/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_23_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_23_BISIESTO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //saber si es multiplo de 4
        //RESIDUO DE CERO --> DIVISION EXACTA
        //MODULO --> CALCULO DEL RESIDUO --> %
        int year;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el año");
        year = captu.nextInt();
        captu.nextLine();
        
        //DIVISIBLE ENTRE 4
        //CALCULAR EL RESIDUO --> MODULO %
        int modulo4 = year % 4;
        if(modulo4 == 0){
            //no nobe ser divisoble entre 100
            int modulo100 = year % 100; 
            if(modulo100 != 0){
                System.out.println("ES año bisiesto");
            }else{
                int modulo400 = year % 400;
                if(modulo400 == 0){
                    System.out.println("Es año bisisto");
                }else{System.out.println("NO ES AÑO BISISTO");
                }
            }
        
        
    }
}
    }