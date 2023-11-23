/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int limite = 15;
        int numerador = 1;
        int denominador = 3;  
        String signo; 
        String cadena = "";   
        
        do {
            if (denominador % 2 == 0) {
                signo = "-";
            } else {
                signo = "+";
            }
            
            cadena = String.format("%s%s%d/%d\n ", 
                    cadena,
                    signo,
                    numerador, 
                    denominador);
            denominador = denominador + 1; 

        } while (denominador <= limite);
                  //2 == 10 v

        System.out.println(cadena);

        }

    }
    

