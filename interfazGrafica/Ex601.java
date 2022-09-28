package interfazGrafica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex601 extends Application{

    @Override
    public void start(Stage ps)  {
        Scene sc=new Scene(getLayout(),250,250);
        
        ps.setTitle("calculadora");
        ps.show();
        ps.setScene(sc);
    }
    public GridPane getLayout(){
        GridPane gp=new GridPane();
        gp.setHgap(12);
        gp.setVgap(9);
        gp.setPadding(new Insets(15,40,20,40));
        gp.setAlignment(Pos.CENTER);
        
        gp.add(new TextField(),0,1,4,1);
        
        gp.add(new Button("7"),0,2);
        gp.add(new Button("8"),1,2);
        gp.add(new Button("9"),2,2);
        gp.add(new Button("+"),3,2);
        gp.add(new Button("4"),0,3);
        gp.add(new Button("5"),1,3);
        gp.add(new Button("6"),2,3);
        gp.add(new Button("-"),3,3);
        gp.add(new Button("1"),0,4);
        gp.add(new Button("2"),1,4);
        gp.add(new Button("3"),2,4);
        gp.add(new Button("*"),3,4);
        gp.add(new Button("C"),0,5);
        gp.add(new Button("0"),1,5);
        gp.add(new Button("="),2,5);
        gp.add(new Button("/"),3,5);
        
        return gp;
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
