import java.util.Scanner;
public class URI1143{
    public static void main(String args[]){
        int N;
        Scanner teclado = new Scanner(System.in);

        N = teclado.nextInt();
        for (int i=1;i<=N;i++){
            System.out.println(i+" "+i*i+" "+i*i*i);
        }
    }
}