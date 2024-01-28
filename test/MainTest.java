import newjava.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sum() {
        assertEquals(10, Main.sum(5,5));
    }
}