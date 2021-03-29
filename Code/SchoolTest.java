import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    private School school;
    private Student student;

    @BeforeEach
    public void beforeAll(){
        school = new School();
    }

    @Test
    void testAddExam() {
        school.addToStudentList(2011,"test");
        assertEquals(0,Exam.getExams().size());
        school.addExam("java");
        assertEquals(1,Exam.getExams().size());
    }

    @Test
    void testAddToStudentList(){
        assertEquals(0,school.getStudents().size());
        school.addToStudentList(2011,"test");
        assertEquals(1,school.getStudents().size());
    }
}