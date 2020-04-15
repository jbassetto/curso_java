import java.util.Scanner;
public class URI1035{
    public static void main(String args[]){
        int A,B,C,D;
        Scanner teclado = new Scanner(System.in);
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        /*
        se B for maior do que C e                            - ok 
        se D for maior do que A, e                           - ok
        a soma de C com D for maior que a soma de A e B e    - ok
        se C e D, ambos, forem positivos e                   - ok
        se a variável A for par                              - ok
         */
        //       c1         c2           c3              c4         c4          c5
        if (  (B > C) && (D > A) && (C + D > A + B) && (C > 0) && (D > 0) && (A%2 == 0) ) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
    }
}