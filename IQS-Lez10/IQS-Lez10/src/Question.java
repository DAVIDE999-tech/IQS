public class Question {
    private String text; // Il testo della domanda (comando)
    private String answer; // La risposta corretta

    public Question() {
        text = ""; // Non è null ma è la stringa vuota
        answer = "";
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String response) {
        return answer.toLowerCase().equals(response.toLowerCase());

        /*if (response != null) {
            return response.equals(answer); // Mai fare response == equals
        }
        return false;*/
    }

    public void display() {
        System.out.println("La domanda alla quale devi rispondere è la seguente:");
        System.out.println(text);
    }
}
