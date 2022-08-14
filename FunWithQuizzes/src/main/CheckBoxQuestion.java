package main;

public class CheckBoxQuestion extends Question{
    //Class Variables


    //Constructor
    public CheckBoxQuestion(String question, String answer) {
        super(question, answer);
    }

    //Methods
    @Override
    public boolean checkAnswer(String answer) {
        //answer: a, b, c
        String actualAnswer = this.getTheAnswer();
        //Case Insensitive
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
    //Getters
}
