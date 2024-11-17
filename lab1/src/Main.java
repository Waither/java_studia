public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2.0, 3.0);
        Shape triangle = new Triangle(4.0, 4.0, 5.0);
        ShapeDescriber describer = new ShapeDescriber();
        describer.describe(rectangle);
        describer.describe(triangle);
    }
}