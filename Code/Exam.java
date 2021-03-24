import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

    Scanner scanner = new Scanner(System.in);

    //instace variables
    private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    private static ArrayList<Exam> exams = new ArrayList<Exam>();
    private String naam;

    //constructor
    public Exam(String naam) {
        this.naam = naam;
        exams.add(this);
    }

    public void printAssignment(){
        for (Assignment qa: assignments){
            System.out.println(qa.getQuestion());
        }
    }

    public ArrayList<Assignment> getAssignment() {
        return assignments;
    }

    public static ArrayList<Exam> getExams() {
        return exams;
    }

    public String getName() {
        return naam;
    }

    public void addAssignment(String vraag, String antwoord){
        this.assignments.add(new Assignment(vraag,antwoord));
        //qa = Questions & answers
    }
   
    public static void printExams(){
        int counter = 1;
        for (Exam exam: exams){
            System.out.println(counter+": "+exam.getName());
            counter++;
        }
    }
}


