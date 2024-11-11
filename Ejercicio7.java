import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora");
        var entrada = new Scanner(System.in);
        System.out.print("Por favor ingrese el primer valor: ");
        var valor1 = entrada.nextDouble ();
        System.out.print("Por favor ingrese el segundo valor: ");
        var valor2 = entrada.nextDouble();
        var suma = valor1 + valor2;
        var resta = valor1 - valor2; 
        var multiplicacion = valor1 * valor2;
        double division = valor1 / valor2;
        System.out.println("Los resultados son: ");
        System.out.println("Suma:" +suma );
        System.out.println("resta: "+resta);
        System.out.println("multiplicacion: "+multiplicacion);
        System.out.println("division: "+ division);
        entrada.close(); 


    }
}
