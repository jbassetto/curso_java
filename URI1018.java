import java.util.Scanner;
public class URI1018{
    public static void main(String args[]){
        /* Entrada: Valor saque
        
           Processamento?

           Saida: valor lido, q100, q50, q20, q10, q5, q2, q1
         */

        int valorSaque;  // entrada
        int valorLido, q100, q50, q20, q10, q5, q2, q1; // saidas

        Scanner teclado = new Scanner(System.in);

        // entrada
        valorSaque = teclado.nextInt();
        valorLido  = valorSaque; // para exibir no final

        q100 = valorSaque / 100;
        valorSaque = valorSaque % 100; // valorSaque = valorSaque - q100 * 100;

        q50 = valorSaque / 50;
        valorSaque = valorSaque % 50;  // valorSaque = valorSaque - q50 * 50;

        q20 = valorSaque / 20;
        valorSaque = valorSaque % 20;  // valorSaque = valorSaque - q20 * 20;

        q10 = valorSaque / 10;
        valorSaque = valorSaque % 10;  // valorSaque = valorSaque - q10 * 10;

        q5  = valorSaque / 5;  
        valorSaque = valorSaque % 5;    // valorSaque = valorSaque - q5 * 5;

        q2  = valorSaque / 2;
        q1  = valorSaque % 2;          // ultimo Caso: valorSaque = valorSaque - q2 * 2

        System.out.println(valorLido);
        System.out.println(q100 + " nota(s) de R$ 100,00");
        System.out.println(q50 + " nota(s) de R$ 50,00");
        System.out.println(q20 + " nota(s) de R$ 20,00");
        System.out.println(q10 + " nota(s) de R$ 10,00");
        System.out.println(q5 + " nota(s) de R$ 5,00");
        System.out.println(q2 + " nota(s) de R$ 2,00");
        System.out.println(q1 + " nota(s) de R$ 1,00");
    }
}