import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido a la calculadora de área y perímetro");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("ingrese el ancho del rectángulo: ");
        
        var valor1 = entrada.nextDouble();
        
        System.out.print("Ingrese el largo del rectángulo;+: ");
        
        var valor2 = entrada.nextDouble();
        
        var area = valor1 * valor2;
        
        var perimetro = 2 * (valor1 + valor2);

        System.out.println("Su rectángulo tiene las siguientes medidas: ");
        System.out.println("Área: " +area);
        System.out.println("Perímetro: "+perimetro);
        entrada.close(); 
    }
}
