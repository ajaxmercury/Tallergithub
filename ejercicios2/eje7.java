import java.util.Scanner;
/**
 *
 * @author julianamantilla
 */
public class eje7 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     
     int minutos;
     double horas;
     
     System.out.println("ingresa la cantidad de minutos");
     minutos = scanner.nextInt();
     
     horas = (minutos / 60);
     
     System.out.println("la cantidad de minutos en horas es: " + horas);
     
    
    }
    
    
}