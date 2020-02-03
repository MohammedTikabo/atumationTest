import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class math_test {

    @Test
    void math_Test(){
        int a = 10;
        int b = 0;
        int max = 10;
        int min = 0;

        assertEquals(max,Math.max(a,b));
        assertEquals(min,Math.min(a,b));
    }
}
