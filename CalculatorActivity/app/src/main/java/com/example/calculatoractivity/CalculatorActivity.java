package com.example.calculatoractivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    private EditText display;
    private String currentInput = "";
    private String operator = "";
    private double operand1 = 0.0;
    private double operand2 = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
    }

    public void onDigitClick(View view) {
        String digit = ((Button) view).getText().toString();
        currentInput += digit;
        updateDisplay();
    }

    public void onOperatorClick(View view) {
        operator = ((Button) view).getText().toString();
        operand1 = Double.parseDouble(currentInput);
        currentInput = "";
    }

    public void onClearClick(View view) {
        currentInput = "";
        operand1 = 0.0;
        operand2 = 0.0;
        operator = "";
        updateDisplay();
    }

    public void onEqualClick(View view) {
        operand2 = Double.parseDouble(currentInput);
        double result = calculateResult();
        currentInput = String.valueOf(result);
        updateDisplay();
    }

    private void updateDisplay() {
        display.setText(currentInput);
    }

    private double calculateResult() {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    return Double.NaN;
                }
            default:
                return operand1;
        }
    }
}
