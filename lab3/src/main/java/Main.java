import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Color color1 = new Color(128, 0, 0, 0.4f);
        Color color2 = new Color(255, 128, 52);
        Color color3 = new Color(0, 255, 0, 0.7f);
        Color color4 = new Color(0, 0, 255, 0.9f);
        Color color5 = new Color(255, 255, 0, 0.5f);
        Color color6 = new Color(128, 128, 128, 1.0f);

        Shape rectangle1 = new Rectangle(2.0, 3.0, color1);
        Shape triangle1 = new Triangle(4.0, 4.0, 5.0, color2);
        Shape rectangle2 = new Rectangle(5.0, 5.0, color3);
        Shape triangle2 = new Triangle(7.0, 5.0, 6.0, color4);
        Shape rectangle3 = new Rectangle(7.5, 8.0, color5);
        Shape triangle3 = new Triangle(6.0, 8.0, 10.0, color6);

        // Describe
        ShapeDescriber describer = new ShapeDescriber();
        describer.describe(rectangle1);
        describer.describe(triangle1);
        describer.describe(rectangle2);
        describer.describe(triangle2);
        describer.describe(rectangle3);
        describer.describe(triangle3);

        // Render
        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle1);
        shapes.add(triangle1);
        shapes.add(rectangle2);
        shapes.add(triangle2);
        shapes.add(rectangle3);
        shapes.add(triangle3);

        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShapes(shapes);
    }
}
