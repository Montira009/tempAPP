package com.mon.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

        private TextView tv1;
        private EditText edtName1,edtName2;
        private double c1,c2;
        private double ans1;
        private String s1,s2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            edtName1= findViewById(R.id.edtName1);
            tv1 = findViewById(R.id.tv1);
        }

    public void submitCtoF(View view) {
        if(edtName1.getText().toString().length()==0){
            tv1.setText("input only number");
        }
        else{
            c1 = Double.parseDouble(edtName1.getText().toString());
            ans1 = (c1*1.8)+32;
            s1 = Double.toString(ans1);
            tv1.setText(s1 + " Fahrenheit");
        }
    }


    public void submitFtoC(View view) {
        if(edtName1.getText().toString().length()==0){
            tv1.setText("input only number");
        }
        else{
            c2 = Double.parseDouble(edtName1.getText().toString());
            ans1 = (c2-32)*(5.0/9.0);
            s2 = Double.toString(ans1);
            tv1.setText(s2 + " Celsius");
        }
    }
}
