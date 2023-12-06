package com.example.toggleimage;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    ImageView imageView1;
    Button toggleButton;
    boolean flower = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);

        toggleButton = findViewById(R.id.toggleButton);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flower) {
                    imageView1.setImageResource(R.drawable.image2);
                    flower=false;
                }
                else{
                    imageView1.setImageResource(R.drawable.image1);
                    flower=true;

                }
            }
        });
    }
}