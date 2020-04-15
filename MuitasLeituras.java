import java.util.Scanner;

public class MuitasLeituras{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valorInteiro;
        float valorReal;
        String texto;

        /* nao funfa, pq o texto no final nao eh capturado */
        /* System.out.println("Digite um inteiro");
        valorInteiro = teclado.nextInt();
        System.out.println("Digite um real");
        valorReal = teclado.nextFloat();
        System.out.println("Digite um texto");
        texto = teclado.nextLine(); */

        System.out.println("Digite um inteiro");
        valorInteiro = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite um real");
        texto = teclado.nextLine();
        valorReal = Float.parseFloat(texto);
        System.out.println("Digite um texto");
        texto = teclado.nextLine();



        System.out.println(" ---> Voce digitou "+valorInteiro +"  "+ valorReal + "  "+texto);
    }
}