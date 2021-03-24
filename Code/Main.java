import java.io.IOException;

class Main{

    public static void main(String[] args) throws IOException{

        // Arrays inlezen met de opgeslagen data uit een txt file
        ReadFiles.readExamens();
        ReadFiles.readStudenten();
        ReadFiles.readJavaQandA();

        Menu menu = new Menu();
        menu.getMenu();
 
    }
}