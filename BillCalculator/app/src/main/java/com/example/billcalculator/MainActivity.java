package com.example.billcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.shashank.sony.fancytoastlib.FancyToast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
TextInputEditText et0,et1,et2,et3,et4;
Button btnsubmit;
TextView tv1,tv2,tv3,tv4,tv5;
Integer result0,result1,result2,result3,result4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et0 = findViewById(R.id.Rating);
        et1 = findViewById(R.id.Rating1);
        et2 = findViewById(R.id.Rating2);
        et3 = findViewById(R.id.Rating3);
        et4 = findViewById(R.id.Rating4);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        result0 = 0;
        result1 = 0;
        result2 = 0;
        result3 = 0;
        result4 = 0;
        btnsubmit = findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et0.getText().toString().length() == 0 ||
                        et1.getText().toString().length() == 0 ||
                        et2.getText().toString().length() == 0 ||
                        et3.getText().toString().length() == 0 ||
                        et4.getText().toString().length() == 0){
                    FancyToast.makeText(MainActivity.this,"Enter all Fields!",FancyToast.LENGTH_LONG,FancyToast.ERROR,false).show();

                }
                else{
                    result0 = Integer.valueOf(et0.getText().toString().trim());
                    result1 = Integer.valueOf(et1.getText().toString().trim());
                    result2 = Integer.valueOf(et2.getText().toString().trim());
                    result3 = Integer.valueOf(et3.getText().toString().trim());
                    result4 = Integer.valueOf(et4.getText().toString().trim());
                    cal1(result0);
                    cal2(result1);
                    cal3(result2);
                    cal4(result3);
                    cal5(result4);
                }


            }
        });


    }
    public Integer cal1(Integer result0){
        if(result0<=50){
            Integer value = result0*3;
            tv1.setText("House 1 cost- "+value.toString());
        }
        if(result0>50 && result0 <=150){
            Integer value = (result0-50)*4 + (result0-150)*3;
            tv1.setText("House 1 cost- "+value.toString());

        }
        if(result0>150){
            Integer value = (result0-50)*4 + (result0-150)*3 + (result0-200)*5;
            tv1.setText("House 1 cost- "+value.toString());

        }
        return 0;
    };
    public Integer cal2(Integer result0){
        if(result0<=50){
            Integer value = result0*3;
            tv2.setText("House 2 cost- "+value.toString());
        }
        if(result0>50 && result0 <=150){
            Integer value = (result0-50)*4 + (result0-150)*3;
            tv2.setText("House 2 cost- "+value.toString());

        }
        if(result0>150){
            Integer value = (result0-50)*4 + (result0-150)*3 + (result0-200)*5;
            tv2.setText("House 2 cost- "+value.toString());

        }
        return 0;
    };
    public Integer cal3(Integer result0){
        if(result0<=50){
            Integer value = result0*3;
            tv3.setText("House 3 cost- "+value.toString());
        }
        if(result0>50 && result0 <=150){
            Integer value = (result0-50)*4 + (result0-150)*3;
            tv3.setText("House 3 cost- "+value.toString());

        }
        if(result0>150){
            Integer value = (result0-50)*4 + (result0-150)*3 + (result0-200)*5;
            tv3.setText("House 3 cost- "+value.toString());

        }
        return 0;
    };
    public Integer cal4(Integer result0){
        if(result0<=50){
            Integer value = result0*3;
            tv4.setText("House 4 cost- "+value.toString());
        }
        if(result0>50 && result0 <=150){
            Integer value = (result0-50)*4 + (result0-150)*3;
            tv4.setText("House 4 cost- "+value.toString());

        }
        if(result0>150){
            Integer value = (result0-50)*4 + (result0-150)*3 + (result0-200)*5;
            tv4.setText("House 4 cost- "+value.toString());

        }
        return 0;
    };
    public Integer cal5(Integer result0){
        if(result0<=50){
            Integer value = result0*3;
            tv5.setText("House 5 cost- "+value.toString());
        }
        if(result0>50 && result0 <=150){
            Integer value = (result0-50)*4 + (result0-150)*3;
            tv5.setText("House 5 cost- "+value.toString());

        }
        if(result0>150){
            Integer value = (result0-50)*4 + (result0-150)*3 + (result0-200)*5;
            tv5.setText("House 5 cost- "+value.toString());

        }
        return 0;
    };
}