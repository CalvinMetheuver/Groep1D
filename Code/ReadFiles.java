import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//functies voor het uitlezen van de opgeslagen data

class ReadFiles {

    // Array vullen met examen namen
    public static void readExamens() throws FileNotFoundException{

        File file = new File("Examen.txt");
        String f = file.getAbsolutePath();
        Scanner scanner = new Scanner(new File(f));

        while(scanner.hasNextLine()){
            new Exam(scanner.nextLine());
        }
    }


    public static void readJavaQandA() throws FileNotFoundException{
        File file = new File("javaAnswersAndQuestions.txt");
        String f = file.getAbsolutePath();
        Scanner scanner = new Scanner(new File(f));

        while (scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split(";");
            String question = split[0];
            String answer = split[1];

            Exam java = new Exam("java");
            java.addAssignment(question, answer);
        }
    }

    // Studenten ArrayList wordt gevult vanuit "Studenten.txt"
    public static void readStudenten() throws FileNotFoundException{
        File file = new File("Studenten.txt");
        String f = file.getAbsolutePath();
        Scanner scanner = new Scanner(new File(f));

        while (scanner.hasNextLine()) {
            //split [0] = de eerste var voor je komma (de "regex"), split [1] na de 1e ","
            String[] split = scanner.nextLine().split(",");
            String number = split[0];
            int code = Integer.parseInt(number);
            String name = split[1];
            School.addStudent(code, name);
        }
    }



//
//     public static void readStudenten() throws FileNotFoundException{
//         File file = new File("Studenten.txt");
//         String f = file.getAbsolutePath();
//         Scanner scanner = new Scanner(new File(f));
//         int number;
//         String name;
//         while(scanner.hasNextLine()){
//             scanner.useDelimiter(",");
//             number = scanner.nextInt();
//             name = scanner.next();
//              School.addStudent(number,name);
//         }
//     }

}
