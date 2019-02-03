package com.ihrd.coderaj.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    EditText f1,f2,f3,f4,f5,f6,f7,f8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        f1=(EditText)findViewById(R.id.fname);
        f2=(EditText)findViewById(R.id.fcode);
        f3=(EditText)findViewById(R.id.fmail);
        f4=(EditText)findViewById(R.id.fmob);
        f5=(EditText)findViewById(R.id.fsal);
        f6=(EditText)findViewById(R.id.fplace);
        f7=(EditText)findViewById(R.id.fclg);
        f8=(EditText)findViewById(R.id.fuser);

            Intent x = getIntent();
            String val = x.getExtras().getString("1");
        f1.setVisibility(View.VISIBLE);
        f1.setText(val);
        String val1 = x.getExtras().getString("2");
        f2.setVisibility(View.VISIBLE);
        f2.setText(val1);
        String val2 = x.getExtras().getString("3");
        f3.setVisibility(View.VISIBLE);
        f3.setText(val2);
        String val3 = x.getExtras().getString("4");
        f4.setVisibility(View.VISIBLE);
        f4.setText(val3);
        String val4 = x.getExtras().getString("5");
        f5.setVisibility(View.VISIBLE);
        f5.setText(val4);
        String val5 = x.getExtras().getString("6");
        f6.setVisibility(View.VISIBLE);
        f6.setText(val5);
        String val6 = x.getExtras().getString("7");
        f7.setVisibility(View.VISIBLE);
        f7.setText(val6);
        String val7 = x.getExtras().getString("8");
        f8.setVisibility(View.VISIBLE);
        f8.setText(val7);
    }
}
