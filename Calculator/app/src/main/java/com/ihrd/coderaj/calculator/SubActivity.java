package com.ihrd.coderaj.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    EditText n1,n2;
    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        n1=(EditText)findViewById(R.id.n1);
        n2=(EditText)findViewById(R.id.n2);
        sub=(Button)findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(n1.getText().toString());
                int b=Integer.parseInt(n2.getText().toString());
                int c=a-b;
                String r=String.valueOf(c);
                //Toast.makeText(getApplicationContext(),Integer.toString(c),Toast.LENGTH_SHORT).show();
                Intent x=new Intent(getApplicationContext(),AdresActivity.class);
                x.putExtra("res",r);
                startActivity(x);
            }
        });

    }
}
