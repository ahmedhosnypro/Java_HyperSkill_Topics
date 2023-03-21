import basics.string.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTests {

    @ParameterizedTest
    @ValueSource(strings = {"aaaa", "AaAaaaA", "Radar", "My gym", "Don't nod", "No lemon, no melon"})
    void testIsPalindrome(String string) {
        System.out.print("testing " + string + " ");
        assertTrue(StringUtils.isPalindrome(string));
        System.out.println("passed");
    }


    @ParameterizedTest
    @ValueSource(strings = {"", "hello!", "horror", "Ill will", "((()))", "[))))]", "222222122222"})
    void testIsNotPalindrome(String string) {
        System.out.print("testing " + string + " ");
        assertFalse(StringUtils.isPalindrome(string));
        System.out.println("passed");
    }
}