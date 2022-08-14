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

        ShortAnswerQuestion myShortAnswerQuestion = new ShortAnswerQuestion(
                "What is Micho favorite toy?","spiders");
        myQuiz.addQuestion(myShortAnswerQuestion);

        LinearScaleQuestion myLinearScaleQuestion = new LinearScaleQuestion(
                "On a scale from 1 to 10 how cute is Micho?", 8, 10);
        myQuiz.addQuestion(myLinearScaleQuestion);

        ParagraphQuestion myParagraphQuestion = new ParagraphQuestion(
                "Tell me why Micho is so cool?", "Because he is smart and lovely");
        myQuiz.addQuestion(myParagraphQuestion);

        myQuiz.runQuiz();

    }
}
