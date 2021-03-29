import java.util.ArrayList;
import java.util.Scanner;

class Student {
    //Instance Variables
    private ArrayList <Make> attempts = new ArrayList<Make>();
    private Integer studentcode;
    private String name;

    //Constructor
    public Student(Integer studentcode, String name)
    {
        this.studentcode = studentcode;
        this.name = name;
    }

    public ArrayList getMake(){ return attempts;}

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
        if(!attempts.isEmpty()){
            for(Make attempt : attempts){
                System.out.println(make.getExam().getName());
                System.out.println(attempt.getExam().getName());
                if(!make.getExam().getName().equals(attempt.getExam().getName())){
                    exists = true;
                }
            }
        }else{
            attempts.add(make);
        }
        if(exists){
            attempts.add(make);
        }
    }

    public Make searchMake(int exam){

        for(Make attempt : attempts){
            if(Exam.getExams().get(exam) == attempt.getExam() && attempt.getStudent() == this){
                return attempt;
            }
        }
        return null;
    }

    public void showPassed(){
        if(!attempts.isEmpty()){
            for(Make make: attempts) {
                if (make.getPassed()) {
                    System.out.println(this.getName()+" is geslaagd voor "+make.getExam().getName()+" examen.");
                } else {
                    System.out.println(this.getName()+" is gezakt voor "+make.getExam().getName()+" examen.");
                }
            }
        } else {
            System.out.println(this.getName()+" heeft nog geen examens gemaakt.");
        }
    }

    public int getNumbersPassed(){
        int counter = 0;
        for(Make make: attempts){
            if (make.getPassed()){
                counter++;
            }
        }
        return counter;
    }
}
