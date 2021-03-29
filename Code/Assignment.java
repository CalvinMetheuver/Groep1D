import java.util.Scanner;

class Assignment {
    private String question;
    private String answer;
    
    public Assignment(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion(){
        return this.question;
    }
    
    public String getAnswer(){
        return this.answer;
    }

    public Boolean takeAssignment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        String answer = scanner.nextLine().toLowerCase();
        while(!(answer.equals("a")) && !(answer.equals("b")) && !(answer.equals("c")) && !(answer.equals("d"))){
            System.out.println("Onjuiste invoer, voer a, b, c of d in.\nNieuw antwoord:\n");
            answer = scanner.nextLine().toLowerCase();
        }
        return checkAnswer(answer);
    }

    public boolean checkAnswer(String answer){
        return this.answer.equalsIgnoreCase(answer);
    }
}
