import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class javafxMain extends Application {

    public static void main(String args[]){
        launch(args);
    }

    //Gebruik scenebuilder om het simpeler te maken in de toekomst
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JAVAFX");
        primaryStage.setHeight(500);
        primaryStage.setWidth(300);
        VBox pane = new VBox();
        Scene s = new Scene(pane);

        Button knop = new Button("KLIK");
        pane.getChildren().add(knop);

        primaryStage.setScene(s);
        primaryStage.show();
    }
}
