
package innerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class circulo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Say 'Hello World'");
        Button btn2 = new Button("OK");
        
        // Panel principal
        //VBox root = new VBox();
        StackPane root = new StackPane();
        
        //Panel secundario
        Pane p1 = new Pane();
        
        Circle c0 = new Circle();
        
        // p1.setBounds();
        
        // Acoplado de los botones al panel
        p1.getChildren().add(btn1);
        // p1.setAlignment(Pos.CENTER);
        p1.getChildren().add(btn2);
        
        root.getChildren().add(p1);
        
        btn1.setOnAction( new ManejadorEvento1() );
        
        Scene scene = new Scene(p1, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // Nueva línea
       
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    // InnerClass
    public class ManejadorEvento1 implements EventHandler<ActionEvent> {
        
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Hello World!");
        }
    }
    
}
