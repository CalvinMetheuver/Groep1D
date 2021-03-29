import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class StudentTest {

    private School school;
    private Student student;

    @BeforeEach
    public void beforeAll(){
        student = new Student(2011,"test");
        school = new School();
        school.addExam("test");
    }

    @Test
    void testAddMake() {
        assertEquals(0,student.getMake().size());
        student.addMake(0);
        assertEquals(1,student.getMake().size());
    }

    @Test
    void testSearchMake(){
        assertEquals(null,student.searchMake(0));
        student.addMake(0);
        assertEquals(student.getMake().get(0),student.searchMake(0));
    }
}