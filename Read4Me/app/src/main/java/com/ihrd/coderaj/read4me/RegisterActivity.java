package com.ihrd.coderaj.read4me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {

    EditText fnm,lnm,age,mob,mail,pswd1,cmpswd;
    Button signup;
    Spinner gen;
    String url="http://192.168.43.41/read4me/signup.php";
    String fname,lname,uage,gender,mobile,email,passwd,cmpasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fnm=(EditText)findViewById(R.id.fnm);
        lnm=(EditText)findViewById(R.id.lnm);
        age=(EditText)findViewById(R.id.age);
        gen=(Spinner)findViewById(R.id.spin1);
        mob=(EditText)findViewById(R.id.mob);
        mail=(EditText)findViewById(R.id.mail);
        pswd1=(EditText)findViewById(R.id.pswd1);
        cmpswd=(EditText)findViewById(R.id.cmpswd);
        signup=(Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fname=fnm.getText().toString();
                lname=lnm.getText().toString();
                uage=age.getText().toString();
                gender=gen.getSelectedItem().toString();
                mobile=mob.getText().toString();
                email=mail.getText().toString();
                passwd=pswd1.getText().toString();
                cmpasswd=cmpswd.getText().toString();
                if(passwd.equals(cmpasswd)){
                    //rest of prgrm


                    sendtoserver();
                }
            }

            private void sendtoserver() {
                StringRequest sign=new StringRequest(Request.Method.POST, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                Toast.makeText(getApplicationContext(),response,Toast.LENGTH_SHORT).show();
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {

                                Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_SHORT).show();
                            }
                        }){
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        HashMap<String,String> params=new HashMap<>();
                        params.put("fname",fname);
                        params.put("lname",lname);
                        params.put("uage",uage);
                        params.put("gender",gender);
                        params.put("mobile",mobile);
                        params.put("email",email);
                        params.put("pass",passwd);
                        return params;
                    }



                };
                RequestQueue reqs=Volley.newRequestQueue(getApplicationContext());
                reqs.add(sign);
            }
        });

    }
}
