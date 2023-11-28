/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        double estatura;
        int edad;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;
        double sumaEstatura = 0;
        int contador = 0;
        double promedioEdad;
        double promedioEstatura;
        String edades = "Listado de Edades" ;
         
        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores");

        do {
            System.out.println("Ingrese el nombre y apellido del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posicion en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese la estatura: ");
            estatura = entrada.nextDouble();

            sumaEdades = sumaEdades + edad;
            sumaEstatura = sumaEstatura + estatura ;
            contador = contador + 1 ; 

            cadenaReporte = String.format("%s%d.) %s -%s-,"
                    + " edad %d, estatura %s\n",
                    cadenaReporte,
                    contador,
                    nombreJugador,
                    posicionCampo,
                    edad, estatura);
            
            edades = String.format("%s\n%s", edades, edad);

            entrada.nextLine();
            System.out.println("Desea salir del ciclo digite: f");
            salir = entrada.nextLine();
            if (salir.equals("f")) {
                bandera = false;
            }
        } while (bandera);
  
        promedioEdad = (double) sumaEdades / contador;

        promedioEstatura = (double) sumaEstatura / contador;
       

        System.out.printf("%s%s\nPromedio de edades: %.2f\n"
                + "Promedio de estatura: %.2f\n",
                cadenaReporte,
                edades,
                promedioEdad,
                promedioEstatura);        

    }
    
}
