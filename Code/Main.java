import java.io.FileNotFoundException;

class Main{




    public static void main(String[] args) throws FileNotFoundException{


        //Exam hardcoded
        Exam java = new Exam("java");
        Exam algemeneKennis = new Exam("algemeneKennis");
        java.addAssignment("\nVraag 1. \nHoe vermenigvuldig je iets in Java? \nDoor gebruik te maken van: \nA) ' \nB) *\nC) **\nD) ^", "b");
        java.addAssignment("\nVraag 2. \nHoe kan je getallen delen in Java? \nDoor gebruik te maken van: \nA) % \nB) *\nC) @\nD) /", "B");
        java.addAssignment("\nVraag 3. \nHoe vermenigvuldig je iets in Java? \nDoor gebruik te maken van: \nA) ' \nB) *\nC) **\nD) .", "B");

        algemeneKennis.addAssignment("kut kennis", "K");
        algemeneKennis.addAssignment("kut 23423", "K");
        algemeneKennis.addAssignment("kut dfa33a", "K");
        //Exam hardcoded end

        Exam.printArrayListJava();

        // Arrays inlezen met de opgeslagen data uit een txt file
        //  ReadFiles.readExamens();
        //ReadFiles.readStudenten();
        
         Menu menu = new Menu();
         menu.getMenu();
    }
}