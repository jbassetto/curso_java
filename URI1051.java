import java.util.Scanner;
public class URI1051{
    public static void main (String args[]){
        float salario, imposto;
        Scanner teclado = new Scanner(System.in);

        salario = teclado.nextFloat();

        if (salario <= 2000.0f){
            System.out.println("Isento");
        }
        else{
            if (salario <= 3000.0f){
                imposto = 0.08f * (salario - 2000.0f);
                System.out.printf("R$ %.2f\n",imposto);
            }
            else {
                if (salario <= 4500.0f){
                    imposto = 80.0f + (salario - 3000)*0.18f;
                    System.out.printf("R$ %.2f\n",imposto);
                }
                else{
                    imposto = 80.0f + 270.0f + (salario - 4500.0f)*0.28f;
                    System.out.printf("R$ %.2f\n",imposto);
                }
            }
        }
    }
}