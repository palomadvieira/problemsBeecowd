import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class bee1002 {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    double raio = sc.nextDouble();
    double area = 3.14159 * (Math.pow(raio, 2));

    System.out.println(String.format("A=%.4f\n" , area));



        sc.close();
 
    }
 
}