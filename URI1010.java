import java.util.Scanner;

public class URI1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod1, qtd1, cod2, qtd2;
        float preco1, preco2, total;

        cod1   = teclado.nextInt();
        qtd1   = teclado.nextInt();
        preco1 = teclado.nextFloat();

        cod2   = teclado.nextInt();
        qtd2   = teclado.nextInt();
        preco2 = teclado.nextFloat();

        total = qtd1 * preco1 + qtd2 * preco2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);



    }

}