public class TestesAleatorios{
    public static void main(String args[]){
        
        int x,y;

        x = 0;    
        System.out.println("Valor do x = "+ x++); // aqui acontece o incremento
        System.out.println("Valor do x = "+ x);

        System.out.println("\n\n");

        y = 0;
        /*incremento acontece aqui */ System.out.println("Valor do y = "+  ++y);
        System.out.println("Valor do y = "+ y);

        System.out.println("\n\n");

        /* for e while sao diferentes quando se usa a
           instrucao continue */

        for (int k=0; k<10; k++){
            if (k == 5){
                continue;
            }
            System.out.println(" Valor do k = "+k);
        }

        int k=0;
        while(k<10){
            if (k == 5){
                continue;
            }
            System.out.println(" Valor do k = "+k);

            k++;
        }

        System.out.println(" Fim do programa");
    }
}