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

    public Boolean takeExam(){
        int cijfer = 1;
        for(Assignment assignment: this.getAssignment()){
            if(assignment.takeAssignment()){
                cijfer++;
            }
        }
        if(cijfer > 5){
            System.out.println("\nU heeft een "+cijfer+" behaald. U bent geslaagd!");
            return true;
        }
        System.out.println("\nU heeft een "+cijfer+" behaald. U bent gezakt.");
        return false;
    }
}


