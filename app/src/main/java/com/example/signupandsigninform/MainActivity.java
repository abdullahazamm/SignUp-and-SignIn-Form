package com.example.signupandsigninform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SignUpForm();
        SignInConfrmation();

    }

    public void SignUpForm(){

        Button signupbtn=findViewById(R.id.signupbtn);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView ortextview=findViewById(R.id.ortextview);
                Button signinbtn=findViewById(R.id.signinbtn);
                CardView signupformcard=findViewById(R.id.signupformcard);


                ortextview.setVisibility(View.GONE);
                signinbtn.setVisibility(View.GONE);
                signupformcard.setVisibility(View.VISIBLE);
            }
        });
    }


    public void SignInConfrmation(){

            Button signincardbtn=findViewById(R.id.signincardbtn);
            signincardbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(),"Sign In Successfully",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this,ConfirmartionMessageScreen.class);
                    startActivity(intent);
                    finish();
                }
            });
    }
}