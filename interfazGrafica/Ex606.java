package interfazGrafica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex606 extends Application {
    private Label lbIms;
    private TextField tfPeso;
    private TextField tfAltura;
    private ImageView imgvImagen;

    @Override
    public void start(Stage PS) {
        Scene sc=new Scene(getLayout(),700,300);
        
        PS.setTitle("Calcular el IMC");
        PS.show();
        PS.setScene(sc);
    }
    public VBox getLayout(){
        VBox vb=new VBox();
        
        vb.getChildren().add(getGP());
        return vb;
    }
    public GridPane getGP(){
        GridPane gp=new GridPane();
        gp.setHgap(12);
        gp.setVgap(12);
        gp.setPadding(new Insets (25,25,25,25));
        
        Label lb=new Label("IMC");
        lb.setAlignment(Pos.TOP_CENTER);
        lb.setTextFill(Color.RED);
        lb.setFont(new Font("Arial",25));
        gp.add(lb,1,0);
        
        
        gp.add(new Label("ingrese el Peso"),0,1);
        tfPeso=new TextField();
        gp.add(tfPeso,1,1,2,1);
        gp.add(new Label("ingrese la Altura"),0,2);
        tfAltura=new TextField();
        gp.add(tfAltura,1,2,2,1);
        
        Button b=new Button("Calcular");
        b.setOnAction(e->{Calcular();});
        gp.add(b,1,3);
        
        lbIms=new Label();
        gp.add(lbIms,0,4);
        
        imgvImagen=new ImageView();
        imgvImagen.setImage(new Image(getClass().getResourceAsStream("0.jpg"),300,240,true,true));
        gp.add(imgvImagen,5,0,2,4);
        
        return gp;
    }
    public void Calcular(){
        double Al=Double.parseDouble(tfAltura.getText());
        double Pe=Double.parseDouble(tfPeso.getText());
        double res=Pe/Math.pow(Al,2);
        lbIms.setText("El IMC es ="+res);
        
        if (res<18.4){
            imgvImagen.setImage(new Image(getClass().getResourceAsStream("1.JPG"),300,200,true,true));
        }else if(res>18.5||res<24.9){
            imgvImagen.setImage(new Image(getClass().getResourceAsStream("2.JPG"),300,200,true,true));
        }else if(res>25||res<29.9){
            imgvImagen.setImage(new Image(getClass().getResourceAsStream("3.JPG"),300,200,true,true));
        }else if(res>30.9||res<34.9){
            imgvImagen.setImage(new Image(getClass().getResourceAsStream("4.JPG"),300,200,true,true));
        }else if(res>30.9||res<34.9){
        
    }
    }    
    public static void main(String[] args) {
        launch (args);
    }
}
