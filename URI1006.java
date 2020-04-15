/*calculo de media
A * 2 pesoA
B * 3 pesoB
C * 5 pesoC
nota = pesoA + pesob + pesoC / 10

*/
import java.util.Scanner; 
public class URI1006 {
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in); 
        double A, B, C, nota;
        
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        nota = (((A*2) + (B*3) + (C*5))/10); 

        System.out.printf("MEDIA = %.1f\n",nota);
    }    
}