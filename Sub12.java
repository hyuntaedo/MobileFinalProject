package com.example.tp_game;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class Sub12 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub12);
    }
    public void onBackPressed() {
        //super.onBackPressed();
    }

    public void retryButton(View view) {
        Intent intent = new Intent(this, Sub1.class);
        startActivity(intent);
    }
}
