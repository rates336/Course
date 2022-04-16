import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

public class ExceptionHandling {

    @Test
    void second() throws Exception {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        String expected = "Done";
        try {
            when(secondChallenge.probablyIWillThrowException(2.0, 0));
            when(secondChallenge.probablyIWillThrowException(10.0, 0));
            when(secondChallenge.probablyIWillThrowException(0.5, 0));
            when(secondChallenge.probablyIWillThrowException(1.5, 1.5));
            when(secondChallenge.probablyIWillThrowException(1, 0))
                    .thenReturn("Done");
            when(secondChallenge.probablyIWillThrowException(2.0, 1.5));
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("I am here always");
        }
        //When
        String result1 = null, result2 = null, result3 = null, result4 = null,
                result5 = null, result6 = null;
        try {
            secondChallenge.probablyIWillThrowException(2.0, 0);
            result1 = "Done";
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            secondChallenge.probablyIWillThrowException(10.0, 0);
            result2 = "Done";
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            secondChallenge.probablyIWillThrowException(0.5, 0);
            result3 = "Done";
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            secondChallenge.probablyIWillThrowException(1.5, 1.5);
            result4 = "Done";
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            secondChallenge.probablyIWillThrowException(1, 0);
            result5 = "Done";
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            secondChallenge.probablyIWillThrowException(2.0, 1.5);
            result6 = "Done";
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Then
        assertNotEquals(expected, result1);
        assertNotEquals(expected, result2);
        assertNotEquals(expected, result3);
        assertNotEquals(expected, result4);
        assertEquals(expected, result5);
        assertNotEquals(expected, result6);
    }
}
