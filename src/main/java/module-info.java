module com.example.fabin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fabin to javafx.fxml;
    exports com.example.fabin;
}