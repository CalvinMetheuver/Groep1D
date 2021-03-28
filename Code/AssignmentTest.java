import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Scanner;



class AssignmentTest {

    private static Assignment assignment;

    @BeforeAll
    public static void initEach() {
        assignment = new Assignment("Vraag?", "Antwoord");
        System.out.println("Before alll is called");
    }


    //getQuestions
    @Test
    void getQuestion() {
        assertEquals("Vraag?", assignment.getQuestion());
    }

    @Test
    void getQuestionShouldReturnFalse() {
        assertEquals("Vrag?", assignment.getQuestion());
    }


    //getAnswer
    @Test
    void getAnswer() {
        assertEquals("Antwoord", assignment.getAnswer());
    }

    @Test
    void getAnswerShouldReturnFalse() {
        assertEquals("Antword", assignment.getAnswer());
    }

    @Test
    void takeAssignment() {
        String input = "A";
        String goedAnt = "a";
        assertTrue(input.equalsIgnoreCase(goedAnt));
    }

    @Test
    void takeAssignmentShouldReturnFalse() {
        String input = "b";
        String goedAnt = "a";
        assertTrue(input.equalsIgnoreCase(goedAnt));
    }
    /*
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        account.withdraw(600.00, false);
        fail("Should have thrown an IllegalArgumentException");
    }

 */

}
