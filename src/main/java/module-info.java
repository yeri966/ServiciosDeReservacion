module co.edu.uniquindio.serviciosdereservacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.serviciosdereservacion to javafx.fxml;
    exports co.edu.uniquindio.serviciosdereservacion;
}