import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Scanner;



class AssignmentTest {

    private static Assignment assignment;


    @BeforeAll
    public static void initEach() {
        System.out.println("Dit wordt 1 keer uitgevoerd voordat de tests beginnen");
    }


    @Test
    void takeAssignmentCorrectInput() {
        String answer = "A".toLowerCase();
        assertEquals("a", answer);
        System.out.println(answer);

        String goedAnt = "a";
        System.out.println(goedAnt);

        // is gelijk, zou niet in de while moeten komen invoer,
        // antwoord gelijk (A / a)
        assertTrue(goedAnt.equals(answer));
    }

    @Test
    void takeAssignmentWrongInput() {
        String answer = "B".toLowerCase();
        System.out.println(answer);
        Scanner testScanner = new Scanner(answer);
        String goedAnt = "a";
        // is ongelijk, zou WEL in de while moeten komen en nieuwe invoer opvragen,
        //antwoord ongelijk (B / a)
        assertTrue(!(goedAnt.equals(testScanner)));
    }

}
