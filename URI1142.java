import java.util.Scanner;
public class URI1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        for (int i=1; i<=N*4; i++){
            if (i % 4 == 0){
                System.out.println("PUM");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}