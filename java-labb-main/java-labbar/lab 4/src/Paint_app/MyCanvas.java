import javafx.scene.canvas.Canvas;

public class MyCanvas extends Canvas {

    private Model cords;

    public MyCanvas (int witdh, int height, Model cords) {
        // Anropa superklassens konstruktor med bredd och höjd
        super(witdh, height);
              //setOnMouseClicked ska rita ut när man klicka på skärmen
        setOnMouseDragged(event -> {
            // Uppdatera x- och y-koordinaterna för det aktuella verktyget med musens koordinater
            cords.getShape().setX((int) event.getSceneX());
            cords.getShape().setY((int) event.getSceneY());

            cords.storeShape(cords.getShape().copy((int) event.getSceneX(), (int) event.getSceneY(), cords.getColor()));

            getGraphicsContext2D().clearRect(0, 0, witdh, height);

            for (Shape s : cords.getContents()) {
                s.drawYourselt(getGraphicsContext2D());
            }
            // Anropa metoden drawYourself för det aktuella verkty
            // get med rätt färg och rityta (getGraphicsContext2D())
            cords.getShape().drawYourselt(getGraphicsContext2D(), cords.getColor());
        });
    }

    public Model getModel() {
        return cords;
    }
}
