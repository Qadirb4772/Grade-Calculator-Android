package com.MyProjects.SimpleGradingCalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView result = findViewById(R.id.result);
        EditText inputMarks = findViewById(R.id.edtMarks);
        Button calculateGrade = findViewById(R.id.calculateBtn);

        calculateGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringMarks = inputMarks.getText().toString();
                if(stringMarks.isEmpty()){
                    result.setText(R.string.Empty_Marks);
                }else{
                    double marks = Double.parseDouble(stringMarks);
                    if(marks >= 0 && marks <= 100){
                        if(marks >= 93){
                            result.setText(R.string.Grade_A);
                        }else if(marks >= 87){
                            result.setText(R.string.Grade_B);
                        }else if(marks >= 77){
                            result.setText(R.string.Grade_C);
                        } else if (marks >= 60) {
                            result.setText(R.string.Grade_D);
                        }else{
                            result.setText(R.string.Grade_F);
                        }
                    }else{
                        result.setText(R.string.Invalid_Marks);
                    }
                }
            }
        });

    }
}