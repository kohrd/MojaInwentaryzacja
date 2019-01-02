package pl.moja.inwentaryzacja.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class MainController {

    @FXML
    private TopMenuButtonsController topMenuButtonsController; // wstrzykniecie kontrollera topMenuButtons

    @FXML
    private BorderPane borderPane;

    @FXML
    private void initialize(){
        topMenuButtonsController.setMainController(this); // przekazujemy referencje do topMenuButtonsController


    }
}
