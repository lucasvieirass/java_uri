import java.util.Scanner;
public class Uri1020{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);

            int X,resto,ano,meses,dias;
            
            X = teclado.nextInt();
        
            ano = X / 365;
            resto = X % 365;
            meses = resto / 30;
            dias = resto % 30;

            System.out.println(+ano+" ano(s)");
            System.out.println(+meses+" mes(es)");
            System.out.println(+dias+" dia(s)");
            }
}