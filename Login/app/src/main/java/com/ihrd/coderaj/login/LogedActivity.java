package com.ihrd.coderaj.login;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LogedActivity extends AppCompatActivity {

    TextView ot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loged);

        ot=(TextView)findViewById(R.id.ot);
        SharedPreferences pref=getSharedPreferences("myprefname",MODE_PRIVATE);
        String x=pref.getString("user",null);

        ot.setVisibility(View.VISIBLE);
        ot.setText("Welcome"+"____"+x+"___!");
        Toast.makeText(getApplicationContext(),"Welcome"+""+x+"!",Toast.LENGTH_SHORT).show();
    }
}
