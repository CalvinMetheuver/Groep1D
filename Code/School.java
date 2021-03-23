import java.util.ArrayList;
import java.util.Scanner;

class School {
    private static ArrayList <Student> studenten = new ArrayList<Student>();

    public static void addStudent(int number, String name)
    {
        studenten.add(new Student(number, name));

    }

    public static void showStudents()
    {
        for(Student student: studenten){
            System.out.println(student.getName() + " " + student.getStudentcode());
        }
    }

    public static void deleteStudents()
    {


        System.out.println("Voer de studentcode in van de student die u wilt verwijderen.");
        Scanner scanner = new Scanner(System.in);
        int deleteStudentcode = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < studenten.size(); i++) {
            if (deleteStudentcode == studenten.get(i).getStudentcode()) {
                studenten.remove(i);
                System.out.println("Student succesvol verwijderd: ");
            }
        }
        showStudents();
    }
}
