import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertorTest {
    String s;

    @ParameterizedTest()
    @CsvSource(value = {
            "800888TEST, 8008888378",
            "ITSATEST, 48728378",
            "1NMBR, 16627"
    })
    void testConvertorValid(String word, String answer) {
        assertEquals(answer, new Convertor().convertInDigits(word));
    }
}