import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Bienvenido a tu programa para calcular temperaturas");
        
        System.out.print("Ingrese la temperatura en grados celsius: ");

        
        Scanner entrada = new Scanner(System.in);

        double grados = entrada.nextDouble();
        
        
        var fahrenheit = (grados * 9/5) + 32;
        var kelvin = grados + 273.15;

        System.out.println("Estas son las temperaturas:");
        System.out.println("Grados fahrenheit: " +fahrenheit);
        System.out.println("Grados kelvin: " +kelvin);

        entrada.close(); 
    }
}
