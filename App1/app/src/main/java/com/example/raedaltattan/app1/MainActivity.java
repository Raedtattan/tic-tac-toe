package com.example.raedaltattan.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ViewName(View view)
    {
        TextView MyName = (TextView) findViewById(R.id.tv1);
        Toast.makeText(MainActivity.this , "Hi There :" + MyName.getText().toString() , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
