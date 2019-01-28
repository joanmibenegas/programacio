package buscaminas;


import javax.swing.JButton;

public class Cuadro extends JButton {

    private boolean mina = false; //Sera true si conté una mina
    private int minesProximes = 0;

    public Cuadro() {
        super();
        double random = Math.random();

        if (random > 0.75) {
            mina = true;
        }
    }

    public boolean estatMinat() {
        return mina;
    }
    
    public void setMinesProximes(int minesProximes){
        this.minesProximes = minesProximes;
    }

    public void setMina (boolean a){
        this.mina = true;
    }
    
}
