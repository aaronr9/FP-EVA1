/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_22_CALIFAS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("CALIFICA:");
        califa = captu.nextInt();
        captu.nextLine();
        
        if(califa >= 90 && califa <= 100)
            System.out.println("A");
        else if(califa >= 80 && califa <= 89)
            System.out.println("B");
        else if(califa >= 70 && califa <= 79)
            System.out.println("C");
        else if(califa >= 60 && califa <= 69)
            System.out.println("C");
        else if(califa >= 50 && califa <= 59)
            System.out.println("D");
        else
            System.out.println("CALIFICACION INCORRECTA");
        }
        
        
        
        
        
        
        
    
}
