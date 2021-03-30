import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

    Scanner scanner = new Scanner(System.in);

    //instace variables
    private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    private String naam;

    //constructor
    public Exam(String naam) {
        this.naam = naam;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
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
        for(Assignment assignment: this.getAssignments()){
            if(assignment.takeAssignment()){
                cijfer++;
            }
        }
        if(cijfer > 5){
            System.out.println("\nU heeft een "+cijfer+" behaald. U bent geslaagd!");
            return true;
        }else{
            System.out.println("\nU heeft een "+cijfer+" behaald. U bent gezakt.");
            return false;
        }
    }
}


