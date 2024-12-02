import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class fibonacci {
  public static void main(String[] args) {
    
    int n1 = 0;
    int n2 = 1;
    int suma = n1 + n2;
    int limite;
    
    try {
	  BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Ingrese el limite de la sucesión Fibonacci que desea: ");
      	limite = Integer.valueOf(entrada.readLine());
      System.out.println(n2);
        while ( suma < limite) {
      	System.out.println(suma);
      	n1 = n2;
      	n2 = suma;
      	suma = n1 + n2;
    }
      System.out.println("Fin del programa.");
    }

     catch (Exception exc) {
       System.out.println("Ha ocurrido un error...");
        System.out.println(exc);
        }
    }
}