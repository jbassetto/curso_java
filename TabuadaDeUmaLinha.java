import java.util.Scanner;
public class TabuadaDeUmaLinha{
    public static void main(String args[]){
        for (int i=0, valor=(new Scanner(System.in).nextInt());i<10;System.out.println(valor+" x "+i+" = "+ (valor*i++)));
    }
}