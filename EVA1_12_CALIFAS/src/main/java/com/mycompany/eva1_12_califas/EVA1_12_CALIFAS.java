/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //DECLARAR VARIABLE PARA LA CALIFICACION
        //EVALUAR SI ACREDITAS (MAYOR O IGUAL A 70)
        //O NO ACREDITAS (NA --> MENOR A 70)
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿cual es la calificacion?");
        califa = captu.nextInt();
        
        if(califa >= 70){ //if(califa>=70) e invertir 
            System.out.println("ACREDITAS");
        }else{
            System.out.println("NA");
        }
        
        
        
        
        
        
    }
}
