package com.ihrd.coderaj.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"NEXT",Toast.LENGTH_SHORT).show();
                Intent x=new Intent(getApplicationContext(),AddActivity.class);
                startActivity(x);
            }
        });
        sub=(Button)findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"NEXT",Toast.LENGTH_SHORT).show();
                Intent x=new Intent(getApplicationContext(),SubActivity.class);
                startActivity(x);
            }
        });
        mul=(Button)findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"NEXT",Toast.LENGTH_SHORT).show();
                Intent x=new Intent(getApplicationContext(),MulActivity.class);
                startActivity(x);
            }
        });
        div=(Button)findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"NEXT",Toast.LENGTH_SHORT).show();
                Intent x=new Intent(getApplicationContext(),DivActivity.class);
                startActivity(x);
            }
        });
    }
}
