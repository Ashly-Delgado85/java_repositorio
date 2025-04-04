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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ashly
 */
public class DificultadesController implements Initializable {
    @FXML
    private TextField textInstrucciones;
    @FXML
    private TextField textInstruccion;
    @FXML
    private Button btnRegresarPrincipal;
    @FXML
    private Button btnIniciarDificultad;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
         // Inicializar ToggleGroup para los RadioButton
        
        
        // Para que no se pueda editar el texto en los campos de instrucciones
        textInstrucciones.setEditable(false);
        textInstruccion.setEditable(false);
    }
   
    @FXML
    private void btnRegresarPrincipalClick(ActionEvent event) throws IOException {
        App.setRoot("/fxml/menu");
    }

    @FXML
    private void btnClickIniciarDificultad(ActionEvent event) throws IOException  {
        App.setRoot("/fxml/IniciarJuego"); 
   }
 
}