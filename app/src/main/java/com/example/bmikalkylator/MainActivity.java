package com.example.bmikalkylator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText height;
    EditText weight;
    Button button;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      button = findViewById(R.id.button);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        result = findViewById(R.id.result);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String h = height.getText().toString();
                double m = Double.parseDouble(h);
                String w = weight.getText().toString();
                int kg = Integer.parseInt(w);


                double r = kg / (m * m);
                result.setText("Your BMI is: " + r);

            }
        });
    }

 /*   public void updateText(){
        result.setText("Your BMI is: ");
    }*/
}

