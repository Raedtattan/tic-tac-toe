package com.example.raedaltattan.braintranier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button startButton;
    ArrayList<Integer> answers = new ArrayList<>();
    int locationOfCorrectAnswer;
    TextView sumTextView;

    public void start(View view){

        startButton.setVisibility(view.INVISIBLE);
    }

    public void chooseAnswer(View view)
    {
        if (view.getTag().toString().equals(Integer.toString(locationOfCorrectAnswer))){
            Log.i("Correct" , "Correct");
        }else {
            Log.i("flase" , "flase");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.startButton);
        sumTextView = (TextView) findViewById(R.id.sumTextView) ;
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);

        Random rand =  new Random();
        int a = rand.nextInt(21);
        int b = rand.nextInt(21);
        sumTextView.setText(Integer.toString(a) + "+" + Integer.toString(b));

        locationOfCorrectAnswer = rand.nextInt(4);

        int inCorrectAnswer;

        for (int i=0 ; i<4 ; i++) {
            if (i == locationOfCorrectAnswer) {

                answers.add(a + b);
            } else {
                inCorrectAnswer = rand.nextInt(41);
                while (inCorrectAnswer == a + b) {

                    inCorrectAnswer = rand.nextInt(41);

                }
                answers.add(inCorrectAnswer);
            }
        }
        button0.setText(Integer.toString(answers.get(0)));
        button1.setText(Integer.toString(answers.get(1)));
        button2.setText(Integer.toString(answers.get(2)));
        button3.setText(Integer.toString(answers.get(3)));
    }
}
