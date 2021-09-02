package com.example.pyatnashkiigra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WinActivity extends AppCompatActivity {

    private AppCompatButton btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        btnRestart = findViewById(R.id.btn_restart_win);
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WinActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

}