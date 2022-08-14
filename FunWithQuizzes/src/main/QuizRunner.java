package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion(
                "How many legs has Micho? \nA: 4\nB: 3\nC: 2\nD: 1", "A");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion(
                "What is Micho's hair color? \nA: Black\nB: Orange\nC:Pink\nD:White", "B, D");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion(
                "Is Micho a Dog?", "false");
        myQuiz.addQuestion(myTrueFalseQuestion);


        myQuiz.runQuiz();

    }
}
