package com.example.flightsfx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField textF1;

    @FXML
    private ListView listView;

    public void rellenaLista(){
        listView.getItems().addAll("House", "Car", "Speaker", "Computer",null);
        listView.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> obs,
                                        String oldValue, String newValue) {
                        if (newValue != null) {
                            welcomeText.setText("You have selected: " + newValue);
                        } else {
                            welcomeText.setText("Nothing is selected");
                        }
                    }
                }
        );
    }

    public void initialize() {
        textF1.setOnKeyTyped(e -> welcomeText.setText(textF1.getText()));
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}