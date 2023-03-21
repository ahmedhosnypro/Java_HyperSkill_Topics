import basics.string.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @ParameterizedTest
    @ValueSource(strings = {"rotator", "Stats", "(radar)", "level", "race car"})
    void testPalindrome(String str) {
        assertTrue(StringUtils.isPalindrome(str));
    }
}