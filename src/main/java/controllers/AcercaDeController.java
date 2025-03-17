/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import com.mycompany.proyecto_1.ashlydelgado.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Ashly
 */
public class AcercaDeController implements Initializable {

    @FXML
    private Button btnRegresar;
   
    @FXML
    private Button btnShowDescription;
 
    @FXML
    private TextArea textDescriptionShow;
    @FXML
    private ImageView imageDescription;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnRegresarClick(ActionEvent event) throws IOException {
        App.setRoot("/fxml/menu");
    }

    @FXML
    private void btnShowDescriptionClick(ActionEvent event)  throws IOException{
        textDescriptionShow.setText("Batalla Naval, también conocido como Hundir la Flota:\n" +
        "Es un juego de estrategia y lógica donde dos jugadores intentan\n" +
        "hundir los barcos del oponente antes de que el suyo sea destruido.\n" +
        "Se juega en una cuadrícula donde los jugadores colocan sus barcos\n" +
        "en secreto y luego intentan adivinar las posiciones de los barcos enemigos."
            
    );
    textDescriptionShow.setVisible(true);
    textDescriptionShow.setEditable(false);
       textDescriptionShow.setStyle("-fx-text-fill: black;");
    }



 
}
