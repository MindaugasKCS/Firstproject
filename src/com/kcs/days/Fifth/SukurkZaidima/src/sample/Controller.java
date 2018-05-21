package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    @FXML
    private TextField spejimasTextField;

    @FXML
    private Label atspejaiLabel;

    @FXML
    private Label jusuNumerisLabel;


    public void speki(ActionEvent actionEvent) {
        Random random = new Random();
        int rand = random.nextInt(10) + 1;

        int resultNumb = Integer.parseInt(spejimasTextField.getText());

        if (rand == resultNumb) {
            atspejaiLabel.setText("Atspejai");
        } else {
            atspejaiLabel.setText("Bandyk dar karta");
        }
        jusuNumerisLabel.setText(String.valueOf(rand));
        spejimasTextField.setText("");

    }
}