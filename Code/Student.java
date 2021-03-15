import java.util.ArrayList;

public class Student {
    private final Integer studentcode;
    private final String naam;
    private ArrayList <Student> Studenten = new ArrayList<Student>();
    private Integer exBehaald;
    private ArrayList <Examen> maakt;

    public Student(Integer studentcode, String naam)
        {
            this.studentcode = studentcode;
            this.naam = naam;
            Studenten.add(this);
        }
public String getNaam()
{
    return naam;
}

public void addStudent(Student Student) //Volgens mij moeten we hier Student Student meegeven maar staat niet in diagram
{
    Studenten.add(Student);
}

public ArrayList<Student> showStudenten()
{
    return Studenten;
}

public void deleteStudenten()
{
//? test test
}
    }
