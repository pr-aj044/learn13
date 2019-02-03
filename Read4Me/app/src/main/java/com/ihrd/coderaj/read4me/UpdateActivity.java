package com.ihrd.coderaj.read4me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class UpdateActivity extends AppCompatActivity {
    EditText fnm,lnm,age,mob;
    Button update;
    Spinner gen;
    String fname,lname,uage,gender,mobile,email,passwd,cmpasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        fnm=(EditText)findViewById(R.id.fnm);
        lnm=(EditText)findViewById(R.id.lnm);
        age=(EditText)findViewById(R.id.age);
        gen=(Spinner)findViewById(R.id.spin1);
        mob=(EditText)findViewById(R.id.mob);
        update=(Button)findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fname=fnm.getText().toString();
                lname=lnm.getText().toString();
                uage=age.getText().toString();
                gender=gen.getSelectedItem().toString();
                mobile=mob.getText().toString();
            }
        });
    }
}
