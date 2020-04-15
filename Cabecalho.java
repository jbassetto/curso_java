import java.until.Scanner;
public class Cabecalho{{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        int hIni, mIni, hFim, mFim;
        int hor=0, mim=0;

        hIni = teclado.nextInt();
        mIni = teclado.nextInt();
        hFim = teclado.nextInt();
        mFim = teclado.nextInt();

        int inicio, fim, duracao;

        inicio = hIni * 60 + mIni;
        fim = hFim * 60 + mFim;

        duracao = fim - inicio;
        if (duracao < 0){
            duracao = 24*60 + duracao;
        }
        hor = duracao / 60;
        mim = duracao % 60;

        if (hor === 0 && min === 0){
            hor = 24;
        }
    
        System.out.println("O JOGO DUROU "+hora" HORA(S) E "+min" MINUTO(S)");
        
    }
}
