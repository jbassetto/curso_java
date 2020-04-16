import java.util.Scanner;
public class URI1160{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int PA, PB;
        int tempo, T;
        float G1, G2;

        T = teclado.nextInt();
        for (int i=0; i<T; i++){
            // vou resolver para 1 caso
            PA = teclado.nextInt();
            PB = teclado.nextInt();
            G1 = teclado.nextFloat();
            G2 = teclado.nextFloat();
            tempo = 0;
            do{
                PA = (int)(PA + PA*G1/100);
                PB = (int)(PB + PB*G2/100);
                tempo++;
                if (tempo > 100){
                    break;
                }
            } while(PA <= PB);
            if (tempo > 100){
                System.out.println("Mais de 1 seculo.");
            }
            else{
                System.out.println(tempo+" anos.");
            }
        }
    }
}