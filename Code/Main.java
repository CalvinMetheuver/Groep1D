import java.io.FileNotFoundException;

class Main{
    
    public static void main(String[] args) throws FileNotFoundException{
        
        // Arrays inlezen met de opgeslagen data uit een txt file
        ReadFiles.readExamens();
        //ReadFiles.readStudenten();
        
        Menu menu = new Menu();
        menu.getMenu();
    }
}