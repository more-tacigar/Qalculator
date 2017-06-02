package com.github.tacigar.qalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator((TextView)findViewById(R.id.formula));
    }

    public void onButtonClicked(View view) {
        switch(view.getId()) {
            case R.id.button_0:      calculator.put('0'); break;
            case R.id.button_1:      calculator.put('1'); break;
            case R.id.button_2:      calculator.put('2'); break;
            case R.id.button_3:      calculator.put('3'); break;
            case R.id.button_4:      calculator.put('4'); break;
            case R.id.button_5:      calculator.put('5'); break;
            case R.id.button_6:      calculator.put('6'); break;
            case R.id.button_7:      calculator.put('7'); break;
            case R.id.button_8:      calculator.put('8'); break;
            case R.id.button_9:      calculator.put('9'); break;
            case R.id.button_dot:    calculator.put('.'); break;
            case R.id.button_add:    calculator.put('+'); break;
            case R.id.button_sub:    calculator.put('-'); break;
            case R.id.button_mul:    calculator.put('×'); break;
            case R.id.button_div:    calculator.put('/'); break;
            case R.id.button_lparen: calculator.put('('); break;
            case R.id.button_rparen: calculator.put(')'); break;
            case R.id.button_eq:     calculator.calculate(); break;
            case R.id.button_ac:     calculator.clear(); break;
        }
    }
}
