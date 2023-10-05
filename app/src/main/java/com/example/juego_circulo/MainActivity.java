package com.example.juego_circulo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button yellow1, yellow2, orange1, orange2, purple1, purple2;
    private TextView blue1, blue2, red1, red2, green1, green2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yellow1 = findViewById(R.id.btn_yellow1);
        yellow2 = findViewById(R.id.btn_yellow2);
        orange1 = findViewById(R.id.btn_orange1);
        orange2 = findViewById(R.id.btn_orange);
        purple1 = findViewById(R.id.btn_purple1);
        purple2 = findViewById(R.id.btn_purple2);

        blue1 = findViewById(R.id.tv_blue1);
        blue2 = findViewById(R.id.tv_blue2);
        green1 = findViewById(R.id.tv_green1);
        green2 = findViewById(R.id.tv_green2);
        red1 = findViewById(R.id.tv_red1);
        red2 = findViewById(R.id.tv_red2);



        yellow2.setOnClickListener(view -> {
            limpia();
            yellow2.setText("YELLOW");
            yellow2.setTextColor(Color.BLACK);
        });

        yellow1.setOnClickListener(view -> {
            limpia();
            yellow1.setText("YELLOW");
            yellow1.setTextColor(Color.BLACK);
        });

        blue1.setOnClickListener(view -> {
            limpia();
            blue1.setText("BLUE");
            blue1.setTextColor(Color.WHITE);
        });

        blue2.setOnClickListener(view -> {
            limpia();
            blue2.setText("BLUE");
            blue2.setTextColor(Color.WHITE);
        });

        purple1.setOnClickListener(view -> {
            limpia();
            purple1.setText("PURPLE");
            purple1.setTextColor(Color.WHITE);
        });

        purple2.setOnClickListener(view -> {
            limpia();
            purple2.setText("PURPLE");
            purple2.setTextColor(Color.WHITE);
        });

        green1.setOnClickListener(view -> {
            limpia();
            green1.setText("GREEN");
            green1.setTextColor(Color.WHITE);
        });

        green2.setOnClickListener(view -> {
            limpia();
            green2.setText("GREEN");
            green2.setTextColor(Color.WHITE);
        });

        orange1.setOnClickListener(view -> {
            limpia();
            orange1.setText("ORANGE");
            orange1.setTextColor(Color.WHITE);
        });

        orange2.setOnClickListener(view -> {
            limpia();
            orange2.setText("ORANGE");
            orange2.setTextColor(Color.WHITE);
        });

        red1.setOnClickListener(view -> {
            limpia();
            red1.setText("RED");
            red1.setTextColor(Color.WHITE);
        });

        red2.setOnClickListener(view -> {
            limpia();
            red2.setText("RED");
            red2.setTextColor(Color.WHITE);
        });
    }
    public void limpia(){
        yellow1.setText("");
        yellow2.setText("");
        orange1.setText("");
        orange2.setText("");
        purple1.setText("");
        purple2.setText("");
        blue1.setText("");
        blue2.setText("");
        green1.setText("");
        green2.setText("");
        red1.setText("");
        red2.setText("");

    }
}