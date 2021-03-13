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


    //fabians nieuwe code BEGIN

    public static ArrayList<String> namenExamens = new ArrayList<String>();

    public static void addExamen(String item){
        namenExamens.add(item);
    }

    public static void printExamens(){
        System.out.println("printExamens() called");
        System.out.println("Je hebt " + namenExamens.size() + " examens.");
        for (int i = 0; i < namenExamens.size(); i++){
            System.out.println((i+1) + ". " +namenExamens.get(i));
        }
    }

    //fabians nieuwe code EIND


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
/*
import java.util.ArrayList;

public class NamenExamens {
}

import java.util.ArrayList;


public class NamenExamens{
    private ArrayList<String> namenExamens = new ArrayList<String>();


    public void addExamen(String item){
        namenExamens.add(item);
    }

    public void printExam(){
        System.out.println("Je hebt " + namenExamens.size() + " examens.");
        for (int i = 0; i < namenExamens.size(); i++){
            System.out.println((i+1) + ". " +namenExamens.get(i));
        }
    }

    public void modifyExam(int position, String newItem){
        namenExamens.set(position, newItem);
        System.out.println("Examen " + (position+1) + " is aangepast.");
    }

    public void removeExam(int position){
        String theExam = namenExamens.get(position);
        namenExamens.remove(position);
    }


    // "indexOf" geeft -1 terug als examen niet is gevonden
    public String findExam(String zoekExamen){//boolean exists = namenExamens.contains(zoekExamen);
        int position = namenExamens.indexOf(zoekExamen);
        if (position >= 0){
            return namenExamens.get(position);
        }
        return null;
    }
}



*/

