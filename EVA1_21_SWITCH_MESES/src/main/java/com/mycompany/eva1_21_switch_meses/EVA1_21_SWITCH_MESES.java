/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_21_switch_meses;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_21_SWITCH_MESES {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int mes;
        Scanner captu = new Scanner(System.in);
        System.out.println("Numero correspondiente al dia (1-12):");
        mes = captu.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("Enero");
                break;//ultima instruccion- FIN DEL CASO
            case 2:
                System.out.println("Febrero");
                break;//ultima instruccion- FIN DEL CASO
            case 3:
                System.out.println("Marzo");
                break;//ultima instruccion- FIN DEL CASO
            case 4:
                System.out.println("Abril");
                break;//ultima instruccion- FIN DEL CASO
            case 5:
                System.out.println("Mayo");
                break;//ultima instruccion- FIN DEL CASO
            case 6:
                System.out.println("Junio");
                break;//ultima instruccion- FIN DEL CASO
            case 7:
                System.out.println("Julio");
                break;//ultima instruccion- FIN DEL CASO
            case 8:
                System.out.println("Agosto");
                break;//ultima instruccion- FIN DEL CASO
            case 9:
                System.out.println("Septiembre");
                break;//ultima instruccion- FIN DEL CASO
            case 10:
                System.out.println("Octubre");
                break;//ultima instruccion- FIN DEL CASO
            case 11:
                System.out.println("Noviembre");
                break;//ultima instruccion- FIN DEL CASO
            case 12:
                System.out.println("Diciembre");
                break;//ultima instruccion- FIN DEL CASO
            default: //OPCIONAL, SIN BREAK, ULTIMA SECCION DEL SWITCH
                System.out.println("Numero no valido (deben ser entre 1-12");}
        
        
    }
}
