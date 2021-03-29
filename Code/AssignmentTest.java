import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Scanner;

class AssignmentTest {

    private static Assignment assignment;
    private static String input = "a";

    @Test
    void checkAnswer(){
        Assignment assignment = new Assignment("aap","a");
        assertTrue(assignment.checkAnswer(input));
    }
}
