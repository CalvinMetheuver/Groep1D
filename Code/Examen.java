import java.util.ArrayList;
import java.util.Scanner;



public class Examen {
    Scanner scanner = new Scanner(System.in);

    //instace variables
    private String naam;

    private final static ArrayList<Examen> examens = new ArrayList<Examen>(); // javaExamen & verkeersExamen
    private final static ArrayList<String> javaVragen = new ArrayList<String>();
    private final static ArrayList<String> javaAntwoorden = new ArrayList<String>();

    //constructor
    public Examen(String naam) {
        this.naam = naam;
        examens.add(this);
    }




    //Examen toevoegen en printen

    //public static final String[] examen123 = new String[]{"javaExamen", "verkeersExamen"};

    public static ArrayList<String> namenExamens = new ArrayList<String>();

    public static void addExamen(String item) {
        namenExamens.add(item);
    }

    public static void printExamens() {
        System.out.println("printExamens() called");
        System.out.println("Je hebt " + namenExamens.size() + " examens.");
        for (int i = 0; i < namenExamens.size(); i++) {
            System.out.println((i + 1) + ". " + namenExamens.get(i));
        }
    }
    //Examen toevoegen en printen eind






    //START VAN JAVA EXAMEN IF LOOP

    public static void addJavaVraag(String vraag){
        javaVragen.add(vraag);
    }
    public void addJavaAntwoord(String antwoord){
        antwoord.toLowerCase();
        if ((antwoord.equals("a")) || (antwoord.equals("b")) ||(antwoord.equals("c")) || (antwoord.equals("d"))) {
            javaAntwoorden.add(antwoord);
        }
        else {
            System.out.println("Onjuiste invoer door programmeur in addAntwoord");
        }
    }


    public int javaExamen() {

        addJavaVraag("\nVraag 1. \nHoe vermenigvuldig je iets in Java? \nDoor gebruik te maken van: \nA) ' \nB) *\nC) **\nD) .");
        addJavaAntwoord("b");

        addJavaVraag("\nVraag 2. \nHoe vermenigvuldig je iets in Java? \nDoor gebruik te maken van: \nA) ' \nB) *\nC) **\nD) .");
        addJavaAntwoord("b");

        addJavaVraag("\nVraag 3. \nHoe vermenigvuldig je iets in Java? \nDoor gebruik te maken van: \nA) ' \nB) *\nC) **\nD) .");
        addJavaAntwoord("b");



        String antwoord;  //var voor de antwoorden die de student geeft
        int goed = 0;   //var voor het aantal vragen goed

        System.out.println("U heeft voor het Java examen gekozen.\nHet examen bestaat uit 9 meerkeuzevragen, u dient te antwoorden met a,b,c of d.\nHet Java examen gaat nu van start.");  //Verheldering van het examen dat wordt gemaakt

        for (int i = 0; i < javaVragen.size(); i++) {                  //for loop om alle vragen te stellen
            System.out.println(javaVragen.get(i));                     //de vragen opvragen van de arraylist
            System.out.print("Vul hier uw antwoord in: ");
            antwoord = scanner.nextLine().toLowerCase();                          //student geeft hier antwoord

            if ((antwoord.equals("a")) || (antwoord.equals("b")) ||(antwoord.equals("c")) || (antwoord.equals("d"))) {
                if (antwoord.equals(javaAntwoorden.get(i))) {
                    goed++;
                }
            }
            else {
                System.out.println("Onjuiste invoer. Vul a, b, c of d in.");
                // hier opnieuw de vraag vragen
            }
        }

        int cijfer = 1 + goed;


        System.out.println("U heeft " + goed + " antwoorden van de " + javaVragen.size() +  " goed.\n Daarmee komt uw cijfer uit op een: " + cijfer);
        return cijfer;
    }

    //EIND VAN JAVA EXAMEN IF LOOP



/*
    public int verkeersExamen() {

        char antwoord;  //var voor de antwoorden die de student geeft
        int goed = 0;   //var voor het aantal vragen goed

        System.out.println("U heeft voor het Verkeersexamen gekozen.\nHet examen bestaat uit 9 meerkeuzevragen, u dient te antwoorden met a,b,c of d.\nHet Verkeersexamen gaat nu van start.");  //Verheldering van het examen dat wordt gemaakt

        for (int i = 0; i < 9; i++) {                  //for loop om alle vragen te stellen
            vragen.get(i);                      //de vragen opvragen van de arraylist
            antwoord = scanner.nextChar();      //student geeft hier antwoord
            if (antwoord == antwoord.get(i)) {
                goed++;
            }

        }

        int cijfer = 1 + goed;


        System.out.println("U heeft " + goed + " antwoorden van de 9 goed.\n Daarmee komt uw score uit op een: " + cijfer);
        return cijfer;
    }

 */




}


