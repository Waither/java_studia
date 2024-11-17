abstract class Shape {
    public String name;
    public Color color;
    public String getName() {
        return this.name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void getColorDescription();
}
class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width, double height, Color color) {
        this.name = "Rectangle";
        this.width = width;
        this.height = height;
        this.color = color;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public void getColorDescription() {
        System.out.printf("Red: %d, Green: %d, Blue: %d, Alpha: %.2f%n", this.color.red(), this.color.green(), this.color.blue(), this.color.alpha());
    }
}
class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c, Color color) {
        this.name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }
    @Override
    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public void getColorDescription() {
        System.out.printf("Red: %d, Green: %d, Blue: %d, Alpha: %.2f%n", this.color.red(), this.color.green(), this.color.blue(), this.color.alpha());
    }
}
class ShapeDescriber {
    public void describe(Shape shape) {
        System.out.println(shape.getName() + ":");
        System.out.println("Pole: " + shape.getArea());
        System.out.println("Obwód: " + shape.getPerimeter());
        shape.getColorDescription();
    }
}