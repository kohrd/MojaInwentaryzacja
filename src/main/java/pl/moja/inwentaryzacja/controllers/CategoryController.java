package pl.moja.inwentaryzacja.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import pl.moja.inwentaryzacja.modelFx.CategoryFx;


public class CategoryController {

    @FXML
    private TextField addCategoryTextField;

    @FXML
    private Button addCategoryButton;

    @FXML
    private ComboBox <CategoryFx> categoryComboBox;


    public void addCategoryOnAction() {
        System.out.println("Add category");

    }
}
