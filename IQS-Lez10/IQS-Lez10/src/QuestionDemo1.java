import java.util.Scanner;

public class QuestionDemo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Question question = new Question();
        question.setText("Come si chiama l'inventore di Java?");
        question.setAnswer("James Gosling");

        question.display();
        System.out.print("Digita la tua risposta: ");

        String response = in.nextLine();
        System.out.println(question.checkAnswer(response));

        Question question1 = new Question();
        question1.setText("In che nazione è nato l'inventore di java?");
        question1.setAnswer("Canada");
        question1.display();
        System.out.print("Digita la tua risposta: ");

        response = in.nextLine();
        System.out.println(question1.checkAnswer(response));
    }
}
