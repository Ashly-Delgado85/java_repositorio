module com.mycompany.proyecto_1.ashlydelgado {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.proyecto_1.ashlydelgado to javafx.fxml;
    opens controllers to javafx.fxml;
    exports com.mycompany.proyecto_1.ashlydelgado;
}
