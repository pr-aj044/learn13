package com.ihrd.coderaj.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import java.lang.String;
import java.lang.Object;
import android.widget.TextView;
import android.widget.Toast;

import static com.ihrd.coderaj.firstapp.R.id.res;


public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText fnum,snum;
    Button b,a;
    EditText txtres;

    String getRes,getSpinner;
    int r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fnum=(EditText)findViewById(R.id.fnum);
        snum=(EditText)findViewById(R.id.snum);
        spinner=(Spinner)findViewById(R.id.spinner);
        txtres=(EditText)findViewById(R.id.txtres);
        b=(Button)findViewById(res);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // getFnum=fnum.getText().toString();
                int fn = Integer.parseInt(fnum.getText().toString());
                //getSnum=snum.getText().toString();
                int sn = Integer.parseInt(snum.getText().toString());

                getSpinner=spinner.getSelectedItem().toString();


                if(getSpinner.equals("Add")) {

                    r = (fn + sn);

                    //getRes=Integer.toString(r);//converting integer to string value
                    //Toast.makeText(getApplicationContext(),getRes,Toast.LENGTH_SHORT).show();
                }
                else if(getSpinner.equals("Sub")){
                    r=(fn-sn);
                }
                else if(getSpinner.equals("Mul")){
                    r=(fn*sn);
                }
                else if(getSpinner.equals("Div")){
                    r=(fn/sn);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Respose",Toast.LENGTH_SHORT).show();
                }


                String res=Integer.toString(r);

                Log.d("result",res);
                txtres.setVisibility(View.VISIBLE);
                txtres.setText(Integer.toString(r));

            }
        });
//        a=(Button)findViewById(R.id.nw);
//        a.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Toast.makeText(getApplicationContext(),"NEXT",Toast.LENGTH_SHORT).show();
//                Intent x=new Intent(getApplicationContext(),WelcomeActivity.class);
//                startActivity(x);
//            }
//        });
    }
}