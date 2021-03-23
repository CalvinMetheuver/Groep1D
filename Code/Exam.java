import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

    Scanner scanner = new Scanner(System.in);

    //instace variables
    private ArrayList<Assignment> assignment = new ArrayList<Assignment>();
    private static ArrayList<Exam> exams = new ArrayList<Exam>();
    private String naam;

    //constructor
    public Exam(String naam) {
        this.naam = naam;
        exams.add(this);
    }

    public void printAssignment(){
        for (Assignment qa: assignment){
            System.out.println(qa.getQuestion());
        }
    }

    public ArrayList<Assignment> getAssignment() {
        return assignment;
    }

    public String getName() {
        return naam;
    }

    public void addAssignment(String vraag, String antwoord){
        this.assignment.add(new Assignment(vraag,antwoord));
        //qa = Questions & answers
    }

    public static void printExams(){
        for (Exam exam: exams){
            System.out.println(exam.getName());
        }
    }
}