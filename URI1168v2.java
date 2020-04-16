import java.util.Scanner;
public class URI1168v2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N;
        /*int quantidades[] = new int[10];

        quantidades[0] = 6; // 6 leds para o digito 0
        quantidades[1] = 2;
        quantidades[2] = 5;
        quantidades[3] = 5;
        quantidades[4] = 4;
        quantidades[5] = 5;
        quantidades[6] = 6;
        quantidades[7] = 3;
        quantidades[8] = 7;
        quantidades[9] = 6;
        */
        // outra forma de declarar um vetor ja inicializando seus valores
        int quantidades[] = {6,2,5,5,4,5,6,3,7,6};
        
        String numerao;
        int numLeds;
        char letra;
        int numero;

        // leio como String o N e converto
        N = Integer.parseInt(teclado.nextLine());
        for (int i=0; i<N; i++){

            // leio o numero grandao
            numerao = teclado.nextLine();
            numLeds = 0;
            for (int pos = 0; pos<numerao.length(); pos++){

                // aqui eu pego o numero correpondente ao valor do digito
                // como faco isso? Tomando como base o valor do digito '0',
                // eu subtraio esse valor do digito correspondente (quer saber mais? veja Tabela ASCII)
                numero = numerao.charAt(pos) - '0';
                // de posse desse valor, eh so consultar no vetor de quantidades que foi
                // inicializado la em cima
                numLeds = numLeds + quantidades[numero];
            }
            System.out.println(numLeds+" leds");
           
        }
    }
}