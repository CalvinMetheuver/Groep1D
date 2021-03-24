import java.util.ArrayList;

class Student {
    //Instance Variables
    private ArrayList <Make> make = new ArrayList<Make>();
    private Integer studentcode;
    private String name;

    //Constructor
    public Student(Integer studentcode, String name)
    {
        this.studentcode = studentcode;
        this.name = name;
    }

    public Integer getStudentcode() {
        return studentcode;
    }

    public String getName() {
        return name;
    }

    public void addMake(Exam exam){
        make.add(new Make(this,exam));
    }

    public Make getMake(){
        for(Make m : make){
            return m;
        }
        return null;
    }
}
