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
        
        int numero1 = 0;
        double numero2 = 1;
        double calculo;
        int operacion = 1;
        double resultado = 0;
        String signo;
        String cadenaFinal = "";

        while (numero2 <= 15) {
            if (numero1 % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }
            calculo = operacion * (1 / numero2);
            resultado = resultado + calculo;
            numero1 = numero1 + 1;
            if (numero2 <= 1) {
                cadenaFinal = String.format("%s %s",
                        cadenaFinal, (int) numero2);
            } else {
                cadenaFinal = String.format("%s %s 1/%s",
                        cadenaFinal, signo, (int) numero2);
            }

            operacion = operacion * -1;
            numero2 = numero2 + 2;
        }
        System.out.printf("%s\nResultado: %.2f\n",
                cadenaFinal, resultado);
        }

    }
    

