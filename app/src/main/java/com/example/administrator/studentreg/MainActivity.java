package com.example.administrator.studentreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText ed1,ed2;
    Button b1,b2;
    String getsid,getpassword;
    String str1="mzc";
    String str2="college";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.sid);
        ed2=(EditText)findViewById(R.id.pwd);
        b1=(Button)findViewById(R.id.ln);
        b2=(Button)findViewById(R.id.reg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getsid = ed1.getText().toString();
                getpassword = ed2.getText().toString();
                if ((getsid.equals(str1)) && (getpassword.equals(str2))) {
                    Intent e = new Intent(getApplicationContext(),loginactivity.class);
                    startActivity(e);


                }
                else {
                   Toast.makeText(getApplicationContext(),"You are not Authorized",Toast.LENGTH_LONG).show();
                }
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),studentreg2.class);
                startActivity(i);
            }
        });
    }
}
