import java.util.Scanner;
public class URI1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int op;
        int alcool, gasolina, diesel;
        alcool = gasolina = diesel = 0;

        do{
            op = teclado.nextInt();
            switch(op){
                case 1: 
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        } while (op != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
}