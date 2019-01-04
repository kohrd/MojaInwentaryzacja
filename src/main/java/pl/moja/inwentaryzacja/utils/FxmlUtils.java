package pl.moja.inwentaryzacja.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class FxmlUtils {


    public static Pane fxmlLoader(String fxmlPath) {
        // class wywołanie maetody na danej klasie - miałem z tym problem przy ormLite
        FXMLLoader loader = new FXMLLoader(FxmlUtils.class.getResource(fxmlPath));
        loader.setResources(getResourceBundle());

        try {
            return loader.load();
        } catch (Exception e) {
//            e.printStackTrace();
            DialogUtils.errorDialog(e.getMessage());
        }
        return null;

    }

    public static ResourceBundle getResourceBundle() {
        return ResourceBundle.getBundle("bundles.messages");

    }


}
