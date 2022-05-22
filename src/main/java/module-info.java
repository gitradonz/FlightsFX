module com.example.flightsfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.flightsfx to javafx.fxml;
    exports com.example.flightsfx;
}