package com.example.foodrescue;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Restaurant_Dashboard extends AppCompatActivity {
    CardView cardHome;
    CardView cardAdd;
    CardView cardMenu;
    CardView cardLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant__dashboard);
        ActionBar myBar = getSupportActionBar();
        myBar.setTitle("Restaurant Dashboard");

        cardHome=findViewById(R.id.cardHome);
        cardAdd=findViewById(R.id.cardAdd);
        cardMenu=findViewById(R.id.cardListItems);
        cardLogout=findViewById(R.id.cardLogout);

        cardHome.setOnClickListener((View view)->{

            Intent i = getIntent();
            //Detail details = (Detail)i.getSerializableExtra("Details");
           // User user = (User)i.getSerializableExtra("User");
            String email = i.getStringExtra("Email");
            Intent myIntent = new Intent(Restaurant_Dashboard.this, restaurant_profile.class);
           // myIntent.putExtra("Details", details);
            //myIntent.putExtra("User", user);
            myIntent.putExtra("Email", email);
            startActivity(myIntent);



        });
        cardAdd.setOnClickListener((View view)->{
            Intent i = getIntent();
            String email = i.getStringExtra("Email");
            Detail details = (Detail)i.getSerializableExtra("Details");
            User user = (User)i.getSerializableExtra("User");
            Intent myIntent = new Intent(Restaurant_Dashboard.this, Restaurant_starter.class);
            myIntent.putExtra("Details", details);
            myIntent.putExtra("User", user);
            myIntent.putExtra("Email", email);
            startActivity(myIntent);
        });

        cardMenu.setOnClickListener((View view)->{
            Intent i = getIntent();
            String email = i.getStringExtra("Email");
            Intent intent = new Intent(getApplicationContext(),recyclerViewActivity_Restaurant.class);
            intent.putExtra("Email", email);
            startActivity(intent);
        });

        cardLogout.setOnClickListener((View view)->{
            Intent myIntent = new Intent(Restaurant_Dashboard.this, MainActivity.class);
            startActivity(myIntent);
        });
    }
}