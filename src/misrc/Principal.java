/*
Construir un programa con un menú con dos opciones:
1. Convertir Grados Fahrenheit a Celsius
2. Convertir Celsius a Fahrenheit
*/
package misrc;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        while(true) {
           System.out.println("[1] Convertir Grados Fahrenheit a Celsius");
           System.out.println("[2] Convertir Celsius a Fahrenheit");
           System.out.println("[3] Salir");
           
           System.out.println("Ingresar opción? ");
           opcion = sc.next();
           
           switch(opcion) {
               case "1": MisMetodos.convertirFahrenheitCelsius(); break;
               case "2": MisMetodos.convertirCelsiusFahrenheit(); break;
               case "3": System.exit(0);
           }
        }
        
    }
    
}
