import java.util.Scanner;
public class TesteDoWhile{
    public static void main(String args[]){
        int opcao;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("*******************************");
            System.out.println("I nao ta U - seu banco evriuer!");
            System.out.println(" 1 - para saque");
            System.out.println(" 2 - para deposito");
            System.out.println(" 3 - para transferencia");
            System.out.println(" 0 - para Encerrar");
            System.out.print(" ------- Digite sua Opcao: ");
            opcao = teclado.nextInt();
            System.out.println("Opcao escolhida = "+opcao);
        } while (opcao != 0);

        System.out.println(" >>>>> FIM DO PROGRAMA <<<<< ");
    }
}