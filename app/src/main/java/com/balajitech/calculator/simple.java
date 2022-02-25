package com.balajitech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class simple extends AppCompatActivity {
    EditText etNumber1,etNumber2;
    Button btans;
    TextView tvans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        etNumber1=(EditText)findViewById(R.id.etnumber1);
        etNumber2=(EditText)findViewById(R.id.etnumber2);

        btans=(Button)findViewById(R.id.buttonsum);
        tvans=(TextView)findViewById(R.id.textView2);


        btans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one=etNumber1.getText().toString();
                String two=etNumber2.getText().toString();

                Float fone=Float.parseFloat(one);
                Float ftwo=Float.parseFloat(two);
                Float Fans=fone+ftwo;

                tvans.setText("Ans is"+Fans.toString());
            }
        });



    }
}