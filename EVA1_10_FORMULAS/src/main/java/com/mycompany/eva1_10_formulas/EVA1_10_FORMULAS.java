/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_10_FORMULAS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        double vol, ace, t, dis;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("velocidad inicial;");
        vol = captu.nextDouble();
        System.out.println("tiempo:");
        t = captu.nextDouble();
        System.out.println("aceleracion");
        ace = captu.nextDouble();
        dis =vol * t + (ace * t* t / 2);
        System.out.println("Distancia = " + dis);
        
        
        
        
        
        
    }
}
