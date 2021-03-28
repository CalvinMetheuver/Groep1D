import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void showStudents() {
        Student student = new Student(20195745, "Bilal");
        assertEquals(20195745, student.getStudentCode());
        assertEquals("Bilal", student.getName());
    }

    @Test
    void addToStudentList() {

    }

    @Test
    void getStudent() {
    }

    @Test
    void showExams() {
    }

    @Test
    void addStudent() {
    }

    @Test
    void deleteStudent() {
    }
}