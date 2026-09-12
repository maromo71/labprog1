module net.maromo {
    requires javafx.controls;
    requires javafx.fxml;

    opens net.maromo to javafx.fxml;
    exports net.maromo;
}
