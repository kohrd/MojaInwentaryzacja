package pl.moja.inwentaryzacja;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.moja.inwentaryzacja.utils.FxmlUtils;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {


    public static final String FXML_BORDER_PANE_MAIN_FXML = "/fxml/BorderPaneMain.fxml";

    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage primaryStage) throws Exception {

        Pane borderPane = FxmlUtils.fxmlLoader(FXML_BORDER_PANE_MAIN_FXML);
        Locale.setDefault(new Locale("en")); // ustawianei jezyka dla bundless na odpowiedni

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle(FxmlUtils.getResourceBundle().getString("title.application")); //ustawianie tytutłu aplikacji za pmocą bundles
        primaryStage.show();

    }
}
