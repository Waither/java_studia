import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {

    @Test
    void testValidColors() {
        // Test valid color combinations
        Color color1 = new Color(128, 0, 0, 0.4f);
        Color color2 = new Color(255, 128, 52);
        Color color3 = new Color(0, 255, 0, 0.7f);
        assertNotNull(color1);
        assertNotNull(color2);
        assertNotNull(color3);
    }

    @Test
    void testInvalidRed() {
        // Test invalid red values
        assertThrows(IllegalArgumentException.class, () -> new Color(-1, 0, 0, 0.4f));
        assertThrows(IllegalArgumentException.class, () -> new Color(256, 0, 0, 0.4f));
    }

    @Test
    void testInvalidGreen() {
        // Test invalid green values
        assertThrows(IllegalArgumentException.class, () -> new Color(0, -1, 0, 0.4f));
        assertThrows(IllegalArgumentException.class, () -> new Color(0, 256, 0, 0.4f));
    }

    @Test
    void testInvalidBlue() {
        // Test invalid blue values
        assertThrows(IllegalArgumentException.class, () -> new Color(0, 0, -1, 0.4f));
        assertThrows(IllegalArgumentException.class, () -> new Color(0, 0, 256, 0.4f));
    }

    @Test
    void testInvalidAlpha() {
        // Test invalid alpha values
        assertThrows(IllegalArgumentException.class, () -> new Color(0, 0, 0, -0.1f));
        assertThrows(IllegalArgumentException.class, () -> new Color(0, 0, 0, 1.1f));
    }
}
