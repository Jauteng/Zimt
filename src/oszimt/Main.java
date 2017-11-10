package oszimt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("loginUI.fxml"));
        primaryStage.setTitle("ZIMT GmbH & Co KG. - login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.getIcons().add(new Image("/oszimt/icon128.png"));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
