package com.example.tp_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sub10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub10);
        Handler timer = new Handler();
        timer.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Sub10.this, Sub12.class);
                startActivity(intent);
                finish();
            }
        },30000);
    }
    public void onBackPressed() {
        //super.onBackPressed();
    }

    public void Confirm1_5(View view) {
        EditText text = findViewById(R.id.editText1_5);
        if(text.getText().toString().equals("fff")){
            Toast.makeText(this, "다시 돌아가시오!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, Sub1.class));
        }
        else{
            Toast.makeText(this, "오답입니다.", Toast.LENGTH_SHORT).show();
        }

    }
}
