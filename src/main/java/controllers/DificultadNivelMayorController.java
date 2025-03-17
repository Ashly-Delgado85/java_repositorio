/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Ashly
 */
public class DificultadNivelMayorController implements Initializable {

    @FXML
    private Button btnInicarTiempo;
    @FXML
    private Label labelTiempo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
     private int tiempoRestante = 15; //tiempo inical
      private Timeline timeline; //creacion de un objeto para el tiempo
      
        public void iniciarCronometro() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), (ActionEvent event) -> {
            tiempoRestante--; //se decrece en 1s
            labelTiempo.setText("Tiempo: " + tiempoRestante + "s"); //se va actualizando el tiempo

            if (tiempoRestante <= 0) {
                timeline.stop(); //se detiene el tiempo a llegar a cero
                labelTiempo.setText("Fin de la batalla");
                // Aquí puedes agregar alguna acción cuando el tiempo acabe
            }
        }));
        
        timeline.setCycleCount(Timeline.INDEFINITE); // Se ejecuta indefinidamente
        timeline.play(); // Iniciar cronómetro
        }

    @FXML
    private void btnInicarTiempoClick(ActionEvent event) {
        iniciarCronometro();
    }
}
