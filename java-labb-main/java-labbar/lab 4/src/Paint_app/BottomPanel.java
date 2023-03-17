import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class BottomPanel extends HBox {
    private final Button clearButton; //skapar en privat instansvariabel av typen Button som heter clearButton

    public BottomPanel(MyCanvas ritYta) { //definiera konstruktorn, tar in en PaintSurface från Canvas (javaFX)
        //sätt bredd, höjd och färg på panelen
        setPrefSize(ritYta.getWidth(), 35);
        setLayoutY(670);
        setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, null, null)));
        setAlignment(Pos.BASELINE_LEFT);
        clearButton = new Button("Clear"); //skapa en ny knapp med texten "Clear"
        clearButton.setOnAction(event -> { //gör så att ritytan rensas när knappen klickas
            ritYta.getGraphicsContext2D().clearRect(0, 0, ritYta.getWidth(), ritYta.getHeight());
        });
        getChildren().add(clearButton); //lägg till knappen i panelen
    }
}