import java.util.Scanner;
public class Uri1070{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in); 

            int i, num;

            num = teclado.nextInt();

            if (num%2 == 0){
                num ++;
            }

            for (i=0; i<6; i++){
                System.out.println(num);
                num += 2;
            }
        }
}