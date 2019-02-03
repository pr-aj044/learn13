package com.ihrd.coderaj.read4me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

public class StudentActivity extends AppCompatActivity {
    EditText name,rollno,adno,college;
    Button submit;
    String getname,getroll,getadno,getcollege;
    String url="http://192.168.43.41/read4me/insertion.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        name=(EditText)findViewById(R.id.name);
        rollno=(EditText)findViewById(R.id.rollno);
        adno=(EditText)findViewById(R.id.adno);
        college=(EditText)findViewById(R.id.college);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=name.getText().toString();
                getroll=rollno.getText().toString();
                getadno=adno.getText().toString();
                getcollege=college.getText().toString();
                sendtoserver();
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
                        params.put("name",getname);
                        params.put("rollno",getroll);
                        params.put("adno",getadno);
                        params.put("college",getcollege);
                        return  params;
                    }
                };
                RequestQueue x= Volley.newRequestQueue(getApplicationContext());
                x.add(sign);
            }
        });



    }
}
