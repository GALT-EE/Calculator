
package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText numberOne;
    EditText numberTwo;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         numberOne=findViewById(R.id.numberOne);
         numberTwo=findViewById(R.id.numberTwo);
         resultText=findViewById(R.id.resultField);


    }
    public void sum(View view){
       if(numberOne.getText().toString().matches("")||numberTwo.getText().toString().matches("")){
           resultText.setText("enter number");

       }else{


        double number1=Integer.parseInt(numberOne.getText().toString());
        double number2=Integer.parseInt(numberTwo.getText().toString());
        double result=number1+number2;

        resultText.setText("Result  "+result);
    }
    }
    public void sub(View view){
        if(numberOne.getText().toString().matches("")||numberTwo.getText().toString().matches("")){
            resultText.setText("enter number");

        }else{



        double number1=Integer.parseInt(numberOne.getText().toString());
        double number2=Integer.parseInt(numberTwo.getText().toString());
        double result=number1-number2;
        resultText.setText("Result  "+result); }

    }
    public void multi(View view){
        if(numberOne.getText().toString().matches("")||numberTwo.getText().toString().matches("")){
            resultText.setText("enter number");

        }else{


        double number1=Integer.parseInt(numberOne.getText().toString());
        double number2=Integer.parseInt(numberTwo.getText().toString());
        double result=number1*number2;
        resultText.setText("Result  "+result);
    }
    }
    public void div(View view){
        if(numberOne.getText().toString().matches("")||numberTwo.getText().toString().matches("")){
            resultText.setText("enter number");

        } else{
        double number1=Integer.parseInt(numberOne.getText().toString());
        double number2=Integer.parseInt(numberTwo.getText().toString());
        double result=number1/number2;
        resultText.setText("Result  "+result);}

    }
}