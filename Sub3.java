package com.example.tp_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sub3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        Handler timer = new Handler();
        timer.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Sub3.this, Sub12.class);
                startActivity(intent);
                finish();
            }
        },30000);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    public void Confirm2(View view) {
        EditText text = findViewById(R.id.editText2);
        if(text.getText().toString().equals("bbb")){
            Toast.makeText(this, "정답입니다", Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, Sub5.class));
        }
        else{
            Toast.makeText(this, "오답입니다", Toast.LENGTH_SHORT).show();
        }
    }
}
