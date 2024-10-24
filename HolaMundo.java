import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        
        //System.out.println("Hola Pedro como estas?");

        //System.out.print("como van las cosas");

        //System.out.printf();

        var scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        var entero = scanner.nextInt();

        System.out.println(entero);

        scanner.close();
    }
}