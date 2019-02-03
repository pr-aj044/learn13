package com.ihrd.coderaj.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText fname,fcode,fmail,fmob,fsal,fplace,fclg,fuser,fpswd1,fpswd2;
    Button submit;
    String getFname,getFcode,getFmail,getFmob,getFsal,getFplace,getFclg,getFuser,getFpswd1,getFpswd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=(EditText)findViewById(R.id.fname);
        fcode=(EditText)findViewById(R.id.fcode);
        fmail=(EditText)findViewById(R.id.fmail);
        fmob=(EditText)findViewById(R.id.fmob);
        fsal=(EditText)findViewById(R.id.fsal);
        fplace=(EditText)findViewById(R.id.fplace);
        fclg=(EditText)findViewById(R.id.fclg);
        fuser=(EditText)findViewById(R.id.fuser);
        fpswd1=(EditText)findViewById(R.id.fpswd1);
        fpswd2=(EditText)findViewById(R.id.fpswd2);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               getFname=fname.getText().toString();
                getFcode=fcode.getText().toString();
                getFmail=fmail.getText().toString();
                getFmob=fmob.getText().toString();
                getFsal=fsal.getText().toString();
                getFplace=fplace.getText().toString();
                getFclg=fclg.getText().toString();
                getFuser=fuser.getText().toString();
                getFpswd1=fpswd1.getText().toString();
                getFpswd2=fpswd2.getText().toString();

                //checking


                if(getFpswd2.equals(getFpswd1)){
                    Intent a=new Intent(getApplicationContext(),ResultActivity.class);
                    a.putExtra("1",getFname);
                    a.putExtra("2",getFcode);
                    a.putExtra("3",getFmail);
                    a.putExtra("4",getFmob);
                    a.putExtra("5",getFsal);
                    a.putExtra("6",getFplace);
                    a.putExtra("7",getFclg);
                    a.putExtra("8",getFuser);

                    startActivity(a);
            }

        }

    });
    }
}
