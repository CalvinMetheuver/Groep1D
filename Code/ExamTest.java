import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    @Test
    void addAssignment(){

        Exam exam = new Exam("test");
        assertEquals(0,exam.getAssignment().size());
        exam.addAssignment("Vraag", "Antwoord");
        assertEquals(1,exam.getAssignment().size());

        assertEquals("Vraag",exam.getAssignment().get(0).getQuestion());
        assertEquals("Antwoord",exam.getAssignment().get(0).getAnswer());
    }
}