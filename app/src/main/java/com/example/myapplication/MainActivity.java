package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.time.Year;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void sayHi(View view){
    TextInputEditText x = (TextInputEditText) findViewById(R.id.textInputX);
    TextView d = (TextView) findViewById(R.id.textView2);
    String userName = x.getText().toString();
    d.setText("Witaj "+userName+"!");
}

public void checkAge(View view){
        EditText dd = (EditText) findViewById(R.id.editTextNumber);
        EditText mm = (EditText) findViewById(R.id.editTextNumber2);
        EditText rr = (EditText) findViewById(R.id.editTextNumber3);
        String date = dd.getText().toString()+"-"+mm.getText().toString()+"-"+rr.getText().toString();
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(date);
    Context context = getApplicationContext();
    CharSequence temp = "SAMPLE";
    if(Integer.parseInt(rr.getText().toString()) < 2004){
        temp = "MASZ ZA MALO LAT";
    }
    else{
        temp = "MASZ WYSTARCZAJACO LAT";
    }
    CharSequence text = temp;
    int duration = Toast.LENGTH_SHORT;

    Toast toast = Toast.makeText(context, text, duration);
    toast.show();
    }
}