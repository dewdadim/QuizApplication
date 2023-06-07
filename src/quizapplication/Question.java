/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author dewda
 */
public class Question implements Serializable{
    private String question;
    private String[] answerOption = new String[3];
    private int trueAnswer;

    
    public Question(String question, String[] answerOption, int trueAnswer){
        this.question = question;
        this.answerOption = answerOption;
        this.trueAnswer = trueAnswer;
    }

    public Question() {

    }
    
    public void addAnswerOption(String answerOption, int index){
        if(index < 0 || index > this.answerOption.length){
            throw new IllegalArgumentException("Invalid question index.");
        }
        this.answerOption[index] = answerOption;
    }
    
    public String getQuestion() {
        return question;
    }

    public String[] getAnswerOption() {
        return answerOption;
    }
    
    public String getAnswerOption(int i) {
        return answerOption[i];
    }

    public int getTrueAnswer() {
        return trueAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    
    public void setCorrectAnswer(int trueAnswer) {
        this.trueAnswer = trueAnswer;
    }
}
