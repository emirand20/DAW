package cursaCamells;

public class Dau  {

    private int dau;
    private int movimiento;

    public void lanza(){
        int dau = (int) (Math.random() * (6 + 1) ) + 1;
    }

    // public int movimientoJugador(){
    //     if (dau1 != dau2){
    //        movimiento = dau1 + dau2;
    //     }else movimiento = dau1 - dau2;
    //     return movimiento;
    // }
}
