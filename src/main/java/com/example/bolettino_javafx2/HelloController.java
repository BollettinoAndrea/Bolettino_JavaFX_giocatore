package com.example.bolettino_javafx2;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nome,gol;
    @FXML
    private CheckBox cap;


    @FXML
    protected void onHelloButtonClick() {
    }

    @FXML
    protected void agg_gio(){
        nome.setText("mmm");
        gol.setText("mmm");
    }

    @FXML
    protected void vis_gio(){
        nome.setText("mmm");
        gol.setText("mm");
    }

}