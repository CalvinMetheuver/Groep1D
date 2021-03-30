import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Scanner;

class AssignmentTest {


    @Test
    void checkAnswer(){
        Assignment assignment = new Assignment("aap","a");
        assertTrue(assignment.checkAnswer("a"));
    }
}
