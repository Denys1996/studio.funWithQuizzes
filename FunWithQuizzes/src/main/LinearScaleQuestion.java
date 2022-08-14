package main;

public class LinearScaleQuestion extends Question{
    //Class Variable
    private int lowValue;
    private int highValue;

    //Constructor
    public LinearScaleQuestion(String question, int lowValue, int highValue) {
        super(question, null);
        this.lowValue = lowValue;
        this.highValue = highValue;
    }

    //Methods
    @Override
    public boolean checkAnswer(String answer) {
        int answerAsInt = Integer.parseInt(answer);
        if(answerAsInt >= lowValue && answerAsInt <= highValue) {
            return true;
        } else {
            return false;
        }
    }
}
