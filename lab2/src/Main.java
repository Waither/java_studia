public class Main {
    public static void main(String[] args) {
        Color kolor1 = new Color(128, 0, 0, 0.4f);
        Color kolor2 = new Color(255, 128, 52);
        System.out.printf("Color: %s, red: %d, green: %d, blue: %d, alpha: %.2f%n", kolor1.toString(), kolor1.red(),kolor1.green(), kolor1.blue(), kolor1.alpha());

        System.out.printf("Color: %s, red: %d, green: %d, blue: %d, alpha: %.2f%n", kolor2.toString(), kolor2.red(),kolor2.green(), kolor2.blue(), kolor2.alpha());
    }
}