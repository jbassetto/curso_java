import java.util.Scanner;
public class URI1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hIni, mIni, hFim, mFim;
        int hor=0, min=0;

        hIni = teclado.nextInt();
        mIni = teclado.nextInt();
        hFim = teclado.nextInt();
        mFim = teclado.nextInt();

        /* primeiro eu trato a questao de horas */
        if (hFim > hIni){
            hor = hFim - hIni;
        }
        else {
            if (hFim < hIni){
                hor = 24 + (hFim - hIni);
            }
            else{
                if (hFim == hIni){
                    hor = 0;
                }
            }
        }

        /* depois eu faco o calculo dos minutos */
        if (mFim > mIni){
            min = mFim - mIni;
        }
        else{
            if (mFim < mIni){
                min = 60 + (mFim - mIni);
                hor = hor-1;
            }
            else{
                min = 0;
            }
        }

        /* trato casos excepcionais */

        if (hor == 0 && min == 0){  // caso 1 - nao tem jogo de 0 minutos => 24h
            hor = 24;
        }
        else{
            if (hor == 0 && min < 0){  // horas iguais, minutos inferiores (23h)
                hor = 23;
                min = 60 + min;
            }
            else{
                 if (hor < 0){           // se as horas foram negativas, tira de 24
                     hor = 24 + hor;
                 }
            }
        }

        System.out.println("O JOGO DUROU "+hor+" HORA(S) E "+min+" MINUTO(S)");

    }
}