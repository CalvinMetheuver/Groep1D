import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    //private static Assignment assignment;
    private static Exam exams;
    private static ArrayList <Assignment>  assignments = new ArrayList<>();





    @BeforeAll
    public static void initEach(){
        exams = new Exam("Java");

        System.out.println("Before alll is called");
    }

    @Test
    void addAssignment(){

        assignments.add(new Assignment("V", "A"));
        assignments.add(new Assignment("Vr", "An"));
        assignments.add(new Assignment("Vra", "Ant"));
        assignments.add(new Assignment("Vraa", "Antwo"));
        assignments.add(new Assignment("Vraag", "Antwoord"));
        assignments.add(new Assignment("Vraag 6", "Antwoord 6"));
        assignments.add(new Assignment("Vraag 7", "Antwoord 7"));
        assignments.add(new Assignment("Vraag 8", "Antwoord 8"));
        assignments.add(new Assignment("Vraag 9", "Antwoord 9"));


        assertEquals("V",assignments.get(0).getQuestion());
        assertEquals("Vr",assignments.get(1).getQuestion());
        assertEquals("Vra",assignments.get(2).getQuestion());
        assertEquals("Vraa",assignments.get(3).getQuestion());
        assertEquals("Vraag",assignments.get(4).getQuestion());

        assertEquals("A",assignments.get(0).getAnswer());
        assertEquals("An",assignments.get(1).getAnswer());
        assertEquals("Ant",assignments.get(2).getAnswer());
        assertEquals("Antwo",assignments.get(3).getAnswer());
        assertEquals("Antwoord",assignments.get(4).getAnswer());

    }

    @Test
    void takeExam() {
    }




}