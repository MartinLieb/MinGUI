package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class Controller {


    @FXML
    public TextField label;
    public TextArea outputText;

    String s;



    public void sendCommand(ActionEvent actionEvent) {

        this.s = label.getText();

        outputText.setText(outputText.getText() + this.s + "\n");

        label.clear();



    }


}
