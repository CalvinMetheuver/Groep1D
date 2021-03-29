import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    private static Assignment assignment;
    private static Exam exams;




    @BeforeAll
    public static void initEach(){
        exams = new Exam("Java");
        assignment = new Assignment("q?", "a");
        System.out.println("Before alll is called");
    }




}