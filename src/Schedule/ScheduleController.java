package Schedule;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ScheduleController {

    @FXML
    private Button cancelButton;

    @FXML
    private Button rescheduleButton;

    @FXML
    private Label x;

    @FXML
    void cancelButtonPressed(ActionEvent event) {

    }

    @FXML
    void handleButtonAction(MouseEvent event) {System.exit(0);

    }

    @FXML
    void rescheduleButtonPressed(ActionEvent event) {

    }

}
