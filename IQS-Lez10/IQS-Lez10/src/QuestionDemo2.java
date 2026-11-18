import java.util.Scanner;

public class QuestionDemo2 {
    public static void main(String[] args) {
        ChoiceQuestion question = new ChoiceQuestion();
        question.setText("Come si chiama l'inventore di Java?");
        question.addChoice("Tim Barners Lee", false);
        question.addChoice("Luigi Patrono", false);
        question.addChoice("James Gosling", true);
        question.addChoice("Barbara Liskov", false);

        ChoiceQuestion question1 = new ChoiceQuestion();
        question1.setText("In che nazione è nato l'inventore di Java?");
        question1.addChoice("Italia", false);
        question1.addChoice("USA", false);
        question1.addChoice("Francia", false);
        question1.addChoice("Canada", true);

        presentQuestion(question);
        presentQuestion(question1);
    }

    private static void presentQuestion(ChoiceQuestion choiceQuestion) {
        Scanner in = new Scanner(System.in);

        choiceQuestion.display();
        System.out.print("Digita il numero della risposta esatta: ");

        String response = in.nextLine();
        System.out.println(choiceQuestion.checkAnswer(response));
    }
}
