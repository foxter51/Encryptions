module com.encryption.encryptions {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;
    requires org.junit.jupiter.api;


    opens com.encryption.encryptions to javafx.fxml;
    exports com.encryption.encryptions;
}