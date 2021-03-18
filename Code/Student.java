import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Student {
    //Instance Variables
    private Integer studentcode;
    private String naam;
    private static ArrayList <Student> Studenten = new ArrayList<Student>();
    private Integer exBehaald = 0;
    private ArrayList <Examen> maakt;// moet dit niet weg, want er is al een getExamens?

    //Constructor
    public Student(Integer studentcode, String naam)
    {
        this.studentcode = studentcode;
        this.naam = naam;
        Studenten.add(this);
    }

    //Instance Methods
    public String getNaam()
    {
        return this.naam;
    }

    public Integer getStudentCode()
    {
        return this.studentcode;
    }

    public static void addStudent()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is de studentcode van de student");
        int studentnummer= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wat is de naam van de student?");
        String studentnaam= scanner.nextLine();
        Studenten.add(new Student(studentnummer, studentnaam));
        System.out.println("Student is toegevoegd");
    }

    public static void showStudenten()
    {
        for(Student student: Studenten){
            System.out.println(student.getNaam() + " " + student.getStudentCode());
        }
    }

    public static void deleteStudenten()
    {

        showStudenten();
        System.out.println("Voer de studentcode in van de student die u wilt verwijderen.");
        Scanner scanner = new Scanner(System.in);
        int deleteStudentcode = scanner.nextInt();
        for (int i = 0; i<Studenten.size(); i++) {
            if (deleteStudentcode == Studenten.get(i).getStudentCode()) {
                Studenten.remove(i);
                System.out.println("Student succesvol verwijderd: ");
            }
        }
        showStudenten();
    }
}
