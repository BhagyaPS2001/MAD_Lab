package com.example.temperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText cel,fa;
    private Button celBtn, faBtn;
    private TextView t1,t2;
    double c,f,res1,res2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cel=findViewById(R.id.cel1);
        fa=findViewById(R.id.fa1);
        celBtn=findViewById(R.id.btn1);
        faBtn=findViewById(R.id.btn2);
        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt2);

        celBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c=Double.parseDouble(cel.getText().toString());
                res1=(c*1.8)+32;
                t1.setText("Temperature : "+res1);

            }
        });

        faBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                f=Double.parseDouble(fa.getText().toString());
                res2=(f-32*5)/9;
                t2.setText("Temperature : "+res2);
            }
        });

    }
}