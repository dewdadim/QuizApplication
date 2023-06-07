/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication;

import java.io.Serializable;

/**
 *
 * @author dewda
 */
public class Quiz implements Serializable{
    private String quizName;
    private Question[] question;
    
    
    public Quiz(){
        this.question = new Question[10];
    }
    
    public void addQuestion(Question question, int index){
        if(index < 0 || index > this.question.length){
            throw new IllegalArgumentException("Invalid question index.");
        }
        this.question[index] = question;
    }

    public String getQuizName() {
        return quizName;
    }

    public Question[] getQuestion() {
        return question;
    }
    
    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }    
}
