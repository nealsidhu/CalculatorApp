package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void addition(View view){
        EditText num1 = (EditText) findViewById(R.id.numberOne);
        EditText num2 = (EditText) findViewById(R.id.numberTwo);
        float solution = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
        goToActivity(String.valueOf(solution));
    }
    public void subtraction(View view) {
        EditText num1 = (EditText) findViewById(R.id.numberOne);
        EditText num2 = (EditText) findViewById(R.id.numberTwo);
        float solution = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
        goToActivity(String.valueOf(solution));
    }
    public void multiplication(View view) {
        EditText num1 = (EditText) findViewById(R.id.numberOne);
        EditText num2 = (EditText) findViewById(R.id.numberTwo);
        float solution = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
        goToActivity(String.valueOf(solution));
    }
    public void division(View view) {
        EditText num1 = (EditText) findViewById(R.id.numberOne);
        EditText num2 = (EditText) findViewById(R.id.numberTwo);
        float solution = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
        goToActivity(String.valueOf(solution));
    }
    public void goToActivity(String s) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}