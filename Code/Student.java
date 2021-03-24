import java.util.ArrayList;

class Student {
    //Instance Variables
    public ArrayList <Make> attempts = new ArrayList<Make>();
    private Integer studentcode;
    private String name;

    //Constructor
    public Student(Integer studentcode, String name)
    {
        this.studentcode = studentcode;
        this.name = name;
    }

    public Integer getStudentCode() {
        return studentcode;
    }

    public String getName() {
        return name;
    }

    public void addMake(Exam exam){
        attempts.add(new Make(this,exam));
    }

    public Make getMake(int student, int exam){

        for(Make m : attempts){
            if(Exam.getExams().get(exam) == m.getExam() && m.getStudent() == this){
                return m;
            } 
        }
        return null;
    }

    
}
