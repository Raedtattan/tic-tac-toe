package com.example.raedaltattan.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void converter(View view){
        EditText myCurrency = (EditText) findViewById(R.id.edtcurrency);
        Double dollerAmountDouble = Double.parseDouble(myCurrency.getText().toString());
        Double ryihalAmount = dollerAmountDouble * 3.75 ;
        Toast.makeText(this, "SR " + String.format("%.2f" , ryihalAmount), Toast.LENGTH_LONG).show();
        Log.i("THis is Test " , "It's WOrking ");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
