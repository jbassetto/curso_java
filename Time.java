public class Time{
    private int hora;
    private int minu;
    private int segu;

    public void setHora(int novaHora){
        // tratamento da hora
        this.hora = novaHora;
    }
    public void setMinu(int novoMinu){
        this.minu = novoMinu;
    }
    public void setSegu(int novoSegu){
        this.segu = novoSegu;
    }

    public int getHora(){
        return this.hora;
    }
    public int getMinu(){
        return this.minu;
    }
    public int getSegu(){
        return this.segu;
    }

    public void setTime(int h, int m, int s){
        this.hora = h;
        this.minu = m;
        this.segu = s;
    }

    public String exibirHoraUniversal(){
        String horaTexto ="";
        if (this.hora < 10){
            horaTexto = "0"+this.hora+":";
        }
        else{
            horaTexto = this.hora+":";
        } 
        if (this.minu < 10){
            horaTexto = horaTexto + "0"+this.minu+":";
        }
        else{
            horaTexto = horaTexto + this.minu+":";
        }
        if (this.segu < 10){
            horaTexto = horaTexto + "0" + this.segu;
        }
        else{
            horaTexto = horaTexto + this.segu;
        }
        return horaTexto;
    }
    public String exibirHoraPadrao(){
        String sufixo;
        String resultado;
        int    horaPadrao;
        if (this.hora == 0){
            horaPadrao = 12;
            sufixo = "AM";
        }
        else{
            if (this.hora > 0 && this.hora < 11){
                horaPadrao = hora;
                sufixo = "AM";
            }
            else{
                if (hora == 12){
                    horaPadrao = 12;
                    sufixo = "PM";
                }
                else{
                    horaPadrao = this.hora - 12;
                    sufixo = "PM";
                }
            }
        }

        resultado = horaPadrao+":"+this.minu+":"+this.segu+" "+sufixo;
        return resultado;
    }

}