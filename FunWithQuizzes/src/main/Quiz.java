package main;
import java.util.ArrayList;
import java.util.Scanner;


public class Quiz {
    //Class Variables
    ArrayList<Question> questions = new ArrayList<>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    //Constructor
    public Quiz() {
        
    }
    //Methods
        //getter
    public ArrayList<Question> getQuestions() {
        return this.questions;
    }
    public void addQuestion(Question question) {
        this.questions.add(question);
    }
    public void runQuiz() {
        //loop through each question
        for(Question question : questions) {
            //ask the user the question
            System.out.println(question.getTheQuestion());
            //get the user answer
            String usersAnswer = this.getUserAnswer();
            //check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            //Increment numberOfQuestionsCorrect if answered correctly
            if(userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }
        //Grade the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double)this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%");
    }
    private String getUserAnswer() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
