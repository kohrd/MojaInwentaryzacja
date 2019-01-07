package pl.moja.inwentaryzacja.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

    public static final String FXML_LIBRARY_FXML = "/fxml/Library.fxml";
    public static final String FXML_LIST_BOOKS_FXML = "/fxml/ListBooks.fxml";
    public static final String FXML_STATISTICS_FXML = "/fxml/Statistics.fxml";
    public static final String FXML_ADD_BOOK_FXML = "/fxml/AddBook.fxml";
    public static final String FXML_ADD_CATEGORY_FXML = "/fxml/AddCategory.fxml";


    private MainController mainController; // referencja do maincontrollera tak zeby topMenuButtons mógł wpływac na mainBorderPane

    @FXML
    private ToggleGroup toggleButtons;




    @FXML
    public void openLibrary() {
        mainController.setCenter(FXML_LIBRARY_FXML);


    }

    @FXML
    public void openListBooks() {
        mainController.setCenter(FXML_LIST_BOOKS_FXML);

    }

    @FXML
    public void openStatistics() {

        mainController.setCenter(FXML_STATISTICS_FXML);

    }

    @FXML
    public void addBook() {
        // opdznaczanie grupy toggle button jesl wybierzemy przcisk addBook
        // nie jets null tzn jest jakis przycisk z toggleGroup zaznaczony
        // najpierw musimy sprawdzic czy jest cos zaznaczoen zeby nie poleciał nullpointerexc
        resetToggleButtons();
        mainController.setCenter(FXML_ADD_BOOK_FXML);


    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void addCategory(ActionEvent actionEvent) {
        resetToggleButtons();
        mainController.setCenter(FXML_ADD_CATEGORY_FXML);
    }

    private void resetToggleButtons() {
        if (toggleButtons.getSelectedToggle() != null) {
            toggleButtons.getSelectedToggle().setSelected(false);
        }
    }
}
