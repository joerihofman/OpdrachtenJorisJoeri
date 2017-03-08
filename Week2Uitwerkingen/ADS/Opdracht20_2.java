import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Opdracht20_2 extends Application{
    public static void main(String[] args) {launch(args);}

    private GridPane setPanes() throws Exception{
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));

        return gridPane;
    }

    private HBox setHBox() throws Exception{
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);

        return hBox;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("GEEF ANTWOORD~~~!");

        GridPane gridPane = new Opdracht20_2().setPanes();

        HBox hBox = new Opdracht20_2().setHBox();

        Text text = new Text("Wat een mooi programma");
        gridPane.add(text,0,0);

        Label invoer = new Label("Voer je invoer in: ");
        gridPane.add(invoer,0,2);

        TextField textField = new TextField();
        gridPane.add(textField,1,2);

        Button button_sort = new Button("SORT");
        Button button_shuffle = new Button("SHUFFLE");
        Button button_reverse = new Button("REVERSE");

        hBox.getChildren().add(button_sort);
        hBox.getChildren().add(button_shuffle);
        hBox.getChildren().add(button_reverse);

        gridPane.add(hBox,1,3);

        final TextArea textArea = new TextArea();
        gridPane.add(textArea,1,4);

        button_sort.setOnAction(event -> buttonSort(textField.getText()));
        button_shuffle.setOnAction(event -> buttonShuffle(textField.getText()));

        button_reverse.setOnAction(event -> buttonReverse(textField.getText()));

        Scene scene = new Scene(gridPane,550,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void buttonSort(String input){
        LinkedList<Integer> list = stringToLinked(input);
        String stringetje = Opdracht20_2Mathmatics.sort(list);
        System.out.println(stringetje);
        //Opdracht20_2mathmatics; zet list in goede volgorde
        //textField.setText(uitkomst opdracht20_2mathmatics)
    }

    public void buttonShuffle(String input){
        LinkedList<Integer> list = stringToLinked(input);
    }

    public void buttonReverse(String input){
        LinkedList<Integer> list = stringToLinked(input);
    }

    public LinkedList<Integer> stringToLinked(String string) {
        String[] array = string.split(" ");
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < array.length; i++) {
            linkedList.add(Integer.parseInt(array[i]));
        }
        return linkedList;
    }
}


