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

    public void addMake(int examNumber){
        Make make = new Make(this, Exam.getExams().get(examNumber));

        // checken of de combinatie al bestaat// student en examen
        boolean exists = false;
        for(Make attempt : attempts){
            if(make.getExam() != attempt.getExam()){
                exists = true;
            }
        }

        if(exists){
            attempts.add(make);
        }

        System.out.println(attempts);
    }

    public Make getMake(int student, int exam){

        for(Make attempt : attempts){
            if(Exam.getExams().get(exam) == attempt.getExam() && attempt.getStudent() == this){
                return attempt;
            }
        }
        return null;
    }
}
