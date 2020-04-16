public class ComStrings{
    public static void main(String args[]){
        String nome;

        nome = "Isidro";

        char vetorLetras[];

        // vou converter a String para um vetor de Caracteres;
        vetorLetras = nome.toCharArray();
        

        // aqui eu imprimo uma posicao especifica desse vetor
        System.out.println(vetorLetras[4]);
        // aqui eu sei o tamanho da string
        System.out.println(nome.length());
        // eu imprimo uma posicao especifica da String sem precisar converter para vetor
        System.out.println(nome.charAt(3));   

    }
}