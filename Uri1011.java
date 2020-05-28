import java.util.Scanner;
public class Uri1011{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);

            Double R, pi, vol;
            
            R = teclado.nextDouble();
            pi = 3.14159;
            vol = (4.0 * pi * R * R * R)/3;

            System.out.printf("VOLUME = %.3f\n",vol);
        }
}