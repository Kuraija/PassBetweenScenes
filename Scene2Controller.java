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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene2Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button switchToScene1;

    @FXML
    private TextField myTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;
    public Object comeOn2;
    public String getInfo;
    public Pupil pupilId;

    @FXML
    void switchToScene1(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {

    }

    void setPupilId (String a) {
        System.out.println("in setPupilId (String a)");
        pupilId.setName(a);
        System.out.println("did setPupilId (String a)");
    }
}
