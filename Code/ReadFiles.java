import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//functies voor het uitlezen van de opgeslagen data

class ReadFiles {

    // Array vullen met examen namen
    public static void readExamens(Menu menu) throws FileNotFoundException{

        File file = new File("Exams.txt");
        String f = file.getAbsolutePath();
        Scanner scanner = new Scanner(new File(f));

        while(scanner.hasNextLine()){
            menu.getSchool().addExam(scanner.nextLine());
        }
    }

    // Studenten ArrayList wordt gevult vanuit "Studenten.txt"
    public static void readStudenten(Menu menu) throws FileNotFoundException{
        File file = new File("Students.txt");
        String f = file.getAbsolutePath();
        Scanner scanner = new Scanner(new File(f));

        while (scanner.hasNextLine()) {
            //split [0] = de eerste var voor je komma (de "regex"), split [1] na de 1e ","
            String[] split = scanner.nextLine().split(",");
            String number = split[0];
            int code = Integer.parseInt(number);
            String name = split[1];
            menu.getSchool().addToStudentList(code, name);
        }
    }

    public static void readJavaQandA() throws FileNotFoundException{
        File file = new File("JavaExam.txt");
        String f = file.getAbsolutePath();
        Scanner scanner = new Scanner(new File(f));
        Exam java = Exam.getExams().get(0);

        while (scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split(";");
            //String question = split[0];
            String question = split[0] + "\n" + split[1] + "\n" + split[2] + "\n" + split[3]+ "\n" + split[4];
            String answer = split[5];

            java.addAssignment(question, answer);
        }
    }

    public static void readAlgemeneKennisQandA() throws FileNotFoundException{
        File file = new File("AlgemeneKennisExam.txt");
        String f = file.getAbsolutePath();
        Scanner scanner = new Scanner(new File(f));
        Exam algemeneKennis = Exam.getExams().get(1);

        while (scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split(";");
            //String question = split[0];
            String question = split[0] + "\n" + split[1] + "\n" + split[2] + "\n" + split[3]+ "\n" + split[4];
            String answer = split[5];

            algemeneKennis.addAssignment(question, answer);
        }
    }

}
