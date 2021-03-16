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



    public static ArrayList<String> namenExamens = new ArrayList<String>();




    public static void addExamen(String item) {
        namenExamens.add(item);
    }
    public static void printExamens() {
        addExamen("Java examen");
        addExamen("Verkeers examen");

        System.out.println("printExamens() called");
        System.out.println("Je hebt " + namenExamens.size() + " examens:");
        for (int i = 0; i < namenExamens.size(); i++) {
            System.out.println((i + 1) + ". " + namenExamens.get(i));
        }

    }
    //Examen toevoegen en printen eind

    //verwijzing naar examen FOUT, JE KAN DE EERSTE VRAAG NIET TE BEANTWOORDEN

    public void verwijzingExamens() {
        System.out.println("Welk examen wil je maken?");
        printExamens();

        System.out.println("Typ nu je antwoord.");

        int verwijzing = scanner.nextInt();
        scanner.nextLine();

        while (verwijzing != 1 && verwijzing != 2) {

            System.out.println("Onjuiste invoer. Probeer nogmaals.\n");

            printExamens();
            verwijzing = scanner.nextInt();
            scanner.nextLine();

        }

        if(verwijzing == 1){

            javaExamen();
        }

        if(verwijzing == 2){
            System.out.println("Verkeersexamen()");
        }

    }






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


    public double javaExamen() {

        addJavaVraag("\nVraag 1. \nHoe vermenigvuldig je iets in Java? \nDoor gebruik te maken van: \nA) ' \nB) *\nC) **\nD) ^");
        addJavaAntwoord("b");

        addJavaVraag("\nVraag 2. \nHoe kan je getallen delen in Java? \nDoor gebruik te maken van: \nA) % \nB) *\nC) @\nD) /");
        addJavaAntwoord("b");

        addJavaVraag("\nVraag 3. \nHoe vermenigvuldig je iets in Java? \nDoor gebruik te maken van: \nA) ' \nB) *\nC) **\nD) .");
        addJavaAntwoord("b");



        String antwoord;  //var voor de antwoorden die de student geeft
        int goed = 0;   //var voor het aantal vragen goed

        System.out.println("U heeft voor het Java examen gekozen.\nHet examen bestaat uit "+ javaVragen.size() + " meerkeuzevragen, u dient te antwoorden met a,b,c of d.\nHet Java examen gaat nu van start.");  //Verheldering van het examen dat wordt gemaakt

        for (int i = 0; i < javaVragen.size(); i++) {                  //for loop om alle vragen te stellen
            System.out.println(javaVragen.get(i));                     //de vragen opvragen van de arraylist
            System.out.println("Vul hier uw antwoord in: ");
            antwoord = scanner.nextLine().toLowerCase();                          //student geeft hier antwoord

            while((!(antwoord.equals("a"))) && (!(antwoord.equals("b"))) && (!(antwoord.equals("c"))) && (!(antwoord.equals("d")))){
                System.out.println("Onjuiste invoer. Vul a, b, c of d in.");

                System.out.println(javaVragen.get(i));                     //de vragen opnieuw opvragen van de arraylist
                System.out.println("Vul hier uw antwoord in: ");
                antwoord = scanner.nextLine().toLowerCase();               //nogmaals antwoorden

            }

            if (antwoord.equals(javaAntwoorden.get(i))) {
                goed++;
            }
        }

        double cijfer = 1 + 9/javaVragen.size()*goed;


        System.out.println(String.format("\nU heeft " + goed + " antwoorden van de " + javaVragen.size() +  " goed.\n Daarmee komt uw cijfer uit op een: %.1f\n", cijfer));
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


