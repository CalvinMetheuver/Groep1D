class Make {
    private boolean passed;
    private Exam exam;
    private int studentcode;
    private int examNumber;

    public Make(int studentcode, int examNumber){
        this.studentcode = studentcode;
        this.examNumber = examNumber;
    }

    //getStudent moet worden aangemaakt denk ik

    public void takeExam(){

        for(Assignment assignment: exam.getExams().get(examNumber).getAssignment()){
            System.out.println(assignment.getQuestion());
        }

    }

}
