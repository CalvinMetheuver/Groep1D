import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    @Test
    void addAssignment(){

        Exam exam = new Exam("test");
        assertEquals(0,exam.getAssignments().size());
        exam.addAssignment("Vraag", "Antwoord");
        assertEquals(1,exam.getAssignments().size());

        assertEquals("Vraag",exam.getAssignments().get(0).getQuestion());
        assertEquals("Antwoord",exam.getAssignments().get(0).getAnswer());
    }
}