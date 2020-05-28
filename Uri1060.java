import java.util.Scanner;
public class Uri1060{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in); 

            int i, aux=0;
            float num;

            for (i=0; i<6; i++){
                num = teclado.nextFloat();

                if (num > 0){
                    aux++;
                }
            }

            System.out.println(aux + " valores positivos");
        }
}