package com.example.foodrescue;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterationActivity extends AppCompatActivity {



    Button signInButton;
    Button rescueFood;
    Button donateFood;

    Button donateToUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Feed The Belly");

        signInButton = findViewById(R.id.signInButton);
        donateFood = findViewById(R.id.donateButton);
        rescueFood=findViewById(R.id.rescueButton);
        donateToUs = findViewById(R.id.paypalButton);

        donateToUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RegisterationActivity.this, PaypalPayment.class);
                startActivity(myIntent);
            }
        });

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(RegisterationActivity.this, MainActivity.class);
                startActivity(myIntent);


            }
        });
        donateFood.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v1){

                Intent myIntent = new Intent(RegisterationActivity.this,Login_Activity_Rest.class);
                startActivity(myIntent);


            }

        });


        rescueFood.setOnClickListener((View view)->{
            startActivity(new Intent(RegisterationActivity.this,login_Activity_ngo.class));
        });
    }


}
