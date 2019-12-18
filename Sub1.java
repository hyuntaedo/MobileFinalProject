package com.example.tp_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sub1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
    }

    public void White(View view) {
        Intent intent = new Intent(this, Sub2.class);
        startActivity(intent);
    }

    public void Black(View view) {
        Intent intent = new Intent(this, Sub3.class);
        startActivity(intent);
    }
}
