import java.util.Scanner;
public class URI1177{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N[] = new int[1000];
        int T = teclado.nextInt();
        int p=0;

        for (int pos = 0 ; pos < N.length; pos++){
            N[pos] = p;
            System.out.println("N["+pos+"] = "+N[pos]);

            p = ( p+1 ) % T;
            
            /*
            forma equivalente ao exemplo acim
            p++;
            if (p == T){
                p = 0;
            } */
        }
    }
}