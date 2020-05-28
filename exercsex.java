import java.util.Scanner;
public class exercsex{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);

            int sex;
            float altura, peso;

            altura = teclado.nextFloat();
            sex = teclado.nextInt(); 
            
            if (sex==0){
                peso = (72.7f * altura) - 58;
                System.out.println("Homem, com peso ideal de " + peso); 
            }
            else{
                peso = (62.1f * altura) - 44.7f;
                System.out.println("Mulher, com peso ideal de " + peso); 
            }    
        }
}