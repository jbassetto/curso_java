import java.util.Scanner;
public class Conversao{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int k = 100;

        int valorConvertido;
        String texto;

        System.out.println(" Digite qualquer coisa");
        texto = teclado.nextLine();
        valorConvertido = Integer.parseInt(texto);


        System.out.println(" Voce digitou = "+texto);
        System.out.println(" Eu modifiquei = " + (valorConvertido+k));

    }
}