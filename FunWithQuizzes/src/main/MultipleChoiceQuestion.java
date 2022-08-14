package main;

public class MultipleChoiceQuestion extends Question {

    //Class Variable


    //Constructor
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        //answer = "A" or "B"
        String actualAnswer = this.getTheAnswer();
        //Case Insensitive
        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}