package com.example.projecteandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);

        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);

        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);

        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(this);
    }

    public void onClick(View v) {

        if(v.getId() == R.id.b1){
            Intent intent = new Intent(this, Restaurantes.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.b2){
            Intent intent2 = new Intent(this, Movies.class);
            startActivity(intent2);
        }
        else if(v.getId() == R.id.b3){
            Intent intent3 = new Intent (this, Hoteles.class);
            startActivity(intent3);
        }else if(v.getId() == R.id.b4){
            Intent intent4 = new Intent (this, Transport.class);
            startActivity(intent4);
        }
    }
}