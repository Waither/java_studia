import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    void testMainExecution() {
        // No exception should be thrown during the execution of the main method
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
