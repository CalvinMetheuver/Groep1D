import java.io.IOException;

class Main{

    public static void main(String[] args) throws IOException{

        Menu menu = new Menu(new School());

        // Arrays inlezen met de opgeslagen data uit een txt file
        ReadFiles.readExamens(menu);
        ReadFiles.readStudenten(menu);
        ReadFiles.readJavaQandA();
        ReadFiles.readAlgemeneKennisQandA();
        menu.getMenu();
 
    }
}