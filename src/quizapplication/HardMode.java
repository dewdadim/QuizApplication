/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication;

/**
 *
 * @author dewda
 */
public class HardMode extends AnswerQuiz {
    
    public HardMode(){
        super();
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
}
