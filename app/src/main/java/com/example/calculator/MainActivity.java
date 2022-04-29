package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_add;
    private Button btn_multiply;
    private Button btn_divide;
    private Button btn_subtract;
    private EditText input1;
    private EditText input2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.et_input1);
        input2 = findViewById(R.id.et_input2);
        result = findViewById(R.id.tv_result);

        btn_add = findViewById(R.id.btn_add);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_divide = findViewById(R.id.btn_divide);
        btn_subtract = findViewById(R.id.btn_subtract);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String inp1 = input1.getText().toString();
                    String inp2 = input2.getText().toString();
                    Integer n1 = Integer.parseInt(inp1);
                    Integer n2 = Integer.parseInt(inp2);
                    result.setText(n1 + n2 + "");
                }
                catch (Exception e){
                    result.setText("0");
                }
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String inp1 = input1.getText().toString();
                    String inp2 = input2.getText().toString();
                    Integer n1 = Integer.parseInt(inp1);
                    Integer n2 = Integer.parseInt(inp2);
                    result.setText(n1 * n2 + "");
                }
                catch (Exception e){
                    result.setText("0");
                }
            }
        });

        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String inp1 = input1.getText().toString();
                    String inp2 = input2.getText().toString();
                    Integer n1 = Integer.parseInt(inp1);
                    Integer n2 = Integer.parseInt(inp2);
                    result.setText((n1 - n2) + "");
                }
                catch (Exception e){
                    result.setText("0");
                }
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String inp1 = input1.getText().toString();
                    String inp2 = input2.getText().toString();
                    Integer n1 = Integer.parseInt(inp1);
                    Integer n2 = Integer.parseInt(inp2);
                    result.setText((n1 / n2) + "");
                }
                catch (ArithmeticException e){
                    result.setText("0");
                }
            }
        });
    }
}