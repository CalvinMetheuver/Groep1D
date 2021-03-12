import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//functies voor het uitlezen van de opgeslagen data

class ReadFiles {
    
    // Array vullen met examen namen
    public static void readExamens() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("Examen.txt"));

        while(scanner.hasNextLine()){
            new Examen(scanner.nextLine());
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
