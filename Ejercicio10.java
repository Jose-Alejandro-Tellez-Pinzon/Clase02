import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido a tu programa para calcular la madia de tres numeros");
        System.out.print("Ingresar el primer numero:");

        Scanner entrada = new Scanner(System.in);
        
        var valor1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");

        var valor2 = entrada.nextInt();

        System.out.print("Ingrese el tercer numero: ");

        var valor3 = entrada.nextInt();

        double operacion = (valor1 + valor2 + valor3) / 3;

        System.out.println("La media de tus numeros es: " +operacion);

        entrada.close();
    }
}
