package New;

import java.util.*;
public class codepoint {
    private static final int LADO= 4;
    //En tablero guardaremos 0 si está libre 1 si es del jugador 1 y 2 si es del jugador 2
    private static int tablero [][] = new int [LADO][LADO];
    public static void main(String[] args) {

        //jugadorActual variara según el jugador que tenga el turno
        int jugadorActual = 1;
        int jugadorAnterior =2;
        int jugadorActualTemp;
        int fila,columna;
        boolean hayGanador,tableroLleno;
        Scanner scanner =new Scanner (System.in);
        System.out.println("BIENVENIDO AL 3 EN RAYA:");
        PintarTablero();
        do{
            do {
                fila = LeerPosicion(scanner,true,jugadorActual);
                columna = LeerPosicion(scanner,false,jugadorActual);
                if (tablero[fila-1][columna-1]!=0)
                    System.out.println("Casilla ocupada. Intentalo otra vez");
            }
            while (tablero[fila-1][columna-1]!=0);
            tablero[fila-1][columna-1]=jugadorActual;
            PintarTablero();
            hayGanador = HayGanador(jugadorActual);
            tableroLleno = TableroLleno();
            if (!HayGanador(jugadorActual) && !TableroLleno()) {
                jugadorActualTemp=jugadorActual;
                jugadorActual = jugadorAnterior;
                jugadorAnterior = jugadorActualTemp;
            }
        }
        while ((!hayGanador) && (!tableroLleno));
        if(hayGanador) {
            System.out.println("GANADOR: jugador "+jugadorActual);
        }
        else {
            System.out.println("EMPATE");
        }
        scanner.close();

    }

    private static boolean HayGanador(int jugador) {

        for(int i =0;i<LADO;i++) {
            if (FilaGanadora(i,jugador))
                return true;
        }
        for(int j =0;j<LADO;j++) {
            if (ColumnaGanadora(j,jugador))
                return true;
        }
        if(DiagonalGanadora(jugador)) {
            return true;
        }

        return false;
    }

    private static boolean TableroLleno() {
        for(int i =0;i<LADO;i++) {
            for(int j= 0;j<LADO;j++) {
                if(tablero[i][j]==0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean FilaGanadora(int fila, int buscado) {
        for (int j=0; j<LADO; j++) {
            if (tablero[fila][j] != buscado)
                return false;
        }
        return true;
    }

    private static boolean ColumnaGanadora(int columna, int buscado) {
        for (int i=0; i<LADO; i++) {
            if (tablero[i][columna] != buscado)
                return false;
        }
        return true;
    }
    private static boolean DiagonalGanadora(int buscado) {
        if(tablero[0][0]==buscado && tablero[1][1]==buscado && tablero[2][2]==buscado) {
            return true;
        }

        if(tablero[2][0]==buscado && tablero[1][1]==buscado && tablero[0][2]==buscado) {
            return true;
        }
        return false;
    }

    private static int LeerPosicion(Scanner scanner, boolean fila, int jugador) {
        int posicion;

        String literal;
        if (fila)
            literal="Fila";
        else
            literal="Columna";

        do  {
            System.out.println("Jugador " + jugador + " introduce "+literal);
            posicion = scanner.nextInt();
            if (posicion <=0 || posicion >LADO)
                System.out.println(literal + " fuera del parametro, introduce entre 1 y " + LADO);
        }
        while (posicion<=0 || posicion>LADO);

        return posicion;
    }

    private static void PintarTablero() {
        System.out.println();
        for(int i =0;i<LADO;i++) {
            for(int j=0;j<LADO;j++) {
                System.out.print("|"+ SimboloCasilla(tablero[i][j]));
            }
            System.out.println("|");
        }
        System.out.println();
    }

    private static String SimboloCasilla (int valor) {
        String valorString="";
        switch (valor) {
            case 0: valorString="-";break;
            case 1: valorString="X";break;
            case 2: valorString="O";break;
        }
        return valorString;
    }

}


