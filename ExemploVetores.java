public class ExemploVetores{
    public static void main(String args[]){
        // declarei um vetor
        int valores[];
        // definir o tamanho dele
        valores = new int[10];

        for (int pos=0; pos<10; pos++){
            valores[pos] = (pos+1)*100;
        }

        for (int pos=0; pos<10; pos++){
            System.out.println(valores[pos]);
        }        
        
    }
}