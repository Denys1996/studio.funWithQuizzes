package main;

public class TrueFalseQuestion extends Question{

        //Class Variables


        //Constructor
        public TrueFalseQuestion(String question, String answer) {
            super(question, answer);
        }

        //Methods
        @Override
        public boolean checkAnswer(String answer) {
            //answer: true or false
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

