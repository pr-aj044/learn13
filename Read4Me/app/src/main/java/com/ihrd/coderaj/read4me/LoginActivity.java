package com.ihrd.coderaj.read4me;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText usrnm,pswd;
    String hvuser,hvpass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usrnm=(EditText)findViewById(R.id.usrnm);
        pswd=(EditText)findViewById(R.id.pswd);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hvuser=usrnm.getText().toString();
                hvpass=pswd.getText().toString();

                //Login success
                Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_SHORT).show();
                Intent xy=new Intent(getApplicationContext(),Main2Activity.class);
                SharedPreferences.Editor editor=getSharedPreferences("myprefname",MODE_PRIVATE).edit();
                editor.putString("user",hvuser);
                editor.apply();


                startActivity(xy);

            }
        });
    }
}
