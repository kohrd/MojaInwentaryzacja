package pl.moja.inwentaryzacja.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TopMenuButtonsController {

    private MainController mainController; // referencja do maincontrollera tak zeby topMenuButtons mógł wpływac na mainBorderPane



    @FXML
    public void openLibrary(){
        System.out.println("open library");

    }
    @FXML
    public void openListBooks(){
        System.out.println("openListBooks");

    }

    @FXML
    public void openStatistics(){
        System.out.println("openStatiffstics");

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
