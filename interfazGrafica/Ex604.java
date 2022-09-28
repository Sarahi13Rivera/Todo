package interfazGrafica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex604 extends Application {
    
    private Label lbResultado;
    private TextField tfRadio;
    private TextField tfHaltura;

    @Override
    public void start(Stage PS)  {
        Scene sc=new Scene(getLayout(),400,250);
        
        PS.setTitle("Volumen");
        PS.show();
        PS.setScene(sc);
    }
    public VBox getLayout(){
        VBox vb=new VBox();
        vb.setAlignment(Pos.CENTER);
        
        vb.getChildren().add(getGP());
        
        return vb;
    }
    public GridPane getGP(){
        GridPane gp=new GridPane();
        gp.setHgap(12);
        gp.setVgap(12);
        gp.setPadding(new Insets(20,20,20,20));
        
        gp.add(new Label("Calcular volumen de un cono"),0,0,2,1);
        gp.add(new Label("ingresa la Haltura"),0,1);
        tfHaltura=new TextField();
        gp.add(tfHaltura,1,1,3,1);
        gp.add(new Label("ingresa el radio"),0,2);
        tfRadio=new TextField();
        gp.add(tfRadio,1,2,3,1);
        
        Button b=new Button("Calcular");
        b.setOnAction(e->{Calcular();});
        gp.add(b,4,0);
        
        lbResultado=new Label();
        gp.add(lbResultado,0,4);
        return gp;
    }
    public void Calcular(){
        double h=Double.parseDouble(tfHaltura.getText());
        double r=Double.parseDouble(tfRadio.getText());
        double res=Math.PI*Math.pow(r, 2)*h/3;
        
        lbResultado.setText("El volumen es="+res);
    }
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
