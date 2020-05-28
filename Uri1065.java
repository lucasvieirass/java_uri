import java.util.Scanner;
public class Uri1065{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in); 

            int i, aux = 0, num;

            for (i=0; i<5; i++){
                num = teclado.nextInt();

                if (num%2 == 0){
                    aux++;
                }
            }

            System.out.println(aux + " valores pares");
        }
}