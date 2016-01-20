package QuizCardBuilder;

/**
 * Created by runyyf on 2016-01-20.
 */
public class QuizCard {
    public String question;
    public String answer;

    public QuizCard(String qus,String ans){
        question = qus ;
        answer   = ans ;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
