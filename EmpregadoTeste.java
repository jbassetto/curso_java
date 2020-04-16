import java.util.Scanner;
public class EmpregadoTeste{
    public static void main(String args[]){
        Empregado e;
        Scanner teclado = new Scanner(System.in);
        String textoNome, textoSalario;

        System.out.println("Digite o nome do Funcionario:");
        textoNome = teclado.nextLine();
        System.out.println("Digite o salario inicial:");
        textoSalario = teclado.nextLine();

        e = new Empregado(textoNome, Double.parseDouble(textoSalario));

        e.imprimir();
        System.out.println("    Vou dar um aumento de 15% no salario");
        e.aumentarSalario(15.0);
        e.imprimir();
    }
}