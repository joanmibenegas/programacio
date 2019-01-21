package buscaminas;


import javax.swing.JButton;

public class Cuadro extends JButton {

    private boolean mina = false; //Sera true si conté una mina

    public Cuadro() {
        super();
        double random = Math.random();
        if (random > 0.9) {
            mina = true;
        }
    }

    public boolean estatMinat() {
        return mina;
    }

}
