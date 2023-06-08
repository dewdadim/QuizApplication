/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication;

import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author dewda
 */
public class HardMode extends AnswerQuiz {
    
    private int timeLeft;
    private Timer timer;
    
    public HardMode(){
        super();
        hardMode = true;
    }
    
    @Override
    public void checkAnswer(int trueAnswer, int answer) {
        if(trueAnswer == answer){
            addCorrectAnswer();
        }
        else {
            if(totalMark > 0){
               substractMark(); 
            }
        }
    }
    
    public void countdownTimer(int timeLeft, JLabel label){
        label.setText(String.valueOf(timeLeft));
        for (int i = timeLeft; i >= 0; i--) {
            label.setText(String.valueOf(i));
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Countdown complete!");
    }

    public Timer getTimer() {
        return timer;
    }
    
}
