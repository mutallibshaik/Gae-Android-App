package com.example.firstgameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2Activity extends AppCompatActivity {

    private Button btnGameB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);


        btnGameB = (Button) findViewById(R.id.gameB);
        btnGameB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGameBStartPage();
            }
        });
    }
    public void openGameBStartPage(){
        Intent intent = new Intent(this, GamebActivity.class);
        startActivity(intent);
    }
}