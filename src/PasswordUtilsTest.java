import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // Arrange
        String password = "hey";

        // Act
        String actual = PasswordUtils.describePasswordLength(password);

        // Assert: the result SHOULD be 'short'. Compare it to actual result.
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthLongPassword() {
        // Arrange
        String password = "helloSDEV220";

        // Act
        String actual = PasswordUtils.describePasswordLength(password); 

        // Assert
        assertEquals("long", actual);
    }

    @Test
    void testDescribePasswordLengthMediumPassword() {
        // Arrange
        String password = "helloSDEV";

        // Act
        String actual = PasswordUtils.describePasswordLength(password); 

        // Assert
        assertEquals("medium", actual);
    }

    @Test
    void testDescribeIsAlphaNumeric() {
        // Arrange
        String string = "dslacds1";

        // Act
        boolean actual = PasswordUtils.isAlphanumeric(string);

        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testDescribeIsNotAlphaNumeric() {
        // Arrange
        String string = "dslac#ds1";

        // Act
        boolean actual = PasswordUtils.isAlphanumeric(string);

        // Assert
        assertEquals(false, actual);
    }
}
