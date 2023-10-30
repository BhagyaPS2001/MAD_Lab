package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2;
    Button addBtn;
    TextView displayTxt;

    int n1,n2,sum;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.num1);
        txt2=findViewById(R.id.num2);
        addBtn=findViewById(R.id.add);
        displayTxt=findViewById(R.id.display);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Integer.parseInt(txt1.getText().toString());
                n2=Integer.parseInt(txt2.getText().toString());
                sum=n1+n2;
                displayTxt.setText(""+sum);
            }
        });



    }
}