import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class parenthesesTest {
    public boolean allClosed(String s) {
        return new Parentheses().isTrue(s);
    }

    @ParameterizedTest()
    @ValueSource(strings = {"()()", "(())(())()()((()()))"})
    @EmptySource
    void testParenthesesTrue(String word) {
        assertTrue(allClosed(word));
    }

    @ParameterizedTest()
    @ValueSource(strings = {"()))", "((()", "))((", "()()()))"})
    @NullSource
    void testParenthesesFalse(String word) {
        assertFalse(allClosed(word));
    }
}