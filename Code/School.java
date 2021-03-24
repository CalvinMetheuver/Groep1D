import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class School {
    
    private static ArrayList <Student> students = new ArrayList<Student>();
    
    public static void showStudents(){
        int counter = 1;
        for(Student student: students){
            System.out.println(counter+": "+student.getStudentCode() + " " + student.getName());
            counter++;
        }
    }

    public static void addToStudentList(int number, String name)
    {
        students.add(new Student(number, name));
    }

    public static Student getStudent(int studentcode){
        return students.get(studentcode);
    }

    public static void showExams(){
        int counter = 1;
        for (Exam exam: Exam.getExams()){
            System.out.println(counter+": "+exam.getName());
            counter++;
        }
    } 

    public static void addStudent() throws IOException{
        
        // file initialiseren
        File file = new File("Students.txt");
        String f = file.getAbsolutePath();
        FileWriter fw = new FileWriter(f,true);
        
        //printwriter voor het naartoe schrijven van studenten
        PrintWriter pw = new PrintWriter(fw);
        Scanner scanner = new  Scanner(System.in); 

        // studentcode laten invullen
        System.out.print("Vul een studentcode in: ");
        int code = scanner.nextInt();

        for(Student student : students){
            while(code == student.getStudentCode()){
                System.out.print("Vul een andere studentcode in: ");
                code = scanner.nextInt();
            }
        }
        scanner.nextLine();

        // naam laten invullen
        System.out.print("Vul een naam in: ");
        String naam = scanner.nextLine();
        System.out.println();

        // de ingevulde student toevoegen aan de txt file en de array
        addToStudentList(code, naam);
        pw.println(code+","+naam);
        pw.close();
        scanner.close();
    }

    public static void deleteStudent() throws IOException
    {
        // file initialiseren
        File file = new File("Students.txt");
        String f = file.getAbsolutePath();
        Scanner sc = new Scanner(new File(f));
        FileWriter fw = new FileWriter(f,false);
        
        //printwriter voor het naartoe schrijven van studenten
        PrintWriter pw = new PrintWriter(fw);
        Scanner scanner = new  Scanner(System.in); 
        
        
        // Student wordt verwijderd 
        // Als het nummer niet bestaat wordt er door gevraagd
        boolean bool = false;
        while(!bool){
            System.out.print("Vul een studentcode in: ");
            int code = scanner.nextInt();

            for(int i = 0; i < students.size(); i++){
                if(code == students.get(i).getStudentCode()){
                    bool = true;
                    students.remove(i);
                }
            }
        }

        // Arraylist met studenten wordt naar de txt file geschreven
        for(Student s : students){
            pw.println(s.getStudentCode()+","+s.getName());
        }
        
        pw.close();
        sc.close();
        scanner.close();
        System.out.println("\nStudent is verwijderd!");
    }
}
