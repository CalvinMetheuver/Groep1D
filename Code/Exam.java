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

    public String getName() {
        return naam;
    }

    public void addAssignment(String vraag, String antwoord){
        this.assignment.add(new Assignment(vraag,antwoord));
        //qa = Questions & answers
    }


    public void printAssignments(){
        for (Assignment qa: assignment){
            System.out.println(qa.getQuestion() + " " + qa.getAnswer());
        }
    }

    public static void printExams(){
        for (Exam exam: exams){
            System.out.println(exam.getName());
        }
    }
    // public void verwijzingExamens() {

    //     printExamens();

    //     System.out.println("\nWelk examen wil je maken?");
    //     System.out.println("Typ het corresponderende nummer.");

    //     int verwijzing = scanner.nextInt();
    //     scanner.nextLine();

    //     while (verwijzing != 1 && verwijzing != 2) {

    //         System.out.println("Onjuiste invoer. Probeer nogmaals.\n");

    //         printExamens();
    //         verwijzing = scanner.nextInt();
    //         scanner.nextLine();

    //     }

    //     if(verwijzing == 1){


    //     }

    //     if(verwijzing == 2){
    //         System.out.println("Verkeersexamen()");
    //     }

    // }
}


