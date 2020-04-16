public class Empregado{
    private String nome;
    private double salario;

    // declarando um construtor com nomes de parametros iguais aos nomes de atributos
    public Empregado(String nome, double salario){
        this.nome = nome;  // o operador this eh para explicitar o atributo
        this.salario = salario;
    }

    public void imprimir(){
        System.out.println(" ==== Firma do Isidro =====");
        System.out.println(" Nome:  "+nome);
        System.out.printf(" Salario R$ %.2f\n",salario);
    }
    public void aumentarSalario(double percentual){
        this.salario = this.salario + this.salario * percentual/100;
    }
}