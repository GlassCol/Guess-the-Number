import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @org.junit.jupiter.api.Test
    void guessTooHighTest() {
        var engine = new Engine();
        var TWENTYONE = 21;
        var result = engine.highOrLow(TWENTYONE);
        var expectedResult = "Your guess is too high.";
        assertEquals(expectedResult, result);
    }

    @org.junit.jupiter.api.Test
    void guessTooLowTest() {
        var engine = new Engine();
        var NEGATIVEONE = -1;
        var result = engine.highOrLow(NEGATIVEONE);
        var expectedResult = "Your guess is too low.";
        assertEquals(expectedResult, result);
    }
}