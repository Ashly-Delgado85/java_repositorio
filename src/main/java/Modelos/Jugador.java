/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import static java.lang.Math.abs;

/**
 *
 * @author Ashly
 */
public class Jugador {
    private String nombreDelJugadr;
    private int tirosDelJugador;
    private int [][]  matrizDelJuego;

    public Jugador(String nombreDelJugadr, int tirosDelJugador) {
        int tipo;
        
        this.nombreDelJugadr = nombreDelJugadr;
        this.tirosDelJugador = tirosDelJugador;
        matrizDelJuego = new int  [9][8];
        matrizDelJuego = asignarEnBlanco(matrizDelJuego,9,8);
        
        tipo = (int) (Math.random() * 2);
        if (tipo == 0) {
           matrizDelJuego = asignaAcorazado(matrizDelJuego); 
        }else{
            matrizDelJuego = asignaAcorazadoVertical(matrizDelJuego);
        }
        tipo = (int) (Math.random() * 2);
        if (tipo == 0) {
           matrizDelJuego = asignaCrucero(matrizDelJuego);
        }else{
            matrizDelJuego = asignaCruceroVertical(matrizDelJuego);
        }
        tipo = (int) (Math.random() * 2);
        if (tipo == 0) {
           matrizDelJuego = asignaCrucero(matrizDelJuego);
        }else{
            matrizDelJuego = asignaCruceroVertical(matrizDelJuego);
        }
        tipo = (int) (Math.random() * 2);
        if (tipo == 0) {
            matrizDelJuego = asignaDestructores(matrizDelJuego);
        }else{
            matrizDelJuego = asignaDestructoresVertical(matrizDelJuego);
        }
        tipo = (int) (Math.random() * 2);
        if (tipo == 0) {
            matrizDelJuego = asignaDestructores(matrizDelJuego);
        }else{
            matrizDelJuego = asignaDestructoresVertical(matrizDelJuego);
        }
        tipo = (int) (Math.random() * 2);
        if (tipo == 0) {
            matrizDelJuego = asignaDestructores(matrizDelJuego);
        }else{
            matrizDelJuego = asignaDestructoresVertical(matrizDelJuego);
        }
        matrizDelJuego = asignaSubmarinos(matrizDelJuego);
        matrizDelJuego = asignaSubmarinos(matrizDelJuego);
        matrizDelJuego = asignaSubmarinos(matrizDelJuego);
        matrizDelJuego = asignaSubmarinos(matrizDelJuego);
    }

    public int[][] getMatrizDelJuego() {
        return matrizDelJuego;
    }

    public void setMatrizDelJuego(int[][] matrizDelJuego) {
        this.matrizDelJuego = matrizDelJuego;
    }
    
    
    public Jugador() {
    }

    public String getNombreDelJugadr() {
        return nombreDelJugadr;
    }

    public void setNombreDelJugadr(String nombreDelJugadr) {
        this.nombreDelJugadr = nombreDelJugadr;
    }

    public int getTirosDelJugador() {
        return tirosDelJugador;
    }

    public void setTirosDelJugador(int tirosDelJugador) {
        this.tirosDelJugador = tirosDelJugador;
    }
    
    public static int[][] asignarEnBlanco(int[][] matriz,int filas,int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]=0;
            }
        }
        return matriz;
    }
    
    //funcion de asignar barco con la random
    public static int[][] asignaSubmarinos(int[][] matriz){
        int numFila = (int) (Math.random() * 9);
        int numColumna = (int) (Math.random() * 8);
        if(matriz[numFila][numColumna]!=0){
            asignaSubmarinos(matriz);
        }else{
            matriz[numFila][numColumna] = 1;
        }
        return matriz;
    }
    
    //funcion de asignar destructor con la random
    public static int[][] asignaDestructores(int[][] matriz){
        int numFila = (int) (Math.random() * 9);
        int numColumna = (int) (Math.random() * 7);
        if(matriz[numFila][numColumna]!=0 ||
                matriz[numFila][numColumna+1]!=0){
            asignaDestructores(matriz);
        }else{
            matriz[numFila][numColumna] = 21;
            matriz[numFila][numColumna+1] = 22;
        }
        return matriz;
    }
    
    //funcion de asignar destructor de forma vertical con la random
    public static int[][] asignaDestructoresVertical(int[][] matriz){
        int numFila = (int) (Math.random() * 7);
        int numColumna = (int) (Math.random() * 6);
        if(matriz[numFila][numColumna]!=0 ||
                matriz[numFila+1][numColumna]!=0){
            asignaDestructoresVertical(matriz);
        }else{
            matriz[numFila][numColumna] = 25;
            matriz[numFila+1][numColumna] = 26;
        }
        return matriz;
    }
    
    //funcion de asignar crucero con la random
    public static int[][] asignaCrucero(int[][] matriz){
        int numFila = (int) (Math.random() * 9);
        int numColumna = (int) (Math.random() * 6);
        if(matriz[numFila][numColumna]!=0 ||
                matriz[numFila][numColumna+1]!=0 ||
                matriz[numFila][numColumna+2]!=0){
            asignaCrucero(matriz);
        }else{
            matriz[numFila][numColumna] = 31;
            matriz[numFila][numColumna+1] = 32;
            matriz[numFila][numColumna+2] = 33;
        }
        return matriz;
    }
    
    //funcion de asignar crucero vertical con la random
    public static int[][] asignaCruceroVertical(int[][] matriz){
        int numFila = (int) (Math.random() * 6);
        int numColumna = (int) (Math.random() * 6);
        if(matriz[numFila][numColumna]!=0 ||
                matriz[numFila+1][numColumna]!=0 ||
                matriz[numFila+2][numColumna]!=0){
            asignaCruceroVertical(matriz);
        }else{
            matriz[numFila][numColumna] = 35;
            matriz[numFila+1][numColumna] = 36;
            matriz[numFila+2][numColumna] = 37;
        }
        return matriz;
    }
    
    //funcion de asignar acorazado con la random
    public static int[][] asignaAcorazado(int[][] matriz){
        int numColumna = (int) (Math.random() * 5);
        int numFila = (int) (Math.random() * 9);
        matriz[numFila][numColumna] = 41;
        matriz[numFila][numColumna+1] = 42;
        matriz[numFila][numColumna+2] = 43;
        matriz[numFila][numColumna+3] = 44;
        return matriz;
    }
    
    //funcion de asignar acorazado vertical con la random
    public static int[][] asignaAcorazadoVertical(int[][] matriz){
        int numFila = (int) (Math.random() * 5);
        int numColumna = (int) (Math.random() * 6);
        matriz[numFila][numColumna] = 45;
        matriz[numFila+1][numColumna] = 46;
        matriz[numFila+2][numColumna] = 47;
        matriz[numFila+3][numColumna] = 48;
        return matriz;
    }
    
    public int devolverValor(int fila, int columna){
        return matrizDelJuego[fila][columna];
    }
    
    public void atacar(int fila, int columna,int modo){
        if(modo==0){
            matrizDelJuego[fila][columna]=matrizDelJuego[fila][columna]*-1;
        }else{
            matrizDelJuego[fila][columna]=-2;
        }
    }
    
    public String estadoDelBarco(int fila, int columna){
        String respuesta="";
        switch(matrizDelJuego[fila][columna]){
            case -1:
                respuesta= "Submarino hundido";
            break;
            case -21:
                if(matrizDelJuego[fila][columna+1]<0){
                    respuesta= "Destructor hundido";
                }else{
                    respuesta= "Destructor averiado";
                }
            break;
            case -22:
                if(matrizDelJuego[fila][columna-1] < 0){
                    respuesta= "Destructor hundido";
                }else{
                    respuesta= "Destructor averiado";
                }
            break;
            case -25:
                if(matrizDelJuego[fila+1][columna]<0){
                    respuesta= "Destructor hundido";
                }else{
                    respuesta= "Destructor averiado";
                }
            break;
            case -26:
                if(matrizDelJuego[fila-1][columna] < 0){
                    respuesta= "Destructor hundido";
                }else{
                    respuesta= "Destructor averiado";
                }
            break;
            case -31:
                if(matrizDelJuego[fila][columna+1] < 0 && matrizDelJuego[fila][columna+2] <0 ){
                    respuesta= "Crucero hundido";
                }else{
                    respuesta= "Crucero averiado";
                }
            break;
            case -32:
                if(matrizDelJuego[fila][columna+1] < 0 && matrizDelJuego[fila][columna-1] <0){   
                    respuesta= "Crucero hundido";
                }else{
                    respuesta= "Crucero averiado";
                }
            break;
            case -33:
                if(matrizDelJuego[fila][columna-1] < 0 && matrizDelJuego[fila][columna-2] <0){  
                    respuesta= "Crucero hundido";
                }else{  
                    respuesta= "Crucero averiado";
                }
            break;
            case -35:
                if(matrizDelJuego[fila+1][columna] < 0 && matrizDelJuego[fila+2][columna] <0){   
                    respuesta= "Crucero hundido";
                }else{
                    respuesta= "Crucero averiado"; 
                }
            break;
            case -36:
                if(matrizDelJuego[fila+1][columna] < 0 && matrizDelJuego[fila-1][columna] <0){  
                     respuesta= "Crucero hundido";
                }else{
                    respuesta= "Crucero averiado"; 
                } 
            break;
            case -37:
               if(matrizDelJuego[fila-1][columna] < 0 && matrizDelJuego[fila-2][columna] <0){  
                    respuesta= "Crucero hundido";
               }else{
                    respuesta= "Crucero averiado"; 
               }
            break;
            case -41:
                if(matrizDelJuego[fila][columna+1] < 0 && matrizDelJuego[fila][columna+2] <0 && matrizDelJuego[fila][columna+3] <0){ 
                    respuesta= "Acorazado hundido";
                }else{
                    respuesta= "Acorazado averiado"; 
                }
            break;
            case -42:
                if(matrizDelJuego[fila][columna-1] < 0 && matrizDelJuego[fila][columna+1] <0 && matrizDelJuego[fila][columna+2] <0){ 
                  respuesta= "Acorazado hundido";
                }else{
                    respuesta= "Acorazado averiado";   
                }           
            break;
            case -43:
                if(matrizDelJuego[fila][columna-1] < 0 && matrizDelJuego[fila][columna-2] <0 && matrizDelJuego[fila][columna+1] <0){ 
                  respuesta= "Acorazado hundido"; 
                }else{
                    respuesta= "Acorazado averiado";      
            }
            break;
            case -44:
                if(matrizDelJuego[fila][columna-1] < 0 && matrizDelJuego[fila][columna-2] <0 && matrizDelJuego[fila][columna-3] <0){ 
                    respuesta= "Acorazado hundido"; 
                }else{
                    respuesta= "Acorazado averiado";       
                }
            break;
            case -45:
                if(matrizDelJuego[fila+1][columna] < 0 && matrizDelJuego[fila+2][columna] <0 && matrizDelJuego[fila+3][columna] <0){ 
                    respuesta= "Acorazado hundido"; 
                }else{
                    respuesta= "Acorazado averiado";    
                }
            break;
            case -46: 
                if(matrizDelJuego[fila-1][columna] < 0 && matrizDelJuego[fila+1][columna] <0 && matrizDelJuego[fila+2][columna] <0){ 
                    respuesta= "Acorazado hundido"; 
                }else{
                    respuesta= "Acorazado averiado";     
                }
            break;
            case -47:
                if(matrizDelJuego[fila-1][columna] < 0 && matrizDelJuego[fila-2][columna] <0 && matrizDelJuego[fila+1][columna] <0){ 
                    respuesta= "Acorazado hundido"; 
                }else{
                    respuesta= "Acorazado averiado";  
                }
            break;
            case -48:
                if(matrizDelJuego[fila-1][columna] < 0 && matrizDelJuego[fila-2][columna] <0 && matrizDelJuego[fila-3][columna] <0){ 
                    respuesta= "Acorazado hundido"; 
                }else{
                    respuesta= "Acorazado averiado";   
                }
            break;

        }
        
        return respuesta;
    }
    
 }