import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.awt.*;
import java.util.ArrayList;


public class SidePanel extends VBox {

    private ArrayList<ColorButton> colorButtons = new ArrayList<>();
    private ArrayList<ShapeButton> shapeButtons = new ArrayList<>();

    public SidePanel(PaintSurface ritYta, Model model) {
        // Ange egenskaper för sidopanelen
        setPrefSize(50, ritYta.getHeight());
        setLayoutX(680);
        setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, null, null)));
        setSpacing(10);
        setAlignment(Pos.TOP_CENTER);

        // Skapa etiketter för färg och form
        Label farg = new Label("Färg");
        Label form = new Label("Form");


        // Skapa 8 colorButtons-instanser med olika färger och lägg till dem i arraylisten
        colorButtons.add(new colorButtons(Color.POWDERBLUE, model, colorButtons));
        colorButtons.add(new colorButtons(Color.LAVENDER, model, colorButtons));
        colorButtons.add(new colorButtons(Color.PAPAYAWHIP, model, colorButtons));
        colorButtons.add(new colorButtons(Color.LIGHTSALMON, model, colorButtons));
        colorButtons.add(new colorButtons(Color.PALEVIOLETRED, model, colorButtons));
        colorButtons.add(new colorButtons(Color.PALEGREEN, model, colorButtons));
        colorButtons.add(new colorButtons(Color.NAVAJOWHITE, model, colorButtons));
        colorButtons.add(new colorButtons(Color.MISTYROSE, model, colorButtons));


        // Lägg till etiketten "Färg" och colorButtons-instanserna i sidopanelen
        getChildren().add(farg);
        for (colorButtons colorBtns : colorButtons){
            getChildren().add(colorBtns);
        }
        // Lägg till etiketten "Form" och shapeButtons-instanserna i sidopanelen
        getChildren().add(form);
        shapeButtons.add(new shapeButtons(new MyCircle(0, 0), model, shapeButtons));
        shapeButtons.add(new shapeButtons(new MySquare(0, 0), model, shapeButtons));
        shapeButtons.add(new shapeButtons(new MyTriangle(0, 0), model, shapeButtons));
        for (shapeButtons shapes : shapeButtons) {
            getChildren().add(shapes);
        }
    }
}