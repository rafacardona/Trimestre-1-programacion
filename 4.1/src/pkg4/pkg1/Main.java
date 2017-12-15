
package pkg4.pkg1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     int lado1, lado2, hipotenusa;
     Scanner leer = new Scanner(System.in);
     System.out.println("Introduce lado 1: ");
     lado1 = leer.nextInt();
     Scanner reader = new Scanner(System.in);
     System.out.println("Introduce lado 2: ");
     lado2 = reader.nextInt();
    
     hipotenusa = (int) (Math.sqrt(lado1)+ Math.sqrt(lado2))*2;
     System.out.println("La hipotenusa es: "+ hipotenusa);
     
     
     
    }
    
}
