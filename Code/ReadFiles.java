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

    //test fabian voor antwoorden en vragen in 1 .txt uitlezen
  public static void readJavaQandA() throws FileNotFoundException{
        try {
            File file = new File("javaAnswersAndQuestions.txt");
            String f = file.getAbsolutePath();
            Scanner scanner = new Scanner(new File(f));

            while (scanner.hasNextLine()) {
                String[] split = scanner.nextLine().split(";");
                //split[0] = alles voor ;
                //split[1] =
                String vraag = split[0];
                String antwoord = split[1];

                Exam java = new Exam("java");
                java.addAssignment(vraag, antwoord);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // public static void readStudenten() throws FileNotFoundException{
    //     Scanner scanner = new Scanner(new File("Studenten.txt"));
    //     int nummer;
    //     String naam;
    //     while(scanner.hasNextLine()){
    //         scanner.useDelimiter(",");
    //         nummer = scanner.nextInt();
    //         naam = scanner.next();
    //         // class Student en arraylist studenten moeten nog worden aangemaakt
    //         new Student(nummer,naam);
    //     }
    // }
}
