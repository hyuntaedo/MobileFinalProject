package com.example.tp_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sub6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub6);
        Handler timer = new Handler();
        timer.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Sub6.this, Sub12.class);
                startActivity(intent);
                finish();
            }
        },30000);
    }
    public void onBackPressed() {
        //super.onBackPressed();
    }

    public void Confirm1_3(View view) {
        EditText text = findViewById(R.id.editText1_3);
        if(text.getText().toString().equals("ddd")){
            Toast.makeText(this, "정답입니다", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, Sub8.class));
        }
        else{
            Toast.makeText(this, "오답입니다.", Toast.LENGTH_SHORT).show();
        }
    }
}

