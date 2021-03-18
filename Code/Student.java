import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Student {
    //Instance Variables
    private final Integer studentcode;
    private final String naam;
    private ArrayList <Student> Studenten = new ArrayList<Student>();
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

    public void addStudent() //Volgens mij moeten we hier Student Student meegeven maar staat niet in diagram
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is de studentcode van de student");
        studentcode= scanner.nextInt();
        System.out.println("Wat is de naam van de student?");
        naam= scanner.nextLine();
        Studenten.add(new Student(studentcode, naam));
        System.out.println("Student is toegevoegd");
    }

    public ArrayList<Student> showStudenten()
    {
        return Studenten;
    }

    public void deleteStudenten()//IllegalStateException error
    {
        Iterator<Student> itr = Studenten.iterator();
        Studenten.add(new Student(12, "Jam"));
        System.out.println("Voer de studentcode in van de student die u wilt verwijderen.");
        Scanner scanner = new Scanner(System.in);
        Integer deleteStudentcode = scanner.nextInt();
            for (Student item : Studenten) {
                if (deleteStudentcode.equals(item.studentcode)) {
                    itr.remove();
                    System.out.println("Student succesvol verwijderd");
                    System.out.println(Arrays.toString(Studenten.toArray()));
    }
}
