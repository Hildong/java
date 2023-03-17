//Modellklassen håller reda på figurens form och färg
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Model {
    private Shape shape;
    private Color color;

    private ArrayList<Shape> contents = new ArrayList<>();

    public void storeShape(Shape s)  {
        contents.add(s);
    }

    public ArrayList<Shape> getContents() {
        return contents;
    }

    //Returnerar figurens form


    public Shape getShape() {
        return shape;
    }
    //Setter-metod som sätter figurens form
    public void setShape(Shape shape) {
        this.shape = shape;
    }
    //Returnerar figurens färg
    public Color getColor() {
        return color;
    }
    //Sätter figurens färg
    public void setColor(Color color) {
        this.color = color;
    }
}
