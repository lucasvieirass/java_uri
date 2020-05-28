import java.util.Scanner;
public class Uri1004{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int x, y, prod;

            x = teclado.nextInt();
            y = teclado.nextInt();
            
            prod = x * y;

            System.out.println("PROD = " + prod);
        }
}