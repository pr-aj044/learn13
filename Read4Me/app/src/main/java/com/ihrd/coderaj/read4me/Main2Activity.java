package com.ihrd.coderaj.read4me;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button update1,delete1,search1;
    TextView ot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ot=(TextView)findViewById(R.id.ot);
        SharedPreferences pref=getSharedPreferences("myprefname",MODE_PRIVATE);
        String x=pref.getString("user",null);

        ot.setVisibility(View.VISIBLE);
        ot.setText("____"+x+"___!");

        update1=(Button)findViewById(R.id.log1);
        update1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(getApplicationContext(),UpdateActivity.class);
                startActivity(x);
            }
        });
        delete1=(Button)findViewById(R.id.sign1);
        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(getApplicationContext(),DeleteActivity.class);
                startActivity(x);
            }
        });
        search1=(Button)findViewById(R.id.search1);
        search1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(getApplicationContext(),DeleteActivity.class);
                startActivity(x);
            }
        });
    }
}
