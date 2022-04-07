package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Scene1Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button switchToScene2;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void switchToScene2(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        Scene2Controller cont2 = new Scene2Controller();
        cont2.setPupilId("GetTHIS");
        stage.show();

    }



    @FXML
    void initialize() {
    }
}
