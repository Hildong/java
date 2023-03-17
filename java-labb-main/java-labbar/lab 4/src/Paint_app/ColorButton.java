import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class ColorButton extends Canvas {

    // Konstanter för knappens dimensioner och linjebredd
    private static final int BUTTON_WIDTH = 40;
    private static final int BUTTON_HEIGHT = 40;
    private static final int STROKE_WIDTH = 1;

    // Färgen som knappen representerar
    private final Color color;

    // Modellen som knappen är kopplad till
    private final Model model;

    public ColorButton(Color color, Model model, ArrayList<ColorButtom> cBum) {
        // Anropa Canvas-konstruktorn med knappens dimensioner
        super(BUTTON_WIDTH, BUTTON_HEIGHT);
        // Spara färgen och modellen i instansvariabler
        this.color = color;
        this.model = model;
        // Hämta GraphicsContext för att kunna rita på canvasen
        GraphicsContext gc = getGraphicsContext2D();
        // Fyll canvasen med knappens färg
        gc.setFill(color);
        gc.fillRect(0, 0, getWidth(), getHeight());


        setOnMouseClicked(event -> {
            // Gå igenom alla färgknappar och avmarkera dem
            for (ColorButtom colorButtom : cBum) {
                colorButtom.deselect();
            }
            // Välj den här knappen
            select();
            // Uppdatera modellen med den här knappens färg
            model.setColor(color);
        });
    }

    // Metod för att hämta knappens färg
    public Color getColor() {
        return color;

    }

    // Metoder för att markera/avmarkera vald knapp, så man ser vilken som valt
    public void select() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(STROKE_WIDTH);
        gc.strokeRect(0, 0, BUTTON_WIDTH, BUTTON_HEIGHT);
    }

    public void deselect() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setStroke(Color.LIGHTGRAY);
        gc.setLineWidth(STROKE_WIDTH);
        gc.strokeRect(0, 0, BUTTON_WIDTH, BUTTON_HEIGHT);
    }
}
