/*   numero 
       456  / 100
        56     4   --> centenas

        56  / 10
         6     5   --> dezenas
         +-----------> unidades
*/
import java.util.Scanner;

public class Separador{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, un, de, ce, resto;
        System.out.print("Digite um numero de 3 digitos: ");
        numero = teclado.nextInt();

        ce = numero / 100;
        resto = numero % 100; 

        de = resto / 10;
        un = resto % 10;

        System.out.println("Centenas = "+ce);
        System.out.println("Dezenas  = "+de);
        System.out.println("Unidades = "+un);
    }

}