import java.util.Scanner;
/**
 *
 * @author julianamantilla
 */
public class eje5 {
     public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     
  double temperatura;
  double fahrenheit;
  double celsius;
  
  System.out.println("dame una temperatura en grados fahrenheit");
  temperatura = scanner.nextDouble();
  
  celsius = (temperatura - 32) * 0.555;
  
  System.out.println("la temperatura en grados celsius es: " + celsius);
  
     }
    
    
}