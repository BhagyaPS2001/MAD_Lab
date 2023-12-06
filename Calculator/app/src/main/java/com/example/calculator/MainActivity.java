package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    private String currentInput = "";
    private String currentOperator = "";
    private double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
    }
    public void onDigitClick(View view) {
        String digit = ((Button) view).getText().toString();
        currentInput += digit;
        display.setText(currentInput);
    }

    public void onOperatorClick(View view) {
        if (!currentInput.isEmpty()) {
            currentOperator = ((Button) view).getText().toString();
            result = Double.parseDouble(currentInput);
            currentInput = "";
        }
    }

    public void onEqualsClick(View view) {
        if (!currentInput.isEmpty()) {
            double secondOperand = Double.parseDouble(currentInput);

            switch (currentOperator) {
                case "+":
                    result += secondOperand;
                    break;
                case "-":
                    result -= secondOperand;
                    break;
                case "*":
                    result *= secondOperand;
                    break;
                case "/":
                    if (secondOperand != 0) {
                        result /= secondOperand;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
            }

            display.setText(Double.toString(result));
            currentInput = Double.toString(result);
        }
    }
    public void onClear(View view) {
        currentInput = "";
        currentOperator = "";
        result = 0.0;
        display.setText("");
    }
}