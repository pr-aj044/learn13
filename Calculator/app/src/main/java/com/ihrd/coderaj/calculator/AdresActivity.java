package com.ihrd.coderaj.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class AdresActivity extends AppCompatActivity {

    EditText res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adres);
        Intent x=getIntent();
        String val=x.getExtras().getString("res");
        Toast.makeText(getApplicationContext(),val, Toast.LENGTH_SHORT).show();

    }
}
