import java.util.Scanner;
public class URI1074{
    public static void main(String args[]){
        int N, valor;
        Scanner teclado = new Scanner(System.in);
        N = teclado.nextInt();
        for (int i=0; i<N; i++){
            valor = teclado.nextInt();

            if (valor == 0){
                System.out.println("NULL");
            }
            else{
                if (valor % 2 == 0){ // verifico se ele eh PAR (EVEN)
                   if (valor > 0){
                       System.out.println("EVEN POSITIVE");
                   }
                   else{
                       System.out.println("EVEN NEGATIVE");
                   }
                }
                else{                // verifico se eh IMPAR (ODD)
                   if (valor > 0){
                       System.out.println("ODD POSITIVE");
                   }
                   else{
                       System.out.println("ODD NEGATIVE");
                   }

                }
            }
        }
    }
}