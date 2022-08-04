package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private EditText resultText;
    private Button addition;
    private Button subtraction;
    private Button division;
    private Button multiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = (EditText)findViewById(R.id.inputOne);
        operand2 = (EditText)findViewById(R.id.inputTwo);
        addition = (Button)findViewById(R.id.Addition);
        subtraction = (Button)findViewById(R.id.Subtraction);
        division = (Button)findViewById(R.id.Division);
        multiplication = (Button)findViewById(R.id.Multiplication);
        resultText = (EditText)findViewById(R.id.result);




        addition.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    double result = num1 + num2;
                    resultText.setText(Double.toString(result));
                }
                catch (NumberFormatException e)
                {
                    resultText.setText("Input must be a number");
                }
                catch (Exception e)
                {
                    resultText.setText(e.getMessage());
                }


            }
        });

        subtraction.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    double result = num1 - num2;
                    resultText.setText(Double.toString(result));
                }
                catch (NumberFormatException e)
                {
                    resultText.setText("Input must be a number");
                }
                catch (Exception e)
                {
                    resultText.setText(e.getMessage());
                }
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    double result = num1 * num2;
                    resultText.setText(Double.toString(result));
                }
                catch (NumberFormatException e)
                {
                    resultText.setText("Input must be a number");
                }
                catch (Exception e)
                {
                    resultText.setText(e.getMessage());
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    if (num2 == 0)
                    {
                        resultText.setText("Can't divide by zero");
                    }
                    else
                    {
                        double result = num1 / num2;
                        resultText.setText(Double.toString(result));
                    }

                }
                catch (NumberFormatException e)
                {
                    resultText.setText("Input must be a number");
                }
                catch (Exception e)
                {
                    resultText.setText(e.getMessage());
                }

            }
        });
    }


}