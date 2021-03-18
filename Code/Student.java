class Student {
    //Instance Variables
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

    public void setStudentcode(Integer studentcode) {
        this.studentcode = studentcode;
    }

    public String getName() {
        return name;
    }
}
