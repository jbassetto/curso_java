import java.util.Scanner;

public class URI1164{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num;
        int somaDen;
        int N;
        N = teclado.nextInt();

        for (int i=0; i< N; i++){
            num = teclado.nextInt();
            somaDen = 0;
            for (int den=1; den<num; den++){
                if (num % den == 0){
                    somaDen = somaDen + den;
                }
            }
            if (somaDen == num){
                System.out.println(num+" eh perfeito");
            }
            else{
                System.out.println(num+" nao eh perfeito");
            }
        }
    }
}