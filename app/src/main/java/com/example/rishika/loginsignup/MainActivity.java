package com.example.rishika.loginsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2;
    EditText edt1, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.lgnbtn);
        b2=(Button)  findViewById(R.id.signbtn);
        edt1 = (EditText) findViewById(R.id.useredt);
        edt2 = (EditText) findViewById(R.id.pwdedt);

        b1.setOnClickListener(this);



    }


    public void onClick(View view) {

        if (view.getId() == R.id.lgnbtn) {
            String user = edt1.getText().toString();
            String password = edt2.getText().toString();
            if (user.equalsIgnoreCase("rishika") && password.equals("rishika")) {

                Toast.makeText(this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
            }

            else{
                Toast.makeText(this, "WRONG USERNAME OR PASSWORD", Toast.LENGTH_SHORT).show();
            }
        }

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,secondActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
