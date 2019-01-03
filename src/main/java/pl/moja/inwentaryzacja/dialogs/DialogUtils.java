package pl.moja.inwentaryzacja.dialogs;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;
import java.util.ResourceBundle;

public class DialogUtils {

    static ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");

    public static void dialogAboutApplication(){
        // okno informacyjne o aplikacji
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
        informationAlert.setTitle(bundle.getString("about.tittle"));
        informationAlert.setHeaderText(bundle.getString("about.header"));
        informationAlert.setContentText(bundle.getString("about.content"));
        informationAlert.showAndWait();

    }

    public static Optional<ButtonType> confirmationOnExit(){
        Alert confirmationOnExit = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationOnExit.setTitle(bundle.getString("exit.title"));
        confirmationOnExit.setHeaderText(bundle.getString("exit.header"));
        // okno jest z dwoma opcjami wiec musimy zajac sie zwróconą odpowiedzią
        Optional<ButtonType> doYouReallyWantToExit = confirmationOnExit.showAndWait();
        return doYouReallyWantToExit;

    }


}
