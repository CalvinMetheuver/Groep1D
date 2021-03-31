import java.util.ArrayList;
import java.util.Scanner;

class Student {
    //Instance Variables
    private ArrayList <Make> attempts = new ArrayList<Make>();
    private Integer studentcode;
    private String name;
    private School school;

    //Constructor
    public Student(Integer studentcode, String name, School school)
    {
        this.studentcode = studentcode;
        this.name = name;
        this.school = school;
    }

    public School getSchool(){
        return this.school;
    }

    public ArrayList <Make> getAttempts(){ return attempts;}

    public Integer getStudentCode() {
        return studentcode;
    }

    public String getName() {
        return name;
    }

    public void addAttempt(int examNumber){
        Make make = new Make(this, school.getExams().get(examNumber));
        // checken of de combinatie al bestaat// student en examen
        boolean exists = false;
        if(!attempts.isEmpty()){
            for(Make attempt : attempts){
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

    public Make getAttempt(int exam){

        for(Make attempt : attempts){
            if(school.getExams().get(exam) == attempt.getExam() && attempt.getStudent() == this){
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
