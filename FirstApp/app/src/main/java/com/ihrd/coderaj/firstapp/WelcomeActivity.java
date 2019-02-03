//package com.ihrd.coderaj.firstapp;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//public class WelcomeActivity extends AppCompatActivity {
//    EditText n1,n2,n3,res;
//    Button b;
//    String getRes;
//    int large;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_welcome);
//        n1=(EditText)findViewById(R.id.n1);
//        n2=(EditText)findViewById(R.id.n2);
//        n3=(EditText)findViewById(R.id.n3);
//        res=(EditText)findViewById(R.id.res);
//        b=(Button)findViewById(R.id.b);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int num1=Integer.parseInt(n1.getText().toString());
//                int num2=Integer.parseInt(n2.getText().toString());
//                int num3=Integer.parseInt(n3.getText().toString());
//                if((num1>num2)&&(num1>num3)){
//                    large=num1;
//                }else if((num2>num1)&&(num2>num3)){
//                    large=num2;
//                }else if((num3>num1)&&(num3>num2)){
//                    large=num3;
//                }else{
//                    getRes="All equal";
//                }
//                res.setVisibility(View.VISIBLE);
//                res.setText(String.valueOf(large));
//            }
//        });
//    }
//
//}