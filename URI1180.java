import java.util.Scanner;
public class URI1180{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X[];
        int N;
        int menor, menorPos;

        // ler o tamanho do vetor
        N = teclado.nextInt();
        // criei o vetor do tamanho lido
        X = new int[N];

        //vamos ler agora cada um dos valores
        for (int pos=0; pos < N; pos++){
            X[pos] = teclado.nextInt();
        }

        // tomo como referencia um valor do nosso conjunto
        menor = X[0];
        menorPos = 0;

        // comparar todos os elementos restantes com a referencia
        for (int pos=1; pos<N; pos++){
            if (X[pos] < menor){
                menor = X[pos];
                menorPos = pos;
            }
        }

        System.out.println("Menor valor: "+menor);
        System.out.println("Posicao: "+menorPos);








    }
}