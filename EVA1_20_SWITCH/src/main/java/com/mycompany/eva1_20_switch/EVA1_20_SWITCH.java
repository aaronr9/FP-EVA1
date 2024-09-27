/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_20_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_20_SWITCH {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Numero correspondiente al dia (1-12):");
        dia = captu.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;//ultima instruccion- FIN DEL CASO
            case 2:
                System.out.println("Martes");
                break;//ultima instruccion- FIN DEL CASO
            case 3:
                System.out.println("MIercoles");
                break;//ultima instruccion- FIN DEL CASO
            case 4:
                System.out.println("Jueves");
                break;//ultima instruccion- FIN DEL CASO
            case 5:
                System.out.println("Viernes");
                break;//ultima instruccion- FIN DEL CASO
            case 6:
                System.out.println("Sabado");
                break;//ultima instruccion- FIN DEL CASO
            case 7:
                System.out.println("Domingo");
                break;//ultima instruccion- FIN DEL CASO
            default: //OPCIONAL, SIN BREAK, ULTIMA SECCION DEL SWITCH
                System.out.println("Numero no valido (deben ser entre 1-7");
        }
        
        
        
        
        
        
        
    }
}
