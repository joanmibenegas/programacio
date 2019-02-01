package buscaminas;

import java.awt.event.ActionEvent;

public class Partida {
    
    
    public void actionPerformed(ActionEvent e) {
        Finestra.clickBoto(e);
    }
    
    public void crearBotonsArray(ActionEvent e, int numerofiles, int numerocols){
        Cuadro[][] arraycuadro = new Cuadro[numerofiles][numerocols];
        for (int f = 0; f < numerofiles; f++) {
            for (int c = 0; c < numerocols; c++) {
                Cuadro cuadrotemp = new Cuadro();
                cuadrotemp.setPos(f, c);
                arraycuadro[f][c] = cuadrotemp;
                cuadrotemp.addActionListener(actionPerformed(e));
                cuadrotemp.setVisible(true);
                Finestra.pantalla_joc.add(cuadrotemp);
            }
        }
        cuadro = arraycuadro;
    }
    /*     //Crear array i botons
    private void crearBotonsArray() {
        Cuadro[][] arraycuadro = new Cuadro[numerofiles][numerocols];
        for (int f = 0; f < numerofiles; f++) {
            for (int c = 0; c < numerocols; c++) {
                Cuadro cuadrotemp = new Cuadro();
                cuadrotemp.setPos(f, c);
                arraycuadro[f][c] = cuadrotemp;
                cuadrotemp.addActionListener(this);
                cuadrotemp.setVisible(true);
                this.pantalla_joc.add(cuadrotemp);
            }
        }
        cuadro = arraycuadro;
    }*/
}
