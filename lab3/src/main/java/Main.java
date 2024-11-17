public class Main {
    public static void main(String[] args) {
        Color color1 = new Color(128, 0, 0, 0.4f);
        Color color2 = new Color(255, 128, 52);
        Shape rectangle = new Rectangle(2.0, 3.0, color1);
        Shape triangle = new Triangle(4.0, 4.0, 5.0, color2);
        ShapeDescriber describer = new ShapeDescriber();
        System.out.printf("%n%n%n");
        describer.describe(rectangle);
        describer.describe(triangle);
    }
}