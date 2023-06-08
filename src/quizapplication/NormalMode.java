/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication;


/**
 *
 * @author dewda
 */
public class NormalMode extends AnswerQuiz {
    
    public NormalMode(){
        super();
        hardMode = false;
    }
    
    @Override
    public void checkAnswer(int trueAnswer, int answer) {
        if(trueAnswer == answer){
            addCorrectAnswer();
        }
    }
    
}
