import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class StudentTest {

    private School school;
    private Student student;

    @BeforeEach
    public void beforeAll(){
        school = new School();
        student = new Student(2011,"test",school);
        school.addExam("test");
    }

    @Test
    void testAddMake() {
        assertEquals(0,student.getAttempts().size());
        student.addAttempt(0);
        assertEquals(1,student.getAttempts().size());
    }

    @Test
    void testSearchMake(){
        assertEquals(null,student.getAttempt(0));
        student.addAttempt(0);
        assertEquals(student.getAttempts().get(0),student.getAttempt(0));
    }
}