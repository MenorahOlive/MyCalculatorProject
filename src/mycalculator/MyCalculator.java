package mycalculator;

import javafx.application.Application;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class MyCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text fnum = new Text("First Number");
        TextField fnumField = new TextField();
        Text snum = new Text("Second Number");
        TextField snumField = new TextField();

        Text answerLabel = new Text("Answer");
        Text answer = new Text("....");
        Text operation = new Text("Operations");
        Button sumBtn = new Button("Sum");

        Button diffBtn = new Button("Difference");
        Button avgBtn = new Button("Average");
        Button divideBtn = new Button("Divide");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(800, 500);

        gridPane.setVgap(20);
        gridPane.setHgap(20);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(fnum, 1, 1);
        gridPane.add(fnumField, 2, 1);
        gridPane.add(snum, 3, 1);
        gridPane.add(snumField, 4, 1);
        gridPane.add(answerLabel, 1, 2);
        gridPane.add(answer, 2, 2);
        gridPane.add(operation, 1, 3);
        gridPane.add(sumBtn, 2, 3);

        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().addAll(sumBtn, diffBtn, avgBtn, divideBtn);
        gridPane.add(buttons, 2, 3, 2, 1);

        primaryStage.setTitle("CALCULATOR");
        Scene myScene = new Scene(gridPane);
        primaryStage.setScene(myScene);
        primaryStage.show();

          sumBtn.setOnMouseClicked((new EventHandler<MouseEvent>() {
         public void handle(MouseEvent event) {
             
           if ((fnumField.getText() == null || fnumField.getText().trim().isEmpty()) || (snumField.getText() == null || snumField.getText().trim().isEmpty())) {
                answer.setText("Your inputs are incorrect");
             }
             else
             {
                String num_one =  fnumField.getText();
                String num_two =  snumField.getText();          
                double first_num = Double.parseDouble(num_one);
                double second_num = Double.parseDouble(num_two);          
                double sum = first_num + second_num;          
                answer.setText(Double.toString(sum));  
             }
         }
        }));
 sumBtn.setOnMouseClicked((new EventHandler<MouseEvent>() {
         public void handle(MouseEvent event) {
             
           if ((fnumField.getText() == null || fnumField.getText().trim().isEmpty()) || (snumField.getText() == null || snumField.getText().trim().isEmpty())) {
                answer.setText("Your inputs are incorrect");
             }
             else
             {
                String num_one =  fnumField.getText();
                String num_two =  snumField.getText();          
                double first_num = Double.parseDouble(num_one);
                double second_num = Double.parseDouble(num_two);          
                double sum = first_num + second_num;          
                answer.setText(Double.toString(sum));  
             }
         }
        }));
 avgBtn.setOnMouseClicked((new EventHandler<MouseEvent>() {
         public void handle(MouseEvent event) {
             
           if ((fnumField.getText() == null || fnumField.getText().trim().isEmpty()) || (snumField.getText() == null || snumField.getText().trim().isEmpty())) {
                answer.setText("Your inputs are incorrect");
             }
             else
             {
                String num_one =  fnumField.getText();
                String num_two =  snumField.getText();          
                double first_num = Double.parseDouble(num_one);
                double second_num = Double.parseDouble(num_two);          
                double sum = first_num + second_num;          
                answer.setText(Double.toString(sum));  
             }
         }
        }));
 divideBtn.setOnMouseClicked((new EventHandler<MouseEvent>() {
         public void handle(MouseEvent event) {
             
           if ((fnumField.getText() == null || fnumField.getText().trim().isEmpty()) || (snumField.getText() == null || snumField.getText().trim().isEmpty())) {
                answer.setText("Your inputs are incorrect");
             }
             else
             {
                String num_one =  fnumField.getText();
                String num_two =  snumField.getText();          
                double first_num = Double.parseDouble(num_one);
                double second_num = Double.parseDouble(num_two);          
                double sum = first_num + second_num;          
                answer.setText(Double.toString(sum));  
             }
         }
        }));
  diffBtn.setOnMouseClicked((new EventHandler<MouseEvent>() {
         public void handle(MouseEvent event) {
             
           if ((fnumField.getText() == null || fnumField.getText().trim().isEmpty()) || (snumField.getText() == null || snumField.getText().trim().isEmpty())) {
                answer.setText("Your inputs are incorrect");
             }
             else
             {
                String num_one =  fnumField.getText();
                String num_two =  snumField.getText();          
                double first_num = Double.parseDouble(num_one);
                double second_num = Double.parseDouble(num_two);          
                double sum = first_num + second_num;          
                answer.setText(Double.toString(sum));  
             }
         }
        }));


     //Code to ensure decimal values only are accepted
        fnumField.setOnKeyReleased((new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                String in = fnumField.getText();                
                if (!in.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                fnumField.setText("");
                }        
            }
        }));
        //Code to ensure decimal values only are accepted
        fnumField.setOnKeyReleased((new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                String in = fnumField.getText();                
                if (!in.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                fnumField.setText("");
                }        
            }
        }));

    }
    

    public static void main(String[] args) {
        launch(args);
    }

}
