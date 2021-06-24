module com.brandongartner.music.manager.handler {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.brandongartner.music.manager.handler to javafx.fxml;
    exports com.brandongartner.musicManagerHandler;
}
