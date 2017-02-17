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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class javafxMain extends Application {

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

        Text text = new Text("Welkom");
        text.setFont(Font.font("Comic Sans", FontWeight.NORMAL,20));
        grid.add(text,0,0,2,1);

        Label user = new Label("Username:");
        grid.add(user,0,1);

        TextField textField = new TextField();
        grid.add(textField,1,1);

        Label pwd = new Label("Password:");
        grid.add(pwd,0,2);

        PasswordField pwdBox = new PasswordField();
        grid.add(pwdBox,1,2);

        Button button = new Button("LogIn");
        HBox hBoxButton = new HBox(10);
        hBoxButton.setAlignment(Pos.BOTTOM_RIGHT);
        hBoxButton.getChildren().add(button);
        grid.add(hBoxButton,1,4);

        final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actiontarget.setFill(Color.BLACK);
                actiontarget.setText("INGEDRUKT!");
            }
        });

        Scene s = new Scene(grid,300,275);
        primaryStage.setScene(s);
        primaryStage.show();
    }
}
