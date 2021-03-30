import java.io.IOException;

class Main{

    public static void main(String[] args) throws IOException{
        School haagse = new School();
        Menu menu = new Menu(haagse);

        // Arrays inlezen met de opgeslagen data uit een txt file
        ReadFiles.readExamens(menu);
        ReadFiles.readStudenten(menu);
        ReadFiles.readJavaQandA(menu);
        ReadFiles.readAlgemeneKennisQandA(menu);
        menu.getMenu();
 
    }
}