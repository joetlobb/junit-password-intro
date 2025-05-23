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

    @Test
    void testDescribeContainsTriple() {
        // Arrange
        String string = "asdaaasdfd";

        // Act
        boolean actual = PasswordUtils.containsTriple(string);

        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testDescribeNotContainsTriple() {
        // Arrange
        String string = "dslac#ds1";

        // Act
        boolean actual = PasswordUtils.containsTriple(string);

        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testDescribeCountWithSpecialCharacters() {
        // Arrange
        String string = "dslac#ds1";

        // Act
        int actual = PasswordUtils.countSpecialCharacters(string);

        // Assert
        assertEquals(1, actual);
    }

    @Test
    void testDescribeCountWithoutSpecialCharacters() {
        // Arrange
        String string = "dslacdss";

        // Act
        int actual = PasswordUtils.countSpecialCharacters(string);

        // Assert
        assertEquals(0, actual);
    }

    @Test
    void testDescribeCountWithAllSpecialCharacters() {
        // Arrange
        String string = "!@#$%^&*";

        // Act
        int actual = PasswordUtils.countSpecialCharacters(string);

        // Assert
        assertEquals(8, actual);
    }

    @Test
    void testDescribeHasSufficientSpecialCharacters() {
        // Arrange
        String string = "!dsla$cdss#";
        int requiredNumOfSpecialChar = 3;

        // Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(string, requiredNumOfSpecialChar);

        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testDescribeDoNotHaveSufficientSpecialCharacters() {
        // Arrange
        String string = "!dsla$cdss";
        int requiredNumOfSpecialChar = 3;

        // Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(string, requiredNumOfSpecialChar);

        // Assert
        assertEquals(false, actual);
    }
}
