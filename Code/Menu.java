import java.util.Scanner;

class Menu {

    public void getMenu(){

        System.out.println("1) Lijst met examens");
        System.out.println("2) Lijst met studenten");
        System.out.println("3) Nieuwe student inschrijven");
        System.out.println("4) Student verwijderen");
        System.out.println("5) Examen afnemen");
        System.out.println("6) Is student geslaagd voor test?");
        System.out.println("7) Welke examens heeft student gehaald");
        System.out.println("8) Welke student heeft de meeste examens gehaald?");
        System.out.println("0) exit");
        System.out.print("Uw keuze:");

        // Keuze van het menu wordt hier afgehandeld
        Scanner scanner = new Scanner(System.in);
        Integer keuze = scanner.nextInt();
      
        while(keuze > 8){
            System.out.print("Maak uw keuze:");
            keuze = scanner.nextInt();
          }
          System.out.println();
          switch (keuze) {
            case 1:
                Examen.addExamen("Java examen");
                Examen.addExamen("Verkeers examen");
                Examen.printExamens();
              break;
            case 2:
                System.out.println("Tuesday");
              break;
            case 3:
                System.out.println("Wednesday");
              break;
            case 4:
                System.out.println("Thursday");
              break;
            case 5:
              System.out.println("Friday");
              break;
            case 6:
              System.out.println("Saturday");
              break;
            case 7:
              System.out.println("Sunday");
              break;
        }
        scanner.close();
    }
}
