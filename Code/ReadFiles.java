import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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

    // leest 2 aparte bestanden in
    public static void readJava() throws FileNotFoundException{

        File file = new File("javaQuestions.txt");
        String f = file.getAbsolutePath();
        Scanner scanner = new Scanner(new File(f));

        File file1 = new File("javaAnswers.txt");
        String f1 = file1.getAbsolutePath();
        Scanner scanner1 = new Scanner(new File(f1));

        while(scanner.hasNextLine()){
            String javaQuestions = scanner.nextLine();
            String javaAnswers = scanner1.nextLine();

            // Exam java = new Exam("java");
            new Assignment(javaQuestions, javaAnswers);
            // java.printAssignments();
        }
    }

    /*
    leest alleen javavragen in,zodat ik het in de main als parameter kon meegeven,

    werkt niet want elke keer als het object word aangeroepen print het dezelfde line.
    ik had het zo in de main gezet:
    java = var van Exam
    java.addAssignment(ReadFiles.readJavaQuestions(), ReadFiles.readJavaAnswers());
    */

    public static String readJavaQuestions() throws FileNotFoundException{
        try {
            File file = new File("javaQuestions.txt");
            String f = file.getAbsolutePath();
            Scanner scanner = new Scanner(new File(f));

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
                return scanner.nextLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    // zelfde als hierboven
    public static String readJavaAnswers() throws FileNotFoundException{
        try {
        File file = new File("javaAnswers.txt");
        String f = file.getAbsolutePath();
        Scanner scanner = new Scanner(new File(f));

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
                return scanner.nextLine();
            }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
        }
        return null;
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
