package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("ConteudoMsg");

        TextView txtMsgJogo = findViewById(R.id.textViewMsgJogo);
        txtMsgJogo.setText(msg);

        Button btnFechar = findViewById(R.id.buttonFechar);
        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        Button btnJogar = findViewById(R.id.buttonJogar);
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mItPrincipal = new Intent(v.getContext(), MainActivity.class);
                v.getContext().startActivity(mItPrincipal);
                finish();
            }
        });
    }
}