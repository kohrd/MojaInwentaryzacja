package pl.moja.inwentaryzacja.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Locale;
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
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(fxmlPath));

        Locale.setDefault(new Locale("en")); // ustawianei jezyka dla bundless na odpowiedni
        ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");
        loader.setResources(bundle);

        Parent parent = null;
        try {
            parent = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        borderPane.setCenter(parent);

    }

}
