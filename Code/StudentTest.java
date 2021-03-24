import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void testGetStudentCode()
    {
        Student student = new Student(12345, "Jan");
        assertTrue(12345 == student.getStudentCode());
    }

    @Test
    void testGetName()
    {
        Student student = new Student(123456,"Berend" );
        assertTrue("Berend".equals(student.getName()));
    }

    @Test
    void testAddMake()
    {

    }

    @Test
    void getMake()
    {

    }
}