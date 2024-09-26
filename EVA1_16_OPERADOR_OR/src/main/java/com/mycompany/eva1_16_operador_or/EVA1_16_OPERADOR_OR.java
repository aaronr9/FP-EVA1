/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_16_OPERADOR_OR {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner captu = new Scanner(System.in);
        int Km, meses;
        System.out.println("Cuantos kilometraje tiene el vehiculo");
        Km = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuantos meses tiene el vehiculo?");
        meses = captu.nextInt();
        captu.nextLine();
        
        if(Km >= 500 || meses >= 6){
            System.out.println("Cambio de aceite");
        }else{
            System.out.println("Vehiculo en buenas condiciones");
        }
        
        
    }
}
