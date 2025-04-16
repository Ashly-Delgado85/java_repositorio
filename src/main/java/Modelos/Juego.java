/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Ashly
 */
public class Juego {
    int nivel;
    
    Jugador jugador1;
    Jugador jugador2;
    
    public Juego() {
        
    }

    public Juego(int nivel, String nombreJugador1, String nombreJugador2) {
        this.nivel = nivel;
        jugador1 = new Jugador(nombreJugador1,10);
        jugador2 = new Jugador(nombreJugador2,10);
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
