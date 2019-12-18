package com.example.tp_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sub2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        Handler timer = new Handler();
        timer.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Sub2.this, Sub12.class);
                startActivity(intent);
                finish();
            }
        },15000);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    public void Confirm(View view) {
        EditText text = findViewById(R.id.editText1);
        if(text.getText().toString().equals("aaa")){
            Toast.makeText(this, "정답입니다", Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, Sub4.class));
        }
        else{
            Toast.makeText(this, "오답입니다",Toast.LENGTH_LONG).show();
        }
    }
}
