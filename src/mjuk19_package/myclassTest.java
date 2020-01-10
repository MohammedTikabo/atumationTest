package mjuk19_package;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class myclassTest {

    @Test
    void length_test() {
        String testString = "hej";
        int expected = 3;
        int actual = testString.length();
        assertEquals(expected,actual);
    }

    @Test
    Void isEmpty_test(){

        String testString = "";
        boolean actual = testString.isEmpty() ;
        assertTrue(actual);
    }



}