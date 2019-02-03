package com.ihrd.coderaj.read4me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login2,signup2,std,serc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login2=(Button)findViewById(R.id.log1);
        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(getApplicationContext(),LoginActivity.class);
               startActivity(x);
            }
        });
        signup2=(Button)findViewById(R.id.sign1);
        signup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(x);
            }
        });
        std=(Button)findViewById(R.id.std);
        std.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(getApplicationContext(),StudentActivity.class);
                startActivity(x);
            }
        });
        serc=(Button)findViewById(R.id.ser);
        serc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(getApplicationContext(),Search1Activity.class);
                startActivity(x);
            }
        });
    }
}
