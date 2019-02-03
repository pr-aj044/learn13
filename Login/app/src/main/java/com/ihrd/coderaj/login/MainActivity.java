package com.ihrd.coderaj.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usrnm,pswd;
    Button login;
    String getUsr,getPas,getStr1="group10",getPstr="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usrnm=(EditText)findViewById(R.id.usrnm);
        pswd=(EditText)findViewById(R.id.pswd);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUsr=usrnm.getText().toString();
                getPas=pswd.getText().toString();

                if ((getUsr.equals(getStr1))&&((getPas.equals(getPstr))))
                {
                    Intent intent=new Intent(getApplicationContext(),LogedActivity.class);
                    SharedPreferences.Editor editor=getSharedPreferences("myprefname",MODE_PRIVATE).edit();
                    editor.putString("user",getUsr);
                    editor.apply();

                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Login failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
