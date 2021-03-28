import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest {

    Assignment assignment = new Assignment("Vraag?", "Antwoord");

    //getQuestions
    @Test
    void getQuestion() {

        //Positief
        assertEquals("Vraag?", assignment.getQuestion());
        assertEquals("Antwoord", assignment.getAnswer());

    }

    @Test
    void getQuestionShouldReturnFalse() {

        //Negetief
        assertEquals("Vrag?", assignment.getQuestion());
        assertEquals("Antword", assignment.getAnswer());
    }

    //getAnswer
    @Test
    void getAnswer() {

    }

    @Test
    void getAnswerShouldReturnFalse() {

    }

    //takeAssignment
    @Test
    void takeAssignment() {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typ");
        String input = scanner.nextLine();
        System.out.println("input");

        String goedAnt = "a";
        assertTrue(input.equalsIgnoreCase(goedAnt));
         */

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
}