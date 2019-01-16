package com.example.administrator.studentreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class studentreg2 extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;
    Button b1,b2;
    String getname,getadno,getrno,getclg,getplc,getstudid,getpass,getcpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentreg2);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.adno);
        ed3=(EditText)findViewById(R.id.rno);
        ed4=(EditText)findViewById(R.id.clg);
        ed5=(EditText)findViewById(R.id.plc);
        ed6=(EditText)findViewById(R.id.studid);
        ed7=(EditText)findViewById(R.id.pass);
        ed8=(EditText)findViewById(R.id.cpass);
        b1=(Button)findViewById(R.id.rstr);
        b2=(Button)findViewById(R.id.arstr);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getname = ed1.getText().toString();
                getadno = ed2.getText().toString();
                getrno = ed3.getText().toString();
                getclg = ed4.getText().toString();
                getplc = ed5.getText().toString();
                getstudid = ed6.getText().toString();
                getpass = ed7.getText().toString();
                getcpass = ed8.getText().toString();
                if (getpass.equals(getcpass)) {
                    Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getadno, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getrno, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getclg, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getplc, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getstudid, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getpass, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getcpass, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "password and confirm password are equal", Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
