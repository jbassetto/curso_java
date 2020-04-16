import java.util.Scanner;
public class URI1168{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N;
        
        String numerao;
        int numLeds;
        char letra;

        // leio como String o N e converto
        N = Integer.parseInt(teclado.nextLine());
        for (int i=0; i<N; i++){

            // leio o numero grandao
            numerao = teclado.nextLine();
            numLeds = 0;

            // para cada "letra" desse numerao, vou somando a qdte de Leds de cada uma
            for(int pos=0; pos<numerao.length(); pos++){
                letra = numerao.charAt(pos);
                switch(letra){
                    case '1':
                    numLeds = numLeds + 2;
                    break;
                    case '2':
                    case '3':
                    case '5':
                    numLeds = numLeds + 5;
                    break;
                    case '4':
                    numLeds = numLeds + 4;
                    break;
                    case '6':
                    case '9':
                    case '0':
                    numLeds = numLeds + 6;
                    break;
                    case '7':
                    numLeds = numLeds + 3;
                    break;
                    case '8':
                    numLeds = numLeds + 7;
                    break;
                }
            }
            System.out.println(numLeds+" leds");
        }
    }
}