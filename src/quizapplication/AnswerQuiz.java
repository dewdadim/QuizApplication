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
public abstract class AnswerQuiz implements Serializable{
    protected String name;
    protected double totalMark=0;
    protected double result;
    protected int resultInt;
    protected boolean hardMode;
    
    /**
     *
     * @param trueAnswer
     * @param answer
     */
    public abstract void checkAnswer(int trueAnswer, int answer);
    
    protected void addCorrectAnswer(){
        this.totalMark += 1;
    }
    
    protected void substractMark(){
        this.totalMark -= 0.2;
    }
    
    public void calcResult(double totalMark, int totalQuestion){
        this.result = (totalMark / (double)totalQuestion) * 100;
        this.resultInt = (int) Math.round(result);
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public double getResult() {
        return result;
    }

    public int getResultInt() {
        return resultInt;
    }

    public boolean isHardMode() {
        return hardMode;
    }


}
