import java.util.ArrayList;
import java.util.Scanner;

class Made {
    private boolean passed;
    private Exam exam;
   
    public void takeExam(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is de studentcode");
        String studentcode= scanner.nextLine();
        System.out.println("welk examen wilt de student maken");

        String test= scanner.nextLine();
        for(Assignment assignment: exam.getAssignment()){

        }
        scanner.nextLine();


    }
}
