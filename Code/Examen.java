import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Examen{

    //instace variables
    private String naam;
    // waar komt deze naam vandaan? wordt die hier ingevoerd?


    private final static ArrayList<Examen> examens = new ArrayList<Examen>(); // javaExamen & verkeersExamen
    private final ArrayList<String> vragen = new ArrayList<String>();
    private final ArrayList<Examen> antwoorden = new ArrayList<Examen>();

    public static final String [] examen123 = new String[]{"javaExamen","verkeersExamen"};



    //constructor
    public Examen (String naam){
        this.naam = naam;
        examens.add(this);

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("welk examen wil je maken? 0 = java Examen 1= verkeers Examen");
        // int antwoord = scanner.nextInt();

        // if (antwoord.("")){
        //    System.out.println("antwoord 0 gekozen > javaExamen start");
        // }

        // if (antwoord == 1){
        //     System.out.println("antwoord 1 gekozen > verkeersExamen start");
        // }


    }

    public String getNaam(){
        return this.naam;
    }

/*
    //getters
    public ArrayList<Examen> getExamen(){
        return this.examen;
    }

    public ArrayList<Examen> getVragen(){
       return this.vragen;
    }

    public ArrayList<Examen> getAntwoorden(){
        return this.antwoorden;
    }



    //instance methods
    public void showExamens(){
        System.out.println("showExamens() called");

         // code....
    }
*/
}


