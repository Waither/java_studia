import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    void testMainExecution() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
