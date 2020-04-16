public class AppDaSalaDeCasa{
    public static void main(String args[]){
        Televisao t1;

        t1 = new Televisao("LG da Sala", 40, 110, "Maxi mega plus");
        /*t1.atribuirMarca("LG da sala de TV");
        t1.atribuirTamanho(40);
        t1.atribuirVoltagem(310);
        t1.atribuirResolucao(" Ultra HD Smart Plus maste blaster hiper");
*/
        Televisao t2;
        t2 = new Televisao("Samsung do quarto",32,110,"Nada");
  /*      t2.atribuirMarca("Philco do quarto");
        t2.atribuirTamanho(32);
        t2.atribuirVoltagem(110);
        t2.atribuirResolucao("Porva");*/

        t1.ligar();
        t1.aumentarVolume();
        t1.aumentarVolume();
        t1.aumentarVolume();
        t1.avancarCanal();
        t1.avancarCanal();
        t2.ligar();
        t2.aumentarVolume();
        t2.avancarCanal();
        t1.desligar();



    }
}