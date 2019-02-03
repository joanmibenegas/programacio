package buscaminas;

public class Partida {

    //Creació array cuadros
    private int numerofiles = 0;
    private int numerocols = 0;
    private int contadorMines = 0;
    private int contadorTrobats = 0;
    private Cuadro[][] cuadro = null;
    private final int[][] direccions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    public Cuadro[][] crearBotonsArray(int numerofiles, int numerocols) {
        this.numerofiles = numerofiles;
        this.numerocols = numerocols;
        Cuadro[][] arraycuadro = new Cuadro[numerofiles][numerocols];
        for (int f = 0; f < numerofiles; f++) {
            for (int c = 0; c < numerocols; c++) {
                Cuadro cuadrotemp = new Cuadro();
                cuadrotemp.setPos(f, c);
                arraycuadro[f][c] = cuadrotemp;
            }
        }
        this.cuadro = arraycuadro;
        return arraycuadro;
    }

    public void asignarMines() {
        int mines = (int) ((numerofiles * numerocols) * 0.1);

        for (int i = 0; i < mines; i++) {
            int f, c;
            do {
                f = (int) (Math.random() * numerofiles);
                c = (int) (Math.random() * numerocols);
            } while (cuadro[f][c].estatMinat());

            //Asignar una mina
            cuadro[f][c].setMina(true);
            contadorMines++;
        }
    }

    //Contador trobats
    public void actualitzarContadorTrobats() {
        int tempContadorTrobats = 0;
        for (int i = 0; i < cuadro.length; i++) {
            for (int j = 0; j < cuadro.length; j++) {
                if (cuadro[i][j].getPitjat()) {
                    tempContadorTrobats++;

                }
            }
        }
        int calc = tempContadorTrobats - contadorTrobats;
        contadorTrobats += calc;
    }

    public boolean mirarSiGuany() {
        return ((numerocols * numerofiles) - contadorMines) == contadorTrobats;
    }

    //Asignar Mines Proximes
    public void asignarMinesProximes() {
        for (int f = 0; f < numerofiles; f++) {
            for (int c = 0; c < numerocols; c++) {
                int contadorBombesDevora = 0;
                for (int i = 0; i < direccions.length; i++) {
                    if (comprovarDireccions(cuadro, direccions[i], numerofiles, numerocols, f, c)) {
                        contadorBombesDevora++;
                    }
                }
                cuadro[f][c].setMinesProximes(contadorBombesDevora);
            }

        }
    }

    private static boolean comprovarDireccions(Cuadro[][] posCuadro, int[] dirs, int nFiles, int nCol, int fAct, int cAct) {
        int dfila = (fAct + dirs[0]);
        int dcolumn = (cAct + dirs[1]);
        boolean avançar = ((dfila >= 0) && (dfila < nFiles)) && ((dcolumn >= 0) && (dcolumn < nCol));
        boolean bomba = false;

        if (avançar) {
            if (posCuadro[dfila][dcolumn].estatMinat()) {
                bomba = true;
            }
        }

        return bomba;
    }

}
