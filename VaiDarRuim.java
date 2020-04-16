public class VaiDarRuim{
    public static void main(String args[]){

        byte b = 127;

        System.out.println("Valor do b="+b);

        b++;
        System.out.println("Valor novo do b="+b);
    }
}

/*
         0111 1111  = 127 +1
                +1
        ----------
         1000 0000  = -128


 */