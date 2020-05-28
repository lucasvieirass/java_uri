import java.util.Scanner;
public class Uri1012{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);

            Double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi;
            
            A = teclado.nextDouble();
            B = teclado.nextDouble();
            C = teclado.nextDouble();
            pi = 3.14159;

            triangulo = (A*C)/2;
            circulo = pi * C * C;
            trapezio = ((A+B)*C)/2;
            quadrado = B * B;
            retangulo = A * B;

            System.out.printf("TRIANGULO: %.3f\n",triangulo);
            System.out.printf("CIRCULO: %.3f\n",circulo);
            System.out.printf("TRAPEZIO: %.3f\n",trapezio);
            System.out.printf("QUADRADO: %.3f\n",quadrado);
            System.out.printf("RETANGULO: %.3f\n",retangulo);
        }
}