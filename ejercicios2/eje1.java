import java.util.Scanner;

public class eje1 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    String nombre;
    
    System.out.println("dime tu nombre porfavor");
    nombre = teclado.nextLine();
    
    System.out.println("hola " + nombre + " , bienvenida");
    }
}