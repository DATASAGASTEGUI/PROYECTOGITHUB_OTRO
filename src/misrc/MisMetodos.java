package misrc;

import java.util.Scanner;


public class MisMetodos {
    
    public static void convertirFahrenheitCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar Grados Fahrenheit");
        double f = sc.nextDouble();
        double c = (f-32)*5.0/9;
        System.out.format("Celsius: %.2f\n", c);
    }
    
    public static void convertirCelsiusFahrenheit() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingresar Grados Celsius");
       double c = sc.nextDouble();
       double f = c * 9 / 5.0 + 32;
       System.out.format("Fahrenheit: %.2f\n", f);
    }
}
