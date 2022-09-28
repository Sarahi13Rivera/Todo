package interfazGrafica;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex602 extends Application {

    @Override
    public void start(Stage ps) {
        Scene sc=new Scene(getLayout(),300,300);
        
        ps.setTitle("Datos");
        ps.show();
        ps.setScene(sc);
    }
    public GridPane getLayout(){
        GridPane gp=new GridPane();
        gp.setHgap(9);
        gp.setVgap(8);
        gp.setAlignment(Pos.CENTER);
        
        gp.add(new Label("Nombres"), 0, 0);
        gp.add(new TextField(),2,0,4,1);
        gp.add(new Label("Apellidos"), 0, 1);
        gp.add(new TextField(),2,1,4,1);
        gp.add(new Label("Fecha De Nacimiento"), 0, 2);
        gp.add(new TextField(),2,2,4,1);
        gp.add(new Label("Universidad Terminada"), 0, 3);
        gp.add(new CheckBox(),2,3);
        gp.add(new Label("Edad"), 0, 4);
        gp.add(new TextField(),2,4,4,1);
        gp.add(new Label("ID"), 0, 5);
        gp.add(new TextField(),2,5,4,1);
        gp.add(new Label("Sugerencias"), 0, 6);
        gp.add(new TextField(),2,6,4,2);
        
        gp.add(new Button("Aceptar"),2,8,2,1);
        gp.add(new Button("Cancelar"),4,8,2,1);
        
        
        return gp;
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
