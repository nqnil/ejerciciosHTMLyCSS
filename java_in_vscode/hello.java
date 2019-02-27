import java.util.Scanner;

/**
 * Probando java en visual studio code
 */

 public class hello {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("Dime tu nombre:");
        nombre=entrada.nextLine();

        System.out.println("Dime tu edad:");
        edad=entrada.nextInt();

        System.out.println("Eres " + nombre + " y tienes " + edad + " tacos.");
    }
 }