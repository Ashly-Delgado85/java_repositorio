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
        
        this.nombreDelJugadr = nombreDelJugadr;
        this.tirosDelJugador = tirosDelJugador;
        matrizDelJuego = new int  [9][8];
        matrizDelJuego = asignarEnBlanco(matrizDelJuego,9,8);
        asignaBarcos();
    }
    
    //funcion para muestre el tablero con las casillas en blanco cuando se reinicia el juego
    public void asignarMatriz0(){
        for (int i = 0; i < matrizDelJuego.length; i++) {
            for (int j = 0; j < matrizDelJuego[i].length; j++) {
                matrizDelJuego[i][j]=0;
            }
        }
    }
    
    //funcion de reiniciar el juego
    public void reiniciarJuego(String Nombre, int tiros){
        matrizDelJuego = asignarEnBlanco(matrizDelJuego,9,8);
        this.nombreDelJugadr = nombreDelJugadr;
        this.tirosDelJugador = tirosDelJugador;
        asignaBarcos();
    }
    
    //funcion de asignar los barcos en las casillas de los tableros aleatoriamente 
    public void asignaBarcos(){
        int tipo;
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
    
    public int[][] asignarEnBlanco(int[][] matriz,int filas,int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]=0;
            }
        }
        return matriz;
    }
    
    //funcion de asignar submarino con la random
    //coloca un submarino en una casilla representado por el valor 1
    //Lo posiciona aleatoriamente, verificando que donde lo coloque no haya otro barco
    public static int[][] asignaSubmarinos(int[][] matriz){
        //selecciona una fila entre 0 y 8
        int numFila = (int) (Math.random() * 9);
        //selecciona una columna entre 0 y 7
        int numColumna = (int) (Math.random() * 8);
        //verifica si la casilla esta ocupada 
        if(matriz[numFila][numColumna]!=0){
            //si no esta vacia hace el llamado recursivo de la funcion
            asignaSubmarinos(matriz);
        }else{
            //si la casilla esta vacia coloca el submarino usando el valor 1
            matriz[numFila][numColumna] = 1;
        }
        return matriz;
    }
    
    //funcion de asignar destructor con la random
    //Lo posiciona aleatoriamente, verificando que donde lo coloque no haya otro barco
    public static int[][] asignaDestructores(int[][] matriz){
        //slecciona una fila entre 0 y 8
        int numFila = (int) (Math.random() * 9);
        //selecciona una columna entre 0 y 6
        int numColumna = (int) (Math.random() * 7);
        //verifica si no esta ocupada la casilla 
        //hace dos verificaciones primero que la fila y la columna sean diferente de 0 
        //luego que la filla y la columna+1 o sea la siguiente este vacia
        if(matriz[numFila][numColumna]!=0 ||
                matriz[numFila][numColumna+1]!=0){
            // si no esta vacia hace el llamado recursivo de la funcion 
            asignaDestructores(matriz);
        }else{
            // si esta vacia posicona una parte del destructor con los valores 21
            //asigna la otra parte del dectructoe coon columna+1 con los valores 22
            //asgina esos dos valores ya que los destructores ocupan dos casillas
            matriz[numFila][numColumna] = 21;
            matriz[numFila][numColumna+1] = 22;
        }
        return matriz;
    }
    
    //funcion de asignar destructor de forma vertical con la random
    public static int[][] asignaDestructoresVertical(int[][] matriz){
        //selecciona una fila entre 0 y 6
        int numFila = (int) (Math.random() * 7);
        //selecciona una columna entre 0 y 5
        int numColumna = (int) (Math.random() * 6);
        //verifica que no esten ocuapadas 
        //como es vertical suma una posicion en las filas
        //ya que ocupan dos casillas representadala primera parte del destructor por los valores 25 y la segunda por 26
        if(matriz[numFila][numColumna]!=0 ||
                matriz[numFila+1][numColumna]!=0){
            //si no esta vacia ace el llamado de la funcion recursuvamente
            asignaDestructoresVertical(matriz);
        }else{
            //cuando ya estan vacias coloca el destructor de manera vertical
            matriz[numFila][numColumna] = 25;
            matriz[numFila+1][numColumna] = 26;
        }
        return matriz;
    }
    
    //funcion de asignar crucero con la random
    public static int[][] asignaCrucero(int[][] matriz){
        //selecciona una fila entre 0 y 8
        int numFila = (int) (Math.random() * 9);
        //selecciona una columna entre 0 y 5
        int numColumna = (int) (Math.random() * 6);
        //verifica que no esten ocupadas 
        //el crucero lleva 3 posiciones de casilla 
        //por esa razon en la segunda condicion suma una columna y dos en la tercera
        if(matriz[numFila][numColumna]!=0 ||
                matriz[numFila][numColumna+1]!=0 ||
                matriz[numFila][numColumna+2]!=0){
            // si esta ocupada hace el llamado recursivo
            asignaCrucero(matriz);
        }else{
            // si no estan ocupadas coloca el crucero en 3 casillas
            // primera casilla representada por los valores 31, segunda 32 t tercera 33
            matriz[numFila][numColumna] = 31;
            matriz[numFila][numColumna+1] = 32;
            matriz[numFila][numColumna+2] = 33;
        }
        return matriz;
    }
    
    //funcion de asignar crucero vertical con la random
    public static int[][] asignaCruceroVertical(int[][] matriz){
        //selecciona una fila entre 0 y 5
        int numFila = (int) (Math.random() * 6);
        //selecciona una columna entre 0 y 5
        int numColumna = (int) (Math.random() * 6);
        //verifica que no esten ocupadas 
        //como es vertical las filas van a sumar en la primera condicion 1 en la segunda 2
        if(matriz[numFila][numColumna]!=0 ||
                matriz[numFila+1][numColumna]!=0 ||
                matriz[numFila+2][numColumna]!=0){
            // si estan ocupadas hace el llamado recursivo de la funcion
            asignaCruceroVertical(matriz);
        }else{
            //si no esta ocupado asinga el crucero de manera vertical
            matriz[numFila][numColumna] = 35;
            matriz[numFila+1][numColumna] = 36;
            matriz[numFila+2][numColumna] = 37;
        }
        return matriz;
    }
    
    //funcion de asignar acorazado con la random
    public static int[][] asignaAcorazado(int[][] matriz){
        //selecciona una fila entre 0 y 8
        int numFila = (int) (Math.random() * 9);
        //selecciona una columna entre 0 y 4 evita salirse del borde derecho
        int numColumna = (int) (Math.random() * 5);
        //asigna el acorazado en 4 casillas 
        //suma  1 columna a la segunda posicion
        //suma 2 columnas a la tercera posicion 
        //suma 3 columnas a la cuarta posicion
        matriz[numFila][numColumna] = 41;
        matriz[numFila][numColumna+1] = 42;
        matriz[numFila][numColumna+2] = 43;
        matriz[numFila][numColumna+3] = 44;
        return matriz;
    }
    
    //funcion de asignar acorazado vertical con la random
    public static int[][] asignaAcorazadoVertical(int[][] matriz){
        //selecciona una fila entre 0 y 4 Evita salirse del borde inferior 
        int numFila = (int) (Math.random() * 5);
        //selecciona columnas entre 0 y 5
        int numColumna = (int) (Math.random() * 6);
        //asigna el acorazado de manera vertical
        //ocupan 4 campos y como es vertical suma a las filas
        matriz[numFila][numColumna] = 45;
        matriz[numFila+1][numColumna] = 46;
        matriz[numFila+2][numColumna] = 47;
        matriz[numFila+3][numColumna] = 48;
        return matriz;
    }
    
    //Devuelve el valor actual en la posición [fila][columna] de la matriz matrizDelJuego
    public int devolverValor(int fila, int columna){
        return matrizDelJuego[fila][columna];
    }
    
    //Este método realiza un ataque sobre la celda especificada dependiendo del modo
    //en esta funcion invierte el valor actual de la casilla
    //Si había un submarino (1), ahora será -1 → indica que fue impactado
    public void atacar(int fila, int columna,int modo){
        if(modo==0){
            matrizDelJuego[fila][columna]=matrizDelJuego[fila][columna]*-1;
        }else{
            matrizDelJuego[fila][columna]=-2;
        }
    }
    
    //esta funcion es para el estado de los barcos tanto vertical como horizontal para cuandorecibe los ataques del enemigo
    //y al final retorna la respuesta si fue averiado o si impacto la ultima casilla del barco un hundido de respuesta
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