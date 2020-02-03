import mjuk19_package.myclass;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class myclassTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Testing starts");

    }

    @AfterAll
    static void afterAll() {
        System.out.println("Testing is done");
    }

    @BeforeEach
    void beforeEach(TestInfo info) {
        System.out.println("Current test: " + info.getDisplayName());
    }

    @AfterEach
    void afterAll(TestInfo info) {
        System.out.println("Current test " + info.getDisplayName());
    }

    @Test
    @DisplayName("Tests length of String")
    void length_test() {
        String testString = "hej";
        int expected = 3;
        int actual = testString.length();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Tests is Empty method of String.")
    void isEmpty_test() {

        String testString = "";
        boolean actual = testString.isEmpty();
        assertTrue(actual);
    }

    @ParameterizedTest
    @DisplayName("Test MyClass negative method.")
    @ValueSource(ints = {10, 20, 100, 1000})
    void negative_test(int vs) {
        myclass mc1 = new myclass();
        assertTrue(mc1.negative(vs) < 0);
    }

    @ParameterizedTest(name = "{0} negativt är: {1}")
    @DisplayName("Test MyClass negative method.")
    @CsvSource(value = {"5, -5", "10, -10", "20,-20", "-100, 100"})
    void negative_test(int expected, int actual) {
        myclass mc1 = new myclass();
        assertEquals(expected, mc1.negative(actual));
    }

    @ParameterizedTest(name = "{0}  bokstav inehåller: {1}")
    @DisplayName("Test MyClass String length.")
    @CsvSource(value = {"1, a", "2, ab", "4, abcd", "7, abcdefg", "10, hijklmnopq"})
    void longerThanZero (int expected, String actual) {

        assertTrue(actual.length()>0);
        assertEquals(expected, actual.length());

    }

}




