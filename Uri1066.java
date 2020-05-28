import java.util.Scanner;
public class Uri1066{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in); 

            int i, num, aux1=0, aux2=0, aux3=0, aux4=0;

            for (i=0; i<5; i++){
                num = teclado.nextInt();

                if (num%2 == 0){
                    aux1++;
                }
                else if (num%2 != 0){
                    aux2++;
                }

                if (num>0){
                    aux3++;
                }
                else if (num<0){
                    aux4++;
                }
            }

            System.out.println(aux1 + " valor(es) par(es)");
            System.out.println(aux2 + " valor(es) impar(es)");
            System.out.println(aux3 + " valor(es) positivo(s)");
            System.out.println(aux4 + " valor(es) negativo(s)");
        }
}