class Make {
    private boolean passed;
    private Exam exam;
    private Student student;

    public Make(Student student, Exam exam){
        this.student = student;
        this.exam = exam;
    }
    
    public void takeExam(){

        for(Assignment assignment: this.exam.getAssignment()){
            System.out.println(assignment.getQuestion());
        }
    }

    public Student getStudent(){
        return this.student;
    }

    public Exam getExam(){
        return this.exam;
    }
}
