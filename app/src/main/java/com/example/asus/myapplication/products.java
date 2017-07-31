package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.net.Uri;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class products extends MainActivity{



    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        Button Panasonic = (Button) findViewById(R.id.button11);
        Panasonic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/panasonic/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button Baumer = (Button) findViewById(R.id.button10);
        Baumer.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/baumer/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button Moog = (Button) findViewById(R.id.button7);
        Moog.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/moog/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button Kubler = (Button) findViewById(R.id.button9);
        Kubler.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/kubler/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button Proface = (Button) findViewById(R.id.button12);
        Proface.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/proface/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button Cognex = (Button) findViewById(R.id.button14);
        Cognex.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/cognex/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button Bosch = (Button) findViewById(R.id.button16);
        Bosch.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/bosch/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button VST = (Button) findViewById(R.id.button17);
        VST.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/vst/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button Schmidt = (Button) findViewById(R.id.button18);
        Schmidt.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/schmidt-technology/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button Novotechnik = (Button) findViewById(R.id.button19);
        Novotechnik.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/novotechnik/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button Katoro = (Button) findViewById(R.id.button20);
        Katoro.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.kantodenshi.co.jp/products.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button Exone = (Button) findViewById(R.id.button21);
        Exone.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/exone/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button Matsushima = (Button) findViewById(R.id.button13);
        Matsushima.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://supra-engineering.com/brand/matsushima/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });















    }



    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("products Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
