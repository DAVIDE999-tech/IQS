import java.util.Scanner;

public class QuestionDemo3 {
    public static void main(String[] args) {
        Question question = new Question();
        question.setText("Come si chiama l'inventore di Java?");
        question.setAnswer("James Gosling");

        ChoiceQuestion question1 = new ChoiceQuestion();
        question1.setText("In che nazione è nato l'inventore di Java?");
        question1.addChoice("Italia", false);
        question1.addChoice("USA", false);
        question1.addChoice("Francia", false);
        question1.addChoice("Canada", true);

        presentQuestion(question); // Stesso codice due comportamenti differenti
        presentQuestion(question1); // Stesso codice due comportamenti differenti
    }

    private static void presentQuestion(Question question) {
        Scanner in = new Scanner(System.in);

        question.display(); // Quale istanza di display viene chiamata?
        System.out.print("Digita la tua risposta: ");

        String response = in.nextLine();
        System.out.println(question.checkAnswer(response));
    }
}
