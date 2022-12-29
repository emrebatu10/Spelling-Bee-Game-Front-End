package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Spelling Bee");
        Scene newSceen = new Scene(new GameBoard(),1000,500);

        primaryStage.setScene(newSceen);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
