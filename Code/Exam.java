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
        int good = 0;

        for (Assignment qa: this.assignment){
            System.out.println(qa.getQuestion());
            String answer = scanner.nextLine().toLowerCase();
            if(answer.equals(qa.getAnswer())){
                good++;
            }
        }
        System.out.println(good);
    }

    public static void printExams(){
        for (Exam exam: exams){
            System.out.println(exam.getName());
        }
    }

    public static int verwijzingExamens() {
        Scanner invoer = new Scanner(System.in);

        printExams();

         System.out.println("\nWelk examen wil je maken?");
         System.out.println("Typ het corresponderende nummer.");

         int verwijzing = invoer.nextInt();
         invoer.nextLine();

         while (verwijzing != 1 && verwijzing != 2) {

             System.out.println("Onjuiste invoer. Probeer nogmaals.\n");

             printExams();
             verwijzing = invoer.nextInt();
             invoer.nextLine();

         }
         return verwijzing;

         /*
         if(verwijzing == 1){

         }

         if(verwijzing == 2){

         }

          */

    }
}


