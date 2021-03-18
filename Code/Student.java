import java.util.ArrayList;

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
        Studenten.add(this.studentcode);
    }

    public ArrayList<Student> showStudenten()
    {
        return Studenten;
    }

    public void deleteStudenten()
    {
        Studenten.remove(this.studentcode);
    }
}
