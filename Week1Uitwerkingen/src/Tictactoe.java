import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Tictactoe extends Application{
    public static void main(String args[]){
        launch(args);
    }

    //Gebruik scenebuilder om het simpeler te maken in de toekomst
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JAVAFX");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        //grid.setGridLinesVisible(true);

        Image imageO = new Image("o.gif");
        ImageView imageViewO = new ImageView(imageO);
        Image imageX = new Image("x.gif");
        ImageView imageViewX = new ImageView(imageX);

        grid.add(imageViewX, 0, 0);
        grid.add(imageViewO, 1, 1);
//        grid.add(imageViewO, 0, 2);
//        grid.add(imageViewX, 1, 0);
//        grid.add(imageViewO, 1, 1);
//        grid.add(imageViewX, 1, 2);
//        grid.add(imageViewX, 2, 0);
//        grid.add(imageViewX, 2, 1);
//        grid.add(imageViewX, 2, 2);



        Scene s = new Scene(grid,350,350);
        primaryStage.setScene(s);
        primaryStage.show();
    }
}
