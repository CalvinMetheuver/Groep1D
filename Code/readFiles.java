import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//functies voor het uitlezen van de opgeslagen data

class ReadFiles {
    
    public static void readExamens() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("Examens.txt"));

        while(scanner.hasNextLine()){
            //class Examen en arraylist examens moeten nog worden aangemaakt
            Examen examen = new Examen(scanner.nextLine());
            Examen.examens.add(examen);
        }
    }

    public static void readStudenten() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("Studenten.txt"));
        int nummer;
        String naam;
        while(scanner.hasNextLine()){
            scanner.useDelimiter(",");
            nummer = scanner.nextInt();
            naam = scanner.next();
            // class Student en arraylist studenten moeten nog worden aangemaakt
            Student student = new Student(nummer,naam);
            Student.studenten.add(student);
        }
    }
}
