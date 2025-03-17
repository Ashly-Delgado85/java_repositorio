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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ashly
 */
public class DificultadesController implements Initializable {

  
    @FXML
    private CheckBox checkDificultadMenor;
    @FXML
    private CheckBox checkDificultadMedia;
    @FXML
    private CheckBox checkDificultadMayor;
   
    @FXML
    private Button btnIniciarDificultadMenor;
    @FXML
    private Button btnIniciarDificultadMedia;
    @FXML
    private Button btnIniciarDificultadMayor;
   
    @FXML
    private TextField textInstrucciones;
    @FXML
    private TextField textInstruccion;
   
    @FXML
    private Button btnRegresarPrincipal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         // Al inicio ninguna dificultad esta seleccionada
        checkDificultadMenor.setSelected(false);
        checkDificultadMedia.setSelected(false);
        checkDificultadMayor.setSelected(false);
        
        //Al inicio  los botones estan deshabilitados
        btnIniciarDificultadMenor.setDisable(true);
        btnIniciarDificultadMedia.setDisable(true);
        btnIniciarDificultadMayor.setDisable(true);
        
        //para que no se pueda editar el texto
        textInstrucciones.setEditable(false);
        textInstruccion.setEditable(false);
    }
       @FXML
       //Cuando el usuario marca una casilla se revisa si esta seleccionada
       //Si el check esta seleccionado las otras dos se desmarcan
       //Si se marca otra opcion se repite lo mismo.
    private void checkDificultadMenorClick(ActionEvent event)  throws IOException{
        if (checkDificultadMenor.isSelected()) {
            checkDificultadMedia.setSelected(false);
            checkDificultadMayor.setSelected(false);
            
            //solo para que habilite el que fue seleccionado en el check
            btnIniciarDificultadMenor.setDisable(false);
            btnIniciarDificultadMedia.setDisable(true);
            btnIniciarDificultadMayor.setDisable(true);
        }
    }

    @FXML
    //Cuando el usuario marca una casilla se revisa si esta seleccionada
    //Si el check esta seleccionado las otras dos se desmarcan
    //Si se marca otra opcion se repite lo mismo.
    private void checkDificultadMediaClick(ActionEvent event) throws IOException {
        if (checkDificultadMedia.isSelected()) {
            checkDificultadMenor.setSelected(false);
            checkDificultadMayor.setSelected(false);
            
            //solo para que habilite el que fue seleccionado en el check
            btnIniciarDificultadMenor.setDisable(true);
            btnIniciarDificultadMedia.setDisable(false);
            btnIniciarDificultadMayor.setDisable(true);
            
        }
    }

    @FXML
    //Cuando el usuario marca una casilla se revisa si esta seleccionada
    //Si el check esta seleccionado las otras dos se desmarcan
    //Si se marca otra opcion se repite lo mismo.
    private void checkDificultadMayorClick(ActionEvent event) throws IOException {
        if (checkDificultadMayor.isSelected()) {
            checkDificultadMenor.setSelected(false);
            checkDificultadMedia.setSelected(false);
            
            //solo para que habilite el que fue seleccionado en el check
             btnIniciarDificultadMenor.setDisable(true);
            btnIniciarDificultadMedia.setDisable(true);
            btnIniciarDificultadMayor.setDisable(false);
        }
    }

    @FXML
    private void btnIniciarDificultadMenorClick(ActionEvent event)throws IOException {
        App.setRoot("/fxml/DificultadNivelMenor");
    }

    @FXML
    private void btnIniciarDificultadMediaClick(ActionEvent event)throws IOException  {
         App.setRoot("/fxml/DificultadNivelMedio");
    }

    @FXML
    private void btnIniciarDificultadMayorClick(ActionEvent event)throws IOException  {
         App.setRoot("/fxml/DificultadNivelMayor");
    }

    @FXML
    private void btnRegresarPrincipalClick(ActionEvent event) throws IOException {
        App.setRoot("/fxml/menu");
    }
    
}
