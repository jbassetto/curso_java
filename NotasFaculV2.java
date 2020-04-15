import java.util.Scanner;
public class NotasFaculV2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float n1, n2, me;
        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        me = (n1 + n2)/2;
        System.out.println("Media = "+me);
        if (me >= 9){
            System.out.println("CONCEITO A");
        }
        else if (me >= 8){
            System.out.println("CONCEITO B");
        }
        else if (me >= 7){
            System.out.println("CONCEITO C");
        }
        else if (me >= 6){
            System.out.println("CONCEITO D");
        }        
        else {
            System.out.println("CONCEITO F");
        }
    }
}