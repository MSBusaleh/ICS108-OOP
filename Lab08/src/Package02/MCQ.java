package Package02;
import Package01.Question;

import java.sql.Array;
import java.util.Arrays;

public class MCQ extends Question {
    private String[] answers;
    private String RightAns;


    public MCQ(String text, String[] answers, String RightAns) {
        super(text);
        this.answers = answers;
        this.RightAns = RightAns;
    }

    @Override
    public String toString() {
        String output = super.toString();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};

        for(int i = 0; i<answers.length; i++){
            output += "\n" + alphabet[i] +". "+ answers[i];
        }

        output += "\nanswer: " + RightAns;
        return output;
    }
}
