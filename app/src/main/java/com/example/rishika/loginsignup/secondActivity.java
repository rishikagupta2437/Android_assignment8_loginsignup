package com.example.rishika.loginsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity implements View.OnClickListener {

    Button b2;
    EditText edt3, edt4, edt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b2= (Button) findViewById(R.id.regisbtn);
        edt3=(EditText) findViewById(R.id.fulledt);
        edt4=(EditText) findViewById(R.id.emailedt);
        edt5=(EditText) findViewById(R.id.passwordedt);

        b2.setOnClickListener(this);


    }


    public void onClick(View view) {
        if(edt3.getText().toString().length()==0){
            edt3.setError("Fullname not entered");
            edt3.requestFocus();
        }
        if(edt4.getText().toString().length()==0){
            edt4.setError("email not entered");
            edt4.requestFocus();
        }
        if(edt5.getText().toString().length()==0){
            edt5.setError("Password not entered");
            edt5.requestFocus();
        }
        Toast.makeText(getApplicationContext(),"User Registered", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
