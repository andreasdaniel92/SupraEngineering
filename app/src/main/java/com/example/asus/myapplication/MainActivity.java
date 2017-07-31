package com.example.asus.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button products = (Button) findViewById(R.id.button4);
        products.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.example.asus.myapplication.products.class));
            }
        });

        Button aboutus = (Button) findViewById(R.id.button3);
        aboutus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.example.asus.myapplication.About_us.class));
            }
        });

        Button contactus = (Button) findViewById(R.id.button8);
        contactus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.example.asus.myapplication.contact_us.class));
            }
        });

    }



    @Override
    public void onStart() {
        super.onStart();


    }

    @Override
    public void onStop() {
        super.onStop();


    }
}

