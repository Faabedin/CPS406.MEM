import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.TextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.*;
import javafx.scene.control.Label;


public class MemberController {

    @FXML
    private Label label;

    @FXML
    public void initialize() {
        label.setText("member");
    }
}
