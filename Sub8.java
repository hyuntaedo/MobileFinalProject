package com.example.tp_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sub8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub8);
        Handler timer = new Handler();
        timer.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Sub8.this, Sub12.class);
                startActivity(intent);
                finish();
            }
        },30000);
    }
    public void onBackPressed() {
        //super.onBackPressed();
    }

    public void Confirm1_4(View view) {
        EditText text = findViewById(R.id.editText1_4);
        if(text.getText().toString().equals("eee")){
            Toast.makeText(this, "정답입니다", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, Sub10.class));
        }
        else{
            Toast.makeText(this, "오답입니다", Toast.LENGTH_SHORT).show();
        }

    }
}
