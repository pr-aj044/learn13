package com.ihrd.coderaj.read4me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Search1Activity extends AppCompatActivity {
    EditText adno,name,rollno,college;
    Button search;
    String getadno,url="http://192.168.43.41/read4me/search1.php";
    String getname,getrollno,getcollege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search1);
        adno=(EditText)findViewById(R.id.adno);
        name=(EditText)findViewById(R.id.name);
        rollno=(EditText)findViewById(R.id.rollno);
        college=(EditText)findViewById(R.id.college);
        search=(Button)findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getadno=adno.getText().toString();
                getfromserver();
            }

            private void getfromserver() {
                StringRequest getdata=new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {

                                try{
                                    JSONObject obj=new JSONObject(response);
                                    getname=obj.getString("name");
                                    getrollno=obj.getString("rollno");
                                    getcollege=obj.getString("college");
                                    name.setText(getname);
                                    rollno.setText(getrollno);
                                    college.setText(getcollege);
                                }
                                catch (JSONException e){
                                    Toast.makeText(getApplicationContext(), (CharSequence) e,Toast.LENGTH_SHORT).show();

                                }


                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }){
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        HashMap<String, String> params=new HashMap<>();
                        params.put("adno",getadno);
                        return params;
                    }
                };
            }
        });
    }
}
