import java.util.Scanner;
public class Votante{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade");
        idade = teclado.nextInt();
        if (idade < 16){
            System.out.println("Nao Eleitor!");
        }
        else{
            if ( idade >= 18 && idade <=65 ){
                System.out.println("Eleitor Obrigatorio");
            }
            else{
                /* codigo redundate */
                if ( (idade >= 16 && idade < 18) || (idade > 65)){
                   System.out.println("Eleitor Facultativo");
                }
            }
        }
    }
}