import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Namnger pogra
        stage.setTitle("Vår asgrymma MS paint copy");
        stage.setWidth(730);
        stage.setHeight(730);

        // Skapar instanser av Model, PaintSurface, BottomPanel och SidePanel
        Model model = new Model();
        PaintSurface ritYta = new PaintSurface(730, 700, model);
        BottomPanel bottomPanel = new BottomPanel (ritYta);
        SidePanel sidePanel = new SidePanel (ritYta, model);

        //Sätter MyCircle som förvald form när programmet startas
        model.setShape(new MyCircle(0, 0));


        // Skapar en grupp och lägger till PaintSurface, BottomPanel och SidePanel.
        Group grupp = new Group();
        grupp.getChildren().add(ritYta);
        grupp.getChildren().add(bottomPanel);
        grupp.getChildren().add(sidePanel);

        //Skapar en vit bakgrund för pogrammet
        Scene scene = new Scene(grupp, Color.WHITE);
        stage.setScene(scene);
        stage.show();
        // Förhindrar användaren från att ändra storleken på fönstret.
        stage.setResizable(false);
    }
}
