import java.util.Scanner;
/**
 *
 * @author julianamantilla
 */
public class eje6 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     
     int num1;
     int num2;
     int num3;
     int media;
     
     System.out.println("ingresa el valor del primer numero");
     num1 = scanner.nextInt();
     System.out.println("ingresa el valor del segundo numero");
     num2 = scanner.nextInt();
     System.out.println("ingresa el valor del tercer numero");
     num3 = scanner.nextInt();
    
     media = (num1 + num2 + num3) / 3;
     
     System.out.println("la media de los tres numeros introducidos es: " + media);
     
    }
     
    
}