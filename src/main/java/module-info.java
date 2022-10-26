module com.example.parcialparctico {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.parcialpractico to javafx.fxml;
    exports com.example.parcialpractico;
}