package com.example.pyatnashkiigra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class FinishActivity extends AppCompatActivity {

    private AppCompatButton btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        btnRestart = findViewById(R.id.btn_restart_finish);
        btnRestart.setOnClickListener(v -> {
            Intent i = new Intent(FinishActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        });
    }

}