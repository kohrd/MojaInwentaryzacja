package pl.moja.inwentaryzacja.controllers;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.moja.inwentaryzacja.utils.DialogUtils;
import pl.moja.inwentaryzacja.utils.FxmlUtils;

import java.io.IOException;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainController {

    @FXML
    private TopMenuButtonsController topMenuButtonsController; // wstrzykniecie kontrollera topMenuButtons

    @FXML
    private BorderPane borderPane; // główny borderPane formtaki main , do niego wkładamy inne formatki

    @FXML
    private void initialize() {
        topMenuButtonsController.setMainController(this); // przekazujemy referencje do topMenuButtonsController


    }


    public void setCenter(String fxmlPath) {

        borderPane.setCenter(FxmlUtils.fxmlLoader(fxmlPath));

    }

    public void closeApplication() {
        Optional<ButtonType> doYouReallyWantToExit = DialogUtils.confirmationOnExit();
        // sprawdzamy jak rpzycisk został naciśnięty
        // obsługujemy tylko przycisk ok
        if (doYouReallyWantToExit.get() == ButtonType.OK){
            Platform.exit();
            System.exit(0);
        }
    }

    public void setCaspian() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);
    }

    public void setModena() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_MODENA);
    }

    public void setAlwaysOnTop(ActionEvent actionEvent) {
        // jak dostac sie do stage z MainController?
        // stage jest dostepny w metodzie Main
        // mozemy to zrobic przez wstrzyknięty borderPane
        //??
        Stage stage = (Stage) borderPane.getScene().getWindow();
        boolean isAlwaysOnTopSelected = ((CheckMenuItem) actionEvent.getSource()).selectedProperty().get(); // sprawdzamy źródło actioneventa i rzutujemy je na CheckMenuItem
        stage.setAlwaysOnTop(isAlwaysOnTopSelected);


    }

    public void about() {
        DialogUtils.dialogAboutApplication();
    }
}
