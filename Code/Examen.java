import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;



public class Examen{

    //instace variables
    private String naam;
    // waar komt deze naam vandaan? wordt die hier ingevoerd?


    private final static ArrayList<Examen> examens = new ArrayList<Examen>(); // javaExamen & verkeersExamen
    private final ArrayList<String> vragen = new ArrayList<String>();
    private final ArrayList<char> antwoorden = new ArrayList<char>();

    public static final String [] examen123 = new String[]{"javaExamen","verkeersExamen"};

    Scanner scanner = new Scanner(System.in);

    vragen.add("Hoe vermenigvuldig je iets in Java?\nDoor gebruik te maken van:\nA) '\nB) *\nC) **\nD) /");

    
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

        

        // System.out.println("welk examen wil je maken? 0 = java Examen 1= verkeers Examen");
        // int antwoord = scanner.nextInt();

        // if (antwoord.("")){
        //    System.out.println("antwoord 0 gekozen > javaExamen start");
        // }

        // if (antwoord == 1){
        //     System.out.println("antwoord 1 gekozen > verkeersExamen start");
        // }


    }

    //Vullen van de vragen en antwoorden


    public String getNaam(){
        return this.naam;
    }

    public int javaExamen(){

        char antwoord;  //var voor de antwoorden die de student geeft
        int goed = 0;   //var voor het aantal vragen goed

        Sytem.out.println("U heeft voor het Javaexamen gekozen.\nHet examen bestaat uit 9 meerkeuzevragen, u dient te antwoorden met a,b,c of d.\nHet Javaexamen gaat nu van start.");  //Verheldering van het examen dat wordt gemaakt

        for(int i=0; i<9;i++){                  //for loop om alle vragen te stellen
            vragen.get(i);                      //de vragen opvragen van de arraylist
            antwoord = scanner.nextChar();      //student geeft hier antwoord
            if(antwoord == antwoord.get(i)){    
                goed++;
            }
                
        }

        int cijfer = 1+goed;

        
        System.out.println("U heeft " + goed + " antwoorden van de 9 goed.\n Daarmee komt uw score uit op een: "+ cijfer)
        return cijfer;
    }

    public int verkeersExamen(){

        char antwoord;  //var voor de antwoorden die de student geeft
        int goed = 0;   //var voor het aantal vragen goed

        Sytem.out.println("U heeft voor het Verkeersexamen gekozen.\nHet examen bestaat uit 9 meerkeuzevragen, u dient te antwoorden met a,b,c of d.\nHet Verkeersexamen gaat nu van start.");  //Verheldering van het examen dat wordt gemaakt

        for(int i=0; i<9;i++){                  //for loop om alle vragen te stellen
            vragen.get(i);                      //de vragen opvragen van de arraylist
            antwoord = scanner.nextChar();      //student geeft hier antwoord
            if(antwoord == antwoord.get(i)){    
                goed++;
            }
                
        }

        int cijfer = 1+goed;

        
        System.out.println("U heeft " + goed + " antwoorden van de 9 goed.\n Daarmee komt uw score uit op een: "+ cijfer)
        return cijfer;
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

