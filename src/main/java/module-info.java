module Cometa {
    requires javafx.controls;
    requires javafx.fxml;

    opens PaqueteLibrerias to javafx.fxml, javafx.controls,javafx.graphics;
}