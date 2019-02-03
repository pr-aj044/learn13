package com.ihrd.coderaj.read4me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DeleteActivity extends AppCompatActivity {

    EditText usrnm,pswd;
    String hvuser,hvpass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        usrnm=(EditText)findViewById(R.id.usrnm);
        pswd=(EditText)findViewById(R.id.pswd);

    }
}
