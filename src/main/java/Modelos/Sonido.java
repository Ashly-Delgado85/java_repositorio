/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
/**
 *
 * @author Ashly
 */
//clase para manejar el sonido del juego
public class Sonido {
      private MediaPlayer mediaPlayer;
 
  
    public Sonido() {
        
    }
    
    public void cargarSonido(String soundFile,  boolean repetir ){
        Media sound = new Media(getClass().getResource(soundFile).toString());
        mediaPlayer = new MediaPlayer(sound);
        if (repetir) {
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Sonido en bucle
        }
    }

    public void sonar() {
        mediaPlayer.play();
    }

    public void parar() {
        mediaPlayer.stop();
    }
}
