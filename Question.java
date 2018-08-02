package com.bignerdranch.android.geoquiz;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lma014 on 2/08/2018.
 */

public class Question {
    public Boolean answer;
    public int question_text;
    public Question(Boolean ans, String text){
        answer = ans;
        question_text = R.string.question1_text;
    }
    public Boolean getAnswer(){
        return answer;
    }
    public void displayQuestion(TextView view, Button true_button, Button false_button){
        view.setText(question_text);
        if (answer == true){

        }
    }
}
