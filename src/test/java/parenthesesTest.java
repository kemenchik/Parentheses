import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class parenthesesTest {
    @ParameterizedTest()
    @ValueSource(strings = {"()()", "(()(())())", "((()))"})
    @EmptySource
    void testParenthesesTrue(String word) {
        assertTrue(new Parentheses().isSymmetric2(word));
    }

    @ParameterizedTest()
    @ValueSource(strings = {"()))", "((()", "))((", "()()()))"})
    @NullSource
    void testParenthesesFalse(String word) {
        assertFalse(new Parentheses().isSymmetric(word));
    }
}