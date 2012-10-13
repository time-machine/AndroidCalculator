package com.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AndroidCalculatorActivity extends Activity {
    EditText txtFirstValue;
    EditText txtSecondValue;
    TextView tvResult;
    Button btnCalculate;
    float num1, num2;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        txtFirstValue = (EditText) findViewById(R.id.EditText01);
        txtSecondValue = (EditText) findViewById(R.id.EditText02);
        tvResult = (TextView) findViewById(R.id.TextView01);
        tvResult.setText("0.00");
        btnCalculate = (Button) findViewById(R.id.Button01);

        //Adding listener to button
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Getting first & second values and passing to show result
                showResult(txtFirstValue.getText(), txtSecondValue.getText());
            }
        });
    }

    //Showing multiply results
    protected void showResult(Editable first, Editable second) {
        float num1 = Float.parseFloat(first.toString());
        float num2 = Float.parseFloat(second.toString());
        float result = num1 * num2;

        tvResult.setText(String.valueOf(result));
    }
}
