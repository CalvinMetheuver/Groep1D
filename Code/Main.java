import java.io.FileNotFoundException;

class Main{




    public static void main(String[] args) throws FileNotFoundException{


        //Exam hardcoded
        Exam java = new Exam("java");
        Exam algemeneKennis = new Exam("algemeneKennis");
        java.addAssignment("hey hoi", "B");
        java.addAssignment("hey dsaf", "B");
        java.addAssignment("hey h3232oi", "B");

        algemeneKennis.addAssignment("kut kennis", "K");
        algemeneKennis.addAssignment("kut 23423", "K");
        algemeneKennis.addAssignment("kut dfa33a", "K");
    //Exam hardcoded end



        // Arrays inlezen met de opgeslagen data uit een txt file
        //  ReadFiles.readExamens();
        //ReadFiles.readStudenten();
        
         Menu menu = new Menu();
         menu.getMenu();
    }
}