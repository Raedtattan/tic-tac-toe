package com.example.raedaltattan.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randNumber;

    public void makeToast(String string){
        Toast.makeText(MainActivity.this,string , Toast.LENGTH_LONG).show();
    }
    public void guessnumber(View view) {
        EditText guessnumb = (EditText) findViewById(R.id.edittxt);
        int guessint = Integer.parseInt(guessnumb.getText().toString());

        if (guessint > randNumber) {
            makeToast("Lower !");
        }
        else if(guessint < randNumber) {
            makeToast("Higher !");
        }else{
            makeToast("That's Right !! , Try Again");

            Random rand = new Random();
            randNumber = rand.nextInt(10) + 1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        int randNumber = rand.nextInt(10) + 1;

    }
}
