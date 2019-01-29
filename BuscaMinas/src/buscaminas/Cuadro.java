package buscaminas;


import javax.swing.JButton;

public class Cuadro extends JButton {

    private boolean mina = false; //Sera true si conté una mina
    private int minesProximes = 0;
    private int fila = 0;
    private int columna = 0;
    private boolean pitjat = false;
    
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
    
    public int getMinesProximes(){
        return minesProximes;
    }

    public void setMina (boolean a){
        this.mina = a;
    }
    
    public void setPos (int f, int c){
        this.fila = f;
        this.columna = c;
    }
    
    public int getFila(){
        return fila;
    }
    
    public int getColumna() {
        return columna;
    }
    public void pitjarBoto(boolean a){
        this.pitjat = a;
    }
    public boolean getPitjat(){
        return pitjat;
    }
}
