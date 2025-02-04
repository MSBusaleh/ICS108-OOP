module com.example.labproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labproject to javafx.fxml;
    exports com.example.labproject;
}