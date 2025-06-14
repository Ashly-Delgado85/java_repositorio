/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import Modelos.Juego;
import Modelos.Sonido;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Ashly
 */
public class IniciarJuego implements Initializable {

    @FXML
    private Button btnInicarTiempo;
    @FXML
    private Label labelTiempo;
    @FXML
    private Button btn110;
    @FXML
    private Button btn200;
    @FXML
    private TextField textNombreJugador1;
    @FXML
    private TextField textNombreJugador2;
    @FXML
    private Button btn121;
    @FXML
    private Button btn170;
    @FXML
    private Button btn150;
    @FXML
    private Button btn140;
    @FXML
    private Button btn130;
    @FXML
    private Button btn114;
    @FXML
    private Button btn113;
    @FXML
    private Button btn112;
    @FXML
    private Button btn111;
    @FXML
    private Button btn120;
    @FXML
    private Button btn123;
    @FXML
    private Button btn117;
    @FXML
    private Button btn122;
    @FXML
    private Button btn133;
    @FXML
    private Button btn127;
    @FXML
    private Button btn124;
    @FXML
    private Button btn132;
    @FXML
    private Button btn131;
    @FXML
    private Button btn141;
    @FXML
    private Button btn134;
    @FXML
    private Button btn147;
    @FXML
    private Button btn143;
    @FXML
    private Button btn142;
    @FXML
    private Button btn157;
    @FXML
    private Button btn153;
    @FXML
    private Button btn152;
    @FXML
    private Button btn151;
    @FXML
    private Button btn173;
    @FXML
    private Button btn172;
    @FXML
    private Button btn171;
    @FXML
    private Button btn177;
    @FXML
    private Button btn115;
    @FXML
    private Button btn116;
    @FXML
    private Button btn125;
    @FXML
    private Button btn145;
    @FXML
    private Button btn135;
    @FXML
    private Button btn160;
    @FXML
    private Button btn161;
    @FXML
    private Button btn162;
    @FXML
    private Button btn180;
    @FXML
    private Button btn146;
    @FXML
    private Button btn163;
    @FXML
    private Button btn155;
    @FXML
    private Button btn164;
    @FXML
    private Button btn181;
    @FXML
    private Button btn126;
    @FXML
    private Button btn137;
    @FXML
    private Button btn156;
    @FXML
    private Button btn165;
    @FXML
    private Button btn167;
    @FXML
    private Button btn176;
    @FXML
    private Button btn166;
    @FXML
    private Button btn182;
    @FXML
    private Button btn174;
    @FXML
    private Button btn175;
    @FXML
    private Button btn184;
    @FXML
    private Button btn183;
    @FXML
    private Button btn185;
    @FXML
    private Button btn186;
    @FXML
    private Button btn187;
    @FXML
    private Button btn136;
    @FXML
    private Button btn107;
    @FXML
    private Button btn106;
    @FXML
    private Button btn102;
    @FXML
    private Button btn101;
    @FXML
    private Button btn100;
    @FXML
    private Button btn105;
    @FXML
    private Button btn104;
    @FXML
    private Button btn103;
    @FXML
    private Button btn221;
    @FXML
    private Button btn270;
    @FXML
    private Button btn250;
    @FXML
    private Button btn240;
    @FXML
    private Button btn230;
    @FXML
    private Button btn214;
    @FXML
    private Button btn213;
    @FXML
    private Button btn212;
    @FXML
    private Button btn211;
    @FXML
    private Button btn220;
    @FXML
    private Button btn223;
    @FXML
    private Button btn217;
    @FXML
    private Button btn222;
    @FXML
    private Button btn233;
    @FXML
    private Button btn227;
    @FXML
    private Button btn224;
    @FXML
    private Button btn232;
    @FXML
    private Button btn231;
    @FXML
    private Button btn241;
    @FXML
    private Button btn234;
    @FXML
    private Button btn247;
    @FXML
    private Button btn244;
    @FXML
    private Button btn243;
    @FXML
    private Button btn242;
    @FXML
    private Button btn257;
    @FXML
    private Button btn254;
    @FXML
    private Button btn253;
    @FXML
    private Button btn252;
    @FXML
    private Button btn251;
    @FXML
    private Button btn273;
    @FXML
    private Button btn272;
    @FXML
    private Button btn271;
    @FXML
    private Button btn277;
    @FXML
    private Button btn210;
    @FXML
    private Button btn215;
    @FXML
    private Button btn216;
    @FXML
    private Button btn225;
    @FXML
    private Button btn245;
    @FXML
    private Button btn235;
    @FXML
    private Button btn260;
    @FXML
    private Button btn261;
    @FXML
    private Button btn262;
    @FXML
    private Button btn280;
    @FXML
    private Button btn246;
    @FXML
    private Button btn263;
    @FXML
    private Button btn255;
    @FXML
    private Button btn264;
    @FXML
    private Button btn281;
    @FXML
    private Button btn226;
    @FXML
    private Button btn237;
    @FXML
    private Button btn256;
    @FXML
    private Button btn265;
    @FXML
    private Button btn267;
    @FXML
    private Button btn276;
    @FXML
    private Button btn266;
    @FXML
    private Button btn282;
    @FXML
    private Button btn274;
    @FXML
    private Button btn275;
    @FXML
    private Button btn284;
    @FXML
    private Button btn283;
    @FXML
    private Button btn285;
    @FXML
    private Button btn286;
    @FXML
    private Button btn287;
    @FXML
    private Button btn236;
    @FXML
    private Button btn207;
    @FXML
    private Button btn206;
    @FXML
    private Button btn202;
    @FXML
    private Button btn201;
    @FXML
    private Button btn205;
    @FXML
    private Button btn204;
    @FXML
    private Button btn203;
    @FXML
    private Button btn154;
    @FXML
    private Button btn144;
    @FXML
    private GridPane gridPanel1;
    @FXML
    private GridPane gridPanel2;
    @FXML
    private RadioButton checkJugadorVSjugador;
    @FXML
    private RadioButton checkJugadorVScompu;
    @FXML
    private CheckBox checkDificultadMenor;
    @FXML
    private CheckBox checkDificultadMedia;
    @FXML
    private CheckBox checkDificultadMayor;
    
    private int tiempoRestante = 0; //tiempo del juego
    private int nivel; //nivel del juego 1,2,3
    Juego juego; //objeto tipo juego
    boolean JuegoActivo= false; //estado del juego
    boolean juegaLaComputadora = false; //estado del jugador computadora
    int tiroGracia = 0; //tiro de gracia cuando hay un ganador
    int turnoJuego = 1; // juega jugador 1, 2 va jugador 2
    boolean juegoNuevo = true; //estado del juego cuando se vuelve a jugar
    
    private Timeline timeline;
    @FXML
    private TextField textEstado1Barco;
    @FXML
    private TextField textEstado2Barco;
    @FXML
    private TextArea textIniciaJuego;
    @FXML
    private TextArea textImagenes;
    @FXML
    private TextField textTiempo;
    @FXML
    private Label labelIniciar;
    @FXML
    private RadioButton rdbVerTablero1;
    @FXML
    private RadioButton rdbVerTablero2;
    @FXML
    private Button btnSalirDelJuego;
  
    Sonido sound = new Sonido(); //sonido
    Sonido fondoMusical = new Sonido(); // sonido del juego en loop
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Al inicio, ninguna dificultad está seleccionada
        checkDificultadMenor.setSelected(false);
        checkDificultadMedia.setSelected(false);
        checkDificultadMayor.setSelected(false);
        textIniciaJuego.setEditable(false);//no editar
        textImagenes.setEditable(false);//no editar
        textTiempo.setEditable(false);//no editar
        textEstado1Barco.setEditable(false);//no editar
        textEstado2Barco.setEditable(false);//no editar
        btnInicarTiempo.setVisible(true);//oculta el botón de iniciar
        sonidoJuego();
    } 
    
    @FXML
    //funcion del boton de dar inicio al juego
    private void btnIniciarJuego(ActionEvent event) {
        sonidoClick();
        String nombreJugador1 = textNombreJugador1.getText().trim(); //obtiene el nombre del jugagor1
        String nombreJugador2 = textNombreJugador2.getText().trim();//obtiene el nombre del jugagor2
        JuegoActivo = true;
        
        //Validación de no iniciar hasta que se hayan colocado los nombres de los jugadores 
        if (checkJugadorVScompu.isSelected()) {
            if (nombreJugador1.isEmpty()) {
                mostrarMensajeExtras("Debe ingresar su nombre para jugar contra la computadora.");
                return;
            }
            juegaLaComputadora = false;
        } else {
            if (nombreJugador1.isEmpty() || nombreJugador2.isEmpty()) {
                mostrarMensajeExtras("Debe ingresar los nombres de ambos jugadores antes de iniciar.");
                return;
            }
        }
        
        // Validación de dificultad
        if (!(checkDificultadMenor.isSelected() || checkDificultadMedia.isSelected() || checkDificultadMayor.isSelected())) {
            mostrarMensajeExtras("Debe seleccionar una dificultad para comenzar el juego.");
            return;
        }

        sonidoJuego();
        iniciarCronometro();
        labelIniciar.setVisible(false);
        btnInicarTiempo.setVisible(false);
        //creación de un objeto Juego con los datos ingresados
        if(juegoNuevo){
            juego = new Juego(nivel,nombreJugador1,nombreJugador2);
            int[][] matriz = juego.getJugador1().getMatrizDelJuego();//obitene la matriz del jugador1     
        }else{
            juego.getJugador1().reiniciarJuego("", 0);
            juego.getJugador2().reiniciarJuego("", 0);
        }
    
        agregarEventosBoton(gridPanel2,2);// se habilita poder disparar jugador 1
        if(checkJugadorVScompu.isSelected()){
            juegaLaComputadora = true;
        }else{
            juegaLaComputadora = false;
            agregarEventosBoton(gridPanel1,1);// se habilita poder disparar jugador 2
        }
    }
    
    
    // El jugador 2 dispara con la funcion disparar 1 que sería al grid 1
    private void disparar1(int fila, int columna,GridPane gridPane) {
        if(JuegoActivo){//verifica si el juego esta activo
            if(turnoJuego == 2 && JuegoActivo){ //verifica si es el turno del jugador 2 y si el juego esta activo
                //Define los estilos visuales para un impacto (explosivo) y para un fallo (agua)
                String asignarExplosivo = "explosivo" ; 
                String asignarAgua ="aguaMar"; 
                //Busca el botón específico que representa la celda [fila][columna] en el tablero del Jugador 1
                //Ejemplo: "btn234" sería fila 3, columna 4 del tablero 1
                for (Node node : gridPane.getChildren()) {
                    if(node.getId().contains("btn"+"1"+fila+columna)){
                        // Verifica que esa celda no haya sido atacada aún (porque los valores atacados se hacen negativos)
                        if((juego.getJugador1().devolverValor(fila, columna)>=0)){
                            
                         // Estilo cambia a explosivo. Se reproduce el sonido.Se marca la celda como impactada (multiplica por -1).Se actualiza el texto de estado. Se verifica si se activa "tiro de gracia"
                            if(juego.getJugador1().devolverValor(fila, columna)!=0){
                                node.setStyle(estiloButton(asignarExplosivo));
                                sonidoExplosivo();
                                //si la casilla esta atacada 
                                juego.getJugador1().atacar(fila, columna,0);
                                textEstado1Barco.setText(juego.getJugador1().estadoDelBarco(fila, columna));
                                revisaTiroGracia();
                                //Si ya no quedan barcos flotando del Jugador 1, se activa el "tiro de gracia" para el Jugador 1 en su próximo turno
                                if(juego.botesFloteJugador1()==0 && JuegoActivo){
                                    mostrarMensajeExtras("Jugadaro 2 ha derrotado todos tus naves, tienes un tiro de gracia");
                                    tiroGracia = 1;
                                    turnoJuego = 1;
                                }
                            }else{
                                //si cae en casilla se agua  Cambia estilo a "agua".Marca la celda como atacada con valor -2. Texto indica "AGUA".Reproduce sonido de agua. Pasa el turno al Jugador 1
                                node.setStyle(estiloButton(asignarAgua));
                                juego.getJugador1().atacar(fila, columna,1);
                                textEstado1Barco.setText("AGUA");
                                sonidoAgua();
                                turnoJuego = 1;
                                revisaTiroGracia();
                            }
                        }else{
                            //si fue una casilla ya atacada
                            mostrarMensaje("casilla ya atacada");
                        }
                    }
                }
            }else{
                //si no es turno del jugador 2 
                mostrarMensaje("El jugador 1 debe disparar en el tablero del rival");
            }
        }else{
            //si el juego esta inactivo
            mostrarMensaje("Juego no activo");
        }
    }
    
    //funcion de revisar el tiro de gracia 
    public void revisaTiroGracia(){
        if(tiroGracia > 0){
            tiroGracia = 0;
            JuegoActivo = false;
            revisarJuego();
        }
    }
    
    // El jugador 1 dispara con la funcion disparar 2 que sería al grid 2
    private void disparar2(int fila, int columna,GridPane gridPane) {
        if(JuegoActivo){//verifica si el juego esta activo
            if(turnoJuego == 1){//Verifica que sea turno del Jugador 1
                // //Define los estilos visuales para un impacto (explosivo) y para un fallo (agua)
                String asignarExplosivo = "explosivo" ;
                String asignarAgua ="aguaMar";
                
                //busca el gridpane del jugador 2 el btn la celda [fila][columna] en el tablero del Jugador 2
                //Ejemplo: "btn234" sería fila 3, columna 4 del tablero 2
                for (Node node : gridPane.getChildren()) {
                    if(node.getId().contains("btn"+"2"+fila+columna)){
                         // Verifica que esa celda no haya sido atacada aún (porque los valores atacados se hacen negativos)
                        if((juego.getJugador2().devolverValor(fila, columna)>=0)){
                            // // Estilo cambia a explosivo. Se reproduce el sonido.Se marca la celda como impactada (multiplica por -1).Se actualiza el texto de estado. Se verifica si se activa "tiro de gracia"
                            if(juego.getJugador2().devolverValor(fila, columna)!=0){
                                node.setStyle(estiloButton(asignarExplosivo));
                                 sonidoExplosivo();
                                juego.getJugador2().atacar(fila, columna,0);
                                textEstado2Barco.setText(juego.getJugador2().estadoDelBarco(fila, columna));
                                revisaTiroGracia();
                               
                                // //Si ya no quedan barcos flotando del Jugador 1, se activa el "tiro de gracia" para el Jugador 1 en su próximo turno
                                if(juego.botesFloteJugador2()==0 && JuegoActivo){
                                    mostrarMensajeExtras("Jugadaro 1 ha derrotado todos tus naves, tienes un tiro de gracia");
                                    tiroGracia = 1;
                                    turnoJuego = 2;
                                }
                            }else{
                                 //si cae en casilla se agua  Cambia estilo a "agua".Marca la celda como atacada con valor -2. Texto indica "AGUA".Reproduce sonido de agua. Pasa el turno al Jugador 1
                                node.setStyle(estiloButton(asignarAgua));
                                juego.getJugador2().atacar(fila, columna,1);
                                textEstado2Barco.setText("AGUA");
                                sonidoAgua();
                                turnoJuego = 2;
                                revisaTiroGracia();
                            }
                        }else{
                            //si la casilla ya fue atacada
                            mostrarMensaje("Casilla ya atacada");
                        }
                    }
                }
            }else{
                //si no corresponde el turno del jugador indicado
                mostrarMensaje("El jugador 2 debe disparar en el tablero del rival");
            }
            //en caso de que este jugando con la computadora
            if(juegaLaComputadora && turnoJuego == 2){
                juegoAutomatico();
            } 
        }else{
            //si el juego esta inactivo
            mostrarMensaje("Juego no activo");
        }
    }
    
    //funcion de juego automatico para cuando juega jugador vs computadora
    //dispara en el tablero del jugador 1
    //selecciona una casilla aleatoriamente tomando todo el tamaño del tablero 9x8
    public void juegoAutomatico(){
        boolean repite = true;
        while(repite){
            int fila = (int) (Math.random() * 9);
            int columna = (int) (Math.random() * 8);
            if((juego.getJugador1().devolverValor(fila, columna)<0)){
                repite= true;
            }else{
                if(juego.getJugador1().devolverValor(fila, columna)==0){
                    disparar1(fila, columna,gridPanel1);
                    repite= false;
                }else{
                    disparar1(fila, columna,gridPanel1);
                    repite= true;
                }
            }
        }
    }
    
    //funcion de iniciar tiempo
    public void iniciarCronometro() {
        sonidoClick();
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), (ActionEvent event) -> {
            tiempoRestante--; //se decrece en 1s
            labelTiempo.setText("Tiempo: " + tiempoRestante + "s"); //se va actualizando el tiempo
            if (tiempoRestante <= 0) {
                timeline.stop(); //se detiene el tiempo a llegar a cero
                labelTiempo.setText("SE ACABÓ EL TIEMPO");//si se acabo el tiempo 
            }
            Platform.runLater(() -> {
                if(tiempoRestante <=0 && labelTiempo.getText()=="SE ACABÓ EL TIEMPO" && JuegoActivo){
                   revisarJuego(); 
                }
            });
        }));
        timeline.setCycleCount(Timeline.INDEFINITE); // Se ejecuta indefinidamente
        timeline.play(); // Iniciar cronómetro
        
    }
    
    //funcion de revisarJuego, para el ganador, empate, lo verifica con la funcion de botes a flote 
    private void revisarJuego() {
        fondoMusical.parar();
        String mensaje;
        String titulo;  
       
        if(juego.botesFloteJugador1() == juego.botesFloteJugador2()){
            mensaje = "¡Es un empate!";
            titulo = "Empate 🤝";
        }else if(juego.botesFloteJugador1() > juego.botesFloteJugador2()) {
            mensaje = "¡Ganó el Jugador 1!" + textNombreJugador1.getText();
            titulo = "¡Victoria! 🏆";
        } else {
            mensaje = "¡Ganó el Jugador 2!" + textNombreJugador2.getText();
            titulo = "¡Victoria! 🏆";
        }
       mostrarPantallaGanador(titulo, mensaje); 
    }

    //funcion de mostrar pantalla cuando hay un ganador
    private void mostrarPantallaGanador(String titulo, String mensaje) {
        JuegoActivo = false;
        juegoNuevo = false;
        fondoMusical.parar();
        sonidoVictoria();

        Alert alertaFinal = new Alert(Alert.AlertType.INFORMATION);
        alertaFinal.setTitle(titulo);
        alertaFinal.setHeaderText(null);
        alertaFinal.setContentText(mensaje + "\n\n¿Quieres jugar otra vez?");

        ButtonType btnReiniciar = new ButtonType("Reiniciar 🔄");
        ButtonType btnSalir = new ButtonType("Salir ❌");
        alertaFinal.getButtonTypes().setAll(btnReiniciar, btnSalir);

        Optional<ButtonType> resultado = alertaFinal.showAndWait();

        if (resultado.isPresent() && resultado.get() == btnReiniciar) {
            reiniciarJuego(); 
        }else{
            Platform.exit(); 
        } 
    }

    //funcion de reiniciar el juego 
    private void reiniciarJuego() {
        JuegoActivo = false;
        turnoJuego = 1;
        tiroGracia = 0;
        tiempoRestante = 0;
        labelTiempo.setText("Tiempo: ");
        textEstado1Barco.setText("");
        textEstado2Barco.setText("");

        juego.getJugador1().asignarMatriz0();
        juego.getJugador2().asignarMatriz0();

        ocultarTablero(gridPanel1, juego.getJugador1().getMatrizDelJuego(), 1);
        ocultarTablero(gridPanel2, juego.getJugador2().getMatrizDelJuego(), 2);
        btnInicarTiempo.setVisible(true);
        labelIniciar.setVisible(true);
        fondoMusical.sonar();
        checkDificultadMenor.setSelected(false);
        checkDificultadMedia.setSelected(false);
        checkDificultadMayor.setSelected(false);
        checkJugadorVSjugador.setSelected(false);
        checkJugadorVScompu.setSelected(false);
        rdbVerTablero1.setSelected(false);
        rdbVerTablero2.setSelected(false);
        textNombreJugador1.setText("");
        textNombreJugador2.setText("");
    }

    @FXML
    private void clickcheckJugadorVSjugador(ActionEvent event) {
        sonidoClick();
        if (checkJugadorVSjugador.isSelected()) {
            // Desmarcar el otro tipo de juego
            checkJugadorVScompu.setSelected(false);
            // Mostrar campos de texto para ambos jugadores
            textNombreJugador1.setVisible(true);
            textNombreJugador1.setEditable(true);
            textNombreJugador2.setVisible(true);
            textNombreJugador2.setEditable(true);
            textNombreJugador2.setText(""); // Limpiar el nombre del segundo jugador
        }
    }

    @FXML
    private void clickcheckJugadorVScompu(ActionEvent event) {
        sonidoClick();
        if (checkJugadorVScompu.isSelected()) {
        // Desmarcar el otro tipo de juego
        checkJugadorVSjugador.setSelected(false);
        // Mostrar campos de texto para un jugador y poner "Computadora" para el segundo
        textNombreJugador1.setVisible(true);
        textNombreJugador1.setEditable(true);
        textNombreJugador2.setVisible(true);
        textNombreJugador2.setText("Computadora");
        textNombreJugador2.setEditable(false); // No editable para la computadora
        }
    }

    @FXML
    private void checkDificultadMenorClick(ActionEvent event) {
        sonidoClick();
        if (checkDificultadMenor.isSelected()) {
            checkDificultadMedia.setSelected(false);
            checkDificultadMayor.setSelected(false);
        }
        tiempoRestante = 180; //tiempo establecido para dificultad menor
        nivel = 1; //nivel de dificultad
    }

    @FXML
    private void checkDificultadMediaClick(ActionEvent event) {
         sonidoClick();
        if (checkDificultadMedia.isSelected()) {
            checkDificultadMenor.setSelected(false);
            checkDificultadMayor.setSelected(false);
        }
        tiempoRestante = 120;
        nivel = 2;
    }

    @FXML
    private void checkDificultadMayorClick(ActionEvent event) {
        sonidoClick();
        if (checkDificultadMayor.isSelected()) {
            checkDificultadMenor.setSelected(false);
            checkDificultadMedia.setSelected(false);
        }
        tiempoRestante = 20;
        nivel = 3;
    }
    
    //funcion de ocultar el tablero
    //ocultarTablero reinicia el estilo de los botones del GridPane, solo en las casillas no atacadas aún del jugador indicado.
    private void ocultarTablero(GridPane gridPane, int[][] matriz,int jugador){
        String posicionFila;
        String posicionColumnas;
        int fila;
        int columna;
        for (Node node : gridPane.getChildren()) {
            if(node.getId().contains("btn")){
                posicionFila = node.getId().substring(4, 5);
                posicionColumnas = node.getId().substring(5, 6);
                fila = Integer.parseInt(posicionFila);
                columna = Integer.parseInt(posicionColumnas);
                if(jugador==1){
                   if((juego.getJugador1().devolverValor(fila, columna)>=0)){
                        node.setStyle("");   
                    }  
                }else{
                    if((juego.getJugador2().devolverValor(fila, columna)>=0)){
                        node.setStyle("");   
                    } 
                }
            }
        }
    }
   
    @FXML
    //funcion para el tablero del jugador 1 
    private void btnTablero1Click(ActionEvent event) {
         sonidoClick();
        if(JuegoActivo){
            if(rdbVerTablero1.isSelected()){
                pintarBarcosJuego(gridPanel1,juego.getJugador1().getMatrizDelJuego());
            }else{
                ocultarTablero(gridPanel1,juego.getJugador1().getMatrizDelJuego(),1);
            }
        } 
    }
    
    @FXML
     //funcion del boton de salir
    private void btnClickSalirDelJuego(ActionEvent event) {
        sonidoClick();
        Platform.exit();
    }
    
    @FXML
    //funcion para el tablero del jugador 2
    private void btnTablero2Click(ActionEvent event) {
        sonidoClick();
        if(JuegoActivo){
            if(rdbVerTablero2.isSelected()){
                pintarBarcosJuego(gridPanel2,juego.getJugador2().getMatrizDelJuego());
            }else{
                ocultarTablero(gridPanel2,juego.getJugador2().getMatrizDelJuego(),2);
            }
        }
    }

    //define las imagenenes de los barcos
    //funcion que pinta los barcos en los tableros por medio el gridpane
    private void pintarBarcosJuego(GridPane gridPane, int[][] matriz) {
        String submarino = "submarino-part1" ;
        String destructor1 = "destructor-part1" ;
        String destructor2 = "destructor-part2" ;
        String destructor1Vertical = "destructor2-part1" ;
        String destructor2Vertical = "destructor2-part2" ;
        String crucero1 = "crucero-part1" ;
        String crucero2 = "crucero-part2" ;
        String crucero3 = "crucero-part3" ;
        String crucero1Vertical = "crucero2-part1" ;
        String crucero2Vertical = "crucero2-part2" ;
        String crucero3Vertical = "crucero2-part3" ;
        String explosivo ="explosivo" ;
        String acorazado1 ="acorazado-part1";                     
        String acorazado2 ="acorazado-part2"; 
        String acorazado3 = "acorazado-part3"; 
        String acorazado4 = "acorazado-part4";
        String acorazado1Vertical ="acorazado2-part1";
        String acorazado2Vertical ="acorazado2-part2"; 
        String acorazado3Vertical = "acorazado2-part3" ;
        String acorazado4Vertical ="acorazado2-part4";
        String aguaMar ="aguaMar";
        
        String posicionFila;
        String posicionColumnas;
        int fila;
        int columna;
         // Iteración sobre todos los nodos (botones) dentro del GridPane
        for (Node node : gridPane.getChildren()) {
            if(node.getId().contains("btn")){ // Solo los nodos que son botones (con id que contienen "btn")
                posicionFila = node.getId().substring(4, 5);
                posicionColumnas = node.getId().substring(5, 6);
                fila = Integer.parseInt(posicionFila);
                columna = Integer.parseInt(posicionColumnas);
                if(matriz[fila][columna]<0){
                    if(matriz[fila][columna]==-2){
                      node.setStyle(estiloButton(aguaMar));     
                    }
                    if(matriz[fila][columna]==-1){
                      node.setStyle(estiloButton(explosivo));     
                    }
                    if(matriz[fila][columna]<-3){
                      node.setStyle(estiloButton(explosivo));     
                    }
                }else{
                    switch(matriz[fila][columna]){
                        case 1:
                            node.setStyle(estiloButton(submarino));
                        break;
                        case 21:
                            node.setStyle(estiloButton(destructor1));
                        break;
                        case 22:
                            node.setStyle(estiloButton(destructor2));
                        break;
                        case 25:
                            node.setStyle(estiloButton(destructor1Vertical));
                        break;
                        case 26:
                            node.setStyle(estiloButton(destructor2Vertical));
                        break;
                        case 31:
                            node.setStyle(estiloButton(crucero1));
                        break;
                        case 32:
                            node.setStyle(estiloButton(crucero2));
                        break;
                        case 33:
                            node.setStyle(estiloButton(crucero3));
                        break;
                        case 35:
                            node.setStyle(estiloButton(crucero1Vertical));
                        break;
                        case 36:
                            node.setStyle(estiloButton(crucero2Vertical));
                        break;
                        case 37:
                            node.setStyle(estiloButton(crucero3Vertical));
                        break;
                        case 41:
                            node.setStyle(estiloButton(acorazado1));
                        break;
                        case 42:
                            node.setStyle(estiloButton(acorazado2));
                        break;
                        case 43:
                            node.setStyle(estiloButton(acorazado3));
                        break;
                        case 44:
                            node.setStyle(estiloButton(acorazado4));
                        break;
                        case 45:
                            node.setStyle(estiloButton(acorazado1Vertical));
                        break;
                        case 46:
                            node.setStyle(estiloButton(acorazado2Vertical));
                        break;
                        case 47:
                            node.setStyle(estiloButton(acorazado3Vertical));
                        break;
                        case 48:
                            node.setStyle(estiloButton(acorazado4Vertical));
                        break;
                    }
                }
            }
        }
    }
    
    //funciones para el sonido del juego
    private void sonidoClick(){
        sound.cargarSonido("/sonidos/click.wav",false);
        sound.sonar();
    }
    
    private void sonidoExplosivo(){
        sound.cargarSonido("/sonidos/explosivo_1.wav",false);
        sound.sonar();
    }
     
    private void sonidoAgua(){
        sound.cargarSonido("/sonidos/sonidoAgua.wav",false);
        sound.sonar();
    }
        private void sonidoJuego(){
        fondoMusical.cargarSonido("/sonidos/sonido-principal.wav",true);
        fondoMusical.sonar();
    }
    
      private void sonidoVictoria(){
        sound.cargarSonido("/sonidos/victoria.wav",false);
        sound.sonar();
    }
    
    //funcion de mostrar mensajes extras 
    public void mostrarMensajeExtras(String mensaje){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(null);
        alert.setHeaderText(null); 
        alert.setContentText(mensaje); 
        alert.showAndWait();
    }

    //funcion de mostar mensaje de advertencia
    public void mostrarMensaje(String mensaje) { 
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Problema...");
        alert.setHeaderText("Disparo no valido");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
    
    //funcion de el estilo de botones para las imagenes por partes 
    private String estiloButton(String nombre){
        return "-fx-background-image: url(\"/ImagenesPartes/" + nombre + ".png\"); "
        + "-fx-background-repeat: no-repeat; "
        + "-fx-background-position: center center; "
        + "-fx-background-size: 90% 90%"; 
    }
    
    //funcion del evento de disparar en los tableros
    private void agregarEventosBoton(GridPane gridPane,int jugador) {
        String posicionFila;
        String posicionColumnas;
        for (Node node : gridPane.getChildren()) {//recorre todoslos nodos hijos del gridpane (botones)
            if(node.getId().contains("btn")){ //Esta condición verifica si el ID del nodo contiene la palabra "btn"
                posicionFila = node.getId().substring(4, 5);//toma el caracter de la posicion 4 y luego 5
                posicionColumnas = node.getId().substring(5, 6);//toma el caracter de la posicion 5 y luego 6
                //hace un conversicion
                int fila = Integer.parseInt(posicionFila);
                int columna = Integer.parseInt(posicionColumnas);
                if (jugador==1) {
                    node.setOnMouseClicked(e -> disparar1(fila,columna,gridPane));
                }else{
                    node.setOnMouseClicked(e -> disparar2(fila,columna,gridPane));
                }
                //Según el número del jugador, asigna la función disparar1 o disparar2.
            }
        }
    }
}