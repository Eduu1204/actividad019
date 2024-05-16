module com.example.actividad019 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.actividad019 to javafx.fxml;
    exports com.example.actividad019;
}