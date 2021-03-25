class Make {
    private boolean passed;
    private Exam exam;
    private Student student;

    public Make(Student student, Exam exam){
        this.student = student;
        this.exam = exam;
        this.passed = false;
    }
    
    public void takeExam(){
        if(this.exam.takeExam()){
            passed = true;
        }
    }

    public Student getStudent(){
        return this.student;
    }

    public Exam getExam(){
        return this.exam;
    }

    public Boolean getPassed(){
        return passed;
    }
}
